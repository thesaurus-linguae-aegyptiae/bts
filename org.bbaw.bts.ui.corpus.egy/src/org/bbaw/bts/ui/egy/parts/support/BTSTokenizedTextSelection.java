package org.bbaw.bts.ui.egy.parts.support;

import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSText;
import org.bbaw.bts.corpus.btsCorpusModel.BTSTextContent;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;

public class BTSTokenizedTextSelection {

	private List<BTSIdentifiableItem> tokenSequence;

	public int x;
	public int y;
	
	private BTSTextEditorController textEditorController;

	/**
	 * Check if all of the given sentence's elements occur in the given list of items as well. 
	 * @param sentence
	 * @param itemList
	 * @return true if the list contains all of the sentence's items 
	 */
	private static boolean isEntireSentenceInList(BTSSenctence sentence, List<BTSIdentifiableItem> itemList) {
		for (BTSSentenceItem item : sentence.getSentenceItems()) {
			if (!itemList.contains(item)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Sort elements of item list in such a way that every smaller object is preceded by its container,
	 * e.g. if item list contains both a sentence object and its word-level tokens, the sentence object
	 * comes first.
	 * @param itemList
	 */
	private static void sortItems(final List<BTSIdentifiableItem> itemList) {
		// make sure sentence objects come before their own tokens
		itemList.sort(new Comparator<BTSIdentifiableItem>() {
			@Override
			public int compare(BTSIdentifiableItem o1, BTSIdentifiableItem o2) {
				if (o1.eContainer().equals(o2)) {
					return 1;
				}
				if (o2.eContainer().equals(o1)) {
					return -1;
				}
				return itemList.indexOf(o1) - itemList.indexOf(o2);
			}
		});
	}

	/**
	 * go through list and make sure that no item is present at the same time as its container.
	 * @param itemList
	 * @return
	 */
	private static List<BTSIdentifiableItem> filterItems(List<BTSIdentifiableItem> itemList) {
		// iterate through selected items
		// if item is sentence, remove its sentence items if all of them are present
		// but if not all of them are present, remove sentence and leave items
		List<BTSIdentifiableItem> filteredSelection = new Vector<>();
		for (BTSIdentifiableItem item : itemList) {
			if (item instanceof BTSSenctence) {
				// check if ALL of its items are within selection
				if (isEntireSentenceInList((BTSSenctence)item, 
						itemList)) {
					filteredSelection.add(item);
				}
			} else if (item instanceof BTSSentenceItem) {
				// if containing sentence is already in filtered selection list, we don't need to add item
				if (!filteredSelection.contains(item.eContainer())) {
					filteredSelection.add(item);
				}
			}
		}
		return filteredSelection;
	}

	/**
	 * constructor
	 * @param textSelectionEvent
	 */
	public BTSTokenizedTextSelection(BTSTextSelectionEvent textSelectionEvent, BTSTextEditorController textEditorController) {

		this.textEditorController = textEditorController;

		this.x = textSelectionEvent.x;
		this.y = textSelectionEvent.y;

		List<BTSIdentifiableItem> selectedItems = textSelectionEvent.getSelectedItems();
		sortItems(selectedItems);

		tokenSequence = filterItems(selectedItems);
		
	}

	public List<BTSIdentifiableItem> getSelectedItems() {
		return this.tokenSequence;
	}

	public int getCharacterCount() {
		return this.y - this.x;
	}

	public void insertTextSelectionItems(Object itemAtInsertPosition) throws Exception {
		if (itemAtInsertPosition instanceof BTSText) {
			//insertTextSelectionAtText(copiedItems, (BTSText)itemAtInsertPosition);
		} else if (itemAtInsertPosition instanceof BTSSenctence) {
			insertTextSelectionAtSentence(this.tokenSequence, (BTSSenctence)itemAtInsertPosition);
		} else if (itemAtInsertPosition instanceof BTSSentenceItem) {
			insertTextSelectionAtSentenceItem(this.tokenSequence, (BTSSentenceItem)itemAtInsertPosition);
		} else {
			throw new Exception("Could not determine model object at insertion position.");
		}
	}

	/**
	 * insert a list of BTS editor text model elements at a specified sentence object
	 */
	private void insertTextSelectionAtSentence(List<BTSIdentifiableItem> copiedItems, BTSSenctence itemAtPosition) {
		BTSTextContent textContainer = (BTSTextContent)itemAtPosition.eContainer();
		int lineNumber = textContainer.getTextItems().indexOf(itemAtPosition);
		int position = 0;

		for (BTSIdentifiableItem item : copiedItems) {

			if (item instanceof BTSSenctence) {

				if (position > 0) {
					lineNumber++;
					position = 0;
				}
				lineNumber = insertSentenceIntoTextContentAtPosition(textContainer, 
						textEditorController.copySentence((BTSSenctence)item), lineNumber);

			} else if (item instanceof BTSSentenceItem) {

				// if this seems to be the first uncontained sentence item since beginning of insertion or since the latest sentence object,
				// create a new sentence object and insert it at the current 
				if (position < 1) {
					insertSentenceIntoTextContentAtPosition(textContainer, textEditorController.createSentence(), lineNumber);
				}

				BTSSenctence currentSentence = (BTSSenctence)textContainer.getTextItems().get(lineNumber);
				position = insertTokenIntoSentenceContentAtPosition(currentSentence, (BTSSentenceItem) item, position);

			}
		}
	}

	/**
	 * inserts a copy of a given sentence item right into the targetet sentence in front of the specified position.
	 */
	private int insertTokenIntoSentenceContentAtPosition(BTSSenctence currentSentence, BTSSentenceItem item, int position) {
		if (item != null) {
			if (position < currentSentence.getSentenceItems().size()) {
				currentSentence.getSentenceItems().add(position, 
						textEditorController.copySentenceItem((BTSSentenceItem) item));
			} else {
				currentSentence.getSentenceItems().add(
						textEditorController.copySentenceItem((BTSSentenceItem) item));
			}
			position++;
		}
		return position;
	}



	/**
	 * insert BTS editor text model elements at a specified sentence token.
	 */
	private void insertTextSelectionAtSentenceItem(List<BTSIdentifiableItem> copiedItems, BTSSentenceItem itemAtPosition) {
		// items we want to insert
		BTSSenctence currentSentence = (BTSSenctence)itemAtPosition.eContainer();
		// retrieve textcontent object owning sentence items
		BTSTextContent textContainer = (BTSTextContent)currentSentence.eContainer();
		// determine index of sentence where insertion cursor currently is and move on to next sentence 
		int lineNumber = textContainer.getTextItems().indexOf(currentSentence);

		// determine cursor position within sentence 
		int position = currentSentence.getSentenceItems().indexOf(itemAtPosition);

		// loop through items to be copied at this position
		for (BTSIdentifiableItem item : copiedItems) {

			// if next item to be copied into text is a sentence token,
			// just insert it into sentence object where insertion cursor currently is 
			if (item instanceof BTSSentenceItem) {
				//setDirtyInternal();

				// determine original text content sentence object at insertion cursor
				if (lineNumber < textContainer.getTextItems().size()) {
					currentSentence = (BTSSenctence)textContainer.getTextItems().get(lineNumber);
				} else {
					currentSentence = textEditorController.createSentence();
					textContainer.getTextItems().add(currentSentence);
				}

				position = insertTokenIntoSentenceContentAtPosition(currentSentence, (BTSSentenceItem) item, position);
			}

			// if an entiren sentence object needs to be inserted next:

			else if (item instanceof BTSSenctence) {

				BTSSenctence cutOffSentencePart = null;
				// split current sentence into two if we are currently somewhere in the middle of it
				if (position > 0) {
					//setDirtyInternal();

					cutOffSentencePart = textEditorController.createSentence();
				 	// put remaining tokens of current sentence as of current index into new sentence
					while (position < currentSentence.getSentenceItems().size()) {
						cutOffSentencePart.getSentenceItems().add(
								currentSentence.getSentenceItems().remove(position));
					}
					// if we had to cut, move insertion cursor to next line
					lineNumber++;
				}

				// take the sentence object from clipboard and squeeze it right in front of the line the insertion cursor is now in
				lineNumber = insertSentenceIntoTextContentAtPosition(textContainer,
						textEditorController.copySentence((BTSSenctence)item),
						lineNumber);

				// if we end up inserting the copied sentence object right into another sentence that was already there,
				// shove the cut-off part right in front of the next line
				insertSentenceIntoTextContentAtPosition(textContainer,
						cutOffSentencePart, lineNumber);

				// since we inserted at least one entire sentence, insertion cursor is now at the beginning of its line
				position = 0;
			}
		}
	}

	/**
	 * inserts given sentence object right above the specified line, provided given sentence is not empty.
	 * Returns new line number where insertion cursor is gotta be after the operation. 
	 * @param textContainer
	 * @param sentence
	 * @param lineNumber
	 * @return
	 */
	private int insertSentenceIntoTextContentAtPosition(BTSTextContent textContainer, BTSSenctence sentence, int lineNumber) {
		if (sentence != null && sentence.getSentenceItems().size() > 0) {
			//setDirtyInternal();
			if (lineNumber < textContainer.getTextItems().size()) {
				textContainer.getTextItems().add(lineNumber,
						sentence);
			} else {
				textContainer.getTextItems().add(sentence);
			}
			// move cursor one line down in order to keep up with the original content we currently keep pushing in front of us
			lineNumber++;
		}
		return lineNumber;
	}
}
