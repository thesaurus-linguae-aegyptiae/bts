package org.bbaw.bts.ui.egy.parts.egyTextEditor;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Collections;

import org.bbaw.bts.btsmodel.BTSAmbivalence;
import org.bbaw.bts.btsmodel.BTSAmbivalenceItem;
import org.bbaw.bts.btsmodel.BTSLemmaCase;
import org.bbaw.bts.btsmodel.BTSMarker;
import org.bbaw.bts.btsmodel.BTSSenctence;
import org.bbaw.bts.btsmodel.BTSSentenceItem;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.btsmodel.BTSTextContent;
import org.bbaw.bts.btsmodel.BTSTextItems;
import org.bbaw.bts.btsmodel.BTSWord;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.core.corpus.controller.partController.BTSTextEditorController;
import org.bbaw.bts.corpus.text.btsdsl.BTSStandaloneSetup;
import org.bbaw.bts.corpus.text.btsdsl.ui.internal.BTSActivator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.util.StringInputStream;

import com.google.inject.Injector;

public class BTSTextXtextEditedResourceProvider implements IEditedResourceProvider
{
	private BTSText text;
	private Document document;

	private BTSTextEditorController controller;
	private IAnnotationModel annotationModel;

	public BTSTextXtextEditedResourceProvider()
	{
		BTSStandaloneSetup.doSetup();
	}

	@Override
	public XtextResource createResource()
	{
		BTSStandaloneSetup.doSetup();

		if (text != null) {
			Document doc = new Document();
			this.document = doc;

			IAnnotationModel model = new AnnotationModel();
			this.annotationModel = model;
			controller.transformToDocument(text, doc, model);
			XtextResource res = createResource(doc.get());
			return res;
			// try {
			// if (text.getTextContent() == null) {
			// text.setTextContent(BtsmodelFactory.eINSTANCE
			// .createBTSTextContent());
			// }
			// BTSTextContent textContent = copyTransformedContent(text
			// .getTextContent());
			// // text.getTextContent().getTextItems().clear();
			// // BTSAmbivalence marker = BtsmodelFactory.eINSTANCE
			// // .createBTSAmbivalence();
			// // marker.set_id(null);
			// //
			// marker.eUnset(BtsmodelPackage.Literals.BTS_IDENTIFIABLE_ITEM__ID);
			// // // marker.setName("Hallo");
			// // // BTSSenctence marker = BtsmodelFactory.eINSTANCE
			// // // .createBTSSenctence();
			// // // // marker.setName("Hallo");
			// // // // marker.set_id(null);
			// // text.getTextContent().getTextItems().add(marker);
			// XtextResource xtextResource =
			// createVirtualXtextResource(textContent);
			// // Populate virtual resource with the given semantic element to
			// // edit
			// // xtextResource.getContents().add(text.getTextContent());
			// // save to create file
			// // TODO remove crappy hack
			// xtextResource.save(Collections.emptyMap());
			//
			// // Save and reparse in order to initialize virtual Xtext
			// // resource
			// ByteArrayOutputStream out = new ByteArrayOutputStream();
			// xtextResource.save(out, Collections.emptyMap());
			// xtextResource.reparse(new String(out.toByteArray()));
			// return xtextResource;
			// } catch (IOException e1) {
			// // TODO Auto-generated catch block
			// e1.printStackTrace();
			// }
		}

		try {
			BTSStandaloneSetup.doSetup();
			ResourceSet resourceSet = new ResourceSetImpl();
			String fname = "E:/AAEW/test/runtime-EclipseXtext/tt/btstest.bts";
			File f = new File(fname);
			if (f.exists())
 {
				System.out.println("TOLL");
				final OutputStream os = new FileOutputStream(f);
				final PrintStream printStream = new PrintStream(os);
				if (document != null) {
					printStream.print(">>ddd dddd ddd<<");
				}
				printStream.close();
			}
			Resource resource = resourceSet
					.createResource(URI.createURI(fname));

			// System.out.println(resource.g);
			return (XtextResource) resource;
		} catch (Exception e) {
			return null;
		}

	}

	private BTSTextContent copyTransformedContent(BTSTextContent textContent) {
		BTSTextContent newtextContent = BtsmodelFactory.eINSTANCE
				.createBTSTextContent();
		for (BTSTextItems item : textContent.getTextItems()) {
			newtextContent.getTextItems().add(
					copyTransform((BTSSenctence) item));
		}
		return newtextContent;
	}

