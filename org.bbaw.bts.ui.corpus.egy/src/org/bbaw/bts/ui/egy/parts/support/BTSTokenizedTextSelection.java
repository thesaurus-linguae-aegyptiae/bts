package org.bbaw.bts.ui.egy.parts.support;

import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import org.bbaw.bts.btsmodel.BTSIdentifiableItem;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSenctence;
import org.bbaw.bts.corpus.btsCorpusModel.BTSSentenceItem;
import org.bbaw.bts.ui.commons.corpus.events.BTSTextSelectionEvent;

public class BTSTokenizedTextSelection {

	private List<BTSIdentifiableItem> tokenSequence;

	public int x;
	public int y;

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
	public BTSTokenizedTextSelection(BTSTextSelectionEvent textSelectionEvent) {

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
}