	private BTSSenctence copyTransform(BTSSenctence sentence) {
		BTSSenctence newSentence = BtsmodelFactory.eINSTANCE
				.createBTSSenctence();
		for (BTSSentenceItem item : sentence.getSentenceItems()) {
			if (item instanceof BTSWord) {
				newSentence.getSentenceItems().add(
						copyTransform((BTSWord) item));
			} else if (item instanceof BTSMarker) {
				newSentence.getSentenceItems().add(
						copyTransform((BTSMarker) item));
			} else if (item instanceof BTSAmbivalence) {
				newSentence.getSentenceItems().add(
						copyTransform((BTSAmbivalence) item));
			}
		}
		return newSentence;
	}

	private BTSWord copyTransform(BTSWord word) {
		BTSWord newWord = BtsmodelFactory.eINSTANCE.createBTSWord();
		newWord.setWChar(word.getWChar());
		return newWord;
	}

	private BTSMarker copyTransform(BTSMarker marker) {
		BTSMarker newMarker = BtsmodelFactory.eINSTANCE.createBTSMarker();
		newMarker.setValue(marker.getValue());
		return newMarker;
	}

	private BTSAmbivalence copyTransform(BTSAmbivalence ambivalence) {
		BTSAmbivalence newAmbivalence = BtsmodelFactory.eINSTANCE
				.createBTSAmbivalence();
		for (BTSLemmaCase lcase : ambivalence.getCases()) {
			newAmbivalence.getCases().add(copyTransform(lcase));
		}
		return newAmbivalence;
	}

	private BTSLemmaCase copyTransform(BTSLemmaCase lcase) {
		BTSLemmaCase newCase = BtsmodelFactory.eINSTANCE.createBTSLemmaCase();
		newCase.setName(lcase.getName());
		for (BTSAmbivalenceItem item : lcase.getScenario()) {
			if (item instanceof BTSWord) {
				newCase.getScenario().add(copyTransform((BTSWord) item));
			} else if (item instanceof BTSMarker) {
				newCase.getScenario().add(copyTransform((BTSMarker) item));
			}
		}
		return newCase;
	}

	public BTSText getText()
	{
		return text;
	}

	public void setText(BTSText text)
	{
		this.text = text;
	}

	public void setDocument(Document doc) {
		this.document = doc;

	}

	private XtextResource createVirtualXtextResource(EObject semanticElement)
			throws IOException {
		BTSActivator activator = BTSActivator.getInstance();
		Injector xtextInjector = activator
				.getInjector(BTSActivator.ORG_BBAW_BTS_CORPUS_TEXT_BTSDSL_BTS);
		IResourceFactory resourceFactory = xtextInjector
				.getInstance(IResourceFactory.class);
		XtextResourceSet rs = xtextInjector.getInstance(XtextResourceSet.class);
		rs.setClasspathURIContext(getClass());
		URI uri = createURI(semanticElement);
		// Create virtual resource
		XtextResource xtextVirtualResource = (XtextResource) resourceFactory
				.createResource(uri);
		rs.getResources().add(xtextVirtualResource);

		// Populate virtual resource with the given semantic element to edit
		xtextVirtualResource.getContents().add(semanticElement);
		// save to create file
		// TODO remove crappy hack
		// xtextVirtualResource.save(Collections.emptyMap());

		// Save and reparse in order to initialize virtual Xtext resource
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		xtextVirtualResource.save(out, Collections.emptyMap());
		xtextVirtualResource.reparse(new String(out.toByteArray()));

		return xtextVirtualResource;
	}

	private URI createURI(EObject semanticElement) {
		// FIXME remove crappy code and use in memory resource
		// URI uri =
		// URI.createURI("XtextResource.ram");createPlatformResourceURI

		URI uri = URI.createURI(
				"file://E:/AAEW/test/runtime-EclipseXtext/tt/btstest.bts",
				false);
		return uri;
	}

	private XtextResource createResource(String content) {
		XtextResource result = createResource();
		try {
			result.load(new StringInputStream(content, result.getEncoding()),
					Collections.emptyMap());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	public BTSTextEditorController getController() {
		return controller;
	}

	public void setController(BTSTextEditorController controller) {
		this.controller = controller;
	}

}
