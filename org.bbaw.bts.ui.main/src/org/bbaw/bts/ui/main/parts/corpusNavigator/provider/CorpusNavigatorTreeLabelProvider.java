package org.bbaw.bts.ui.main.parts.corpusNavigator.provider;

import java.util.Set;

import javax.inject.Inject;

import org.bbaw.bts.btsmodel.BTSCorpusObject;
import org.bbaw.bts.btsmodel.BTSText;
import org.bbaw.bts.ui.resources.BTSResourceProvider;
import org.eclipse.core.databinding.observable.map.IMapChangeListener;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.map.MapChangeEvent;
import org.eclipse.e4.tools.services.IResourcePool;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Image;

public class CorpusNavigatorTreeLabelProvider extends StyledCellLabelProvider
{

	@Inject
	IResourcePool workbenchresourcess;
	private TreeViewer myViewer = null;

	private IMapChangeListener mapChangeListener = new IMapChangeListener()
	{

		@Override
		public void handleMapChange(MapChangeEvent event)
		{
			Set<?> affectedElements = event.diff.getChangedKeys();
			if (!affectedElements.isEmpty())
			{
				LabelProviderChangedEvent newEvent = new LabelProviderChangedEvent(
						CorpusNavigatorTreeLabelProvider.this, affectedElements.toArray());
				fireLabelProviderChanged(newEvent);
			}

		}
	};

	public CorpusNavigatorTreeLabelProvider(IObservableMap[] attributeMaps)
	{
		if (attributeMaps != null)
		{
			for (int i = 0; i < attributeMaps.length; i++)
			{
				attributeMaps[i].addMapChangeListener(mapChangeListener);
			}
		}
	}

	@Override
	public String getToolTipText(Object element)
	{
		return "#dummy#";
	}

	@Override
	public void update(ViewerCell cell)
	{
		if (cell.getElement() instanceof BTSCorpusObject)
		{
			BTSCorpusObject p = (BTSCorpusObject) cell.getElement();

			StyledString styledString = new StyledString(p.getName() != null ? p.getName() : "*noname*", null);
			String decoration = " deco";
			styledString.append(decoration, StyledString.COUNTER_STYLER);
			cell.setText(styledString.getString());
			cell.setImage(getImage(p));
			cell.setStyleRanges(styledString.getStyleRanges());
		}

	}

	public Image getImage(Object element)
	{
		if (element instanceof BTSCorpusObject && !((BTSCorpusObject) element).getRelations().isEmpty())
		{
			return getImage(BTSResourceProvider.IMG_CAPTION_OBJECT);
		} else if (element instanceof BTSText)
		{
			return getImage(BTSResourceProvider.IMG_TEXT_OBJECT);
		} else
		{
			return getImage(BTSResourceProvider.IMG_TCOBJECT);
		}
	}

	// Helper Method to load the images
	private Image getImage(String imageKey)
	{

		return null;

		// resoucePool.getImageUnchecked(imageKey);

	}

	public String getText(Object element)
	{
		if (element instanceof BTSCorpusObject)
		{
			BTSCorpusObject o = (BTSCorpusObject) element;
			if (o.getPassport() != null && o.getName() != null && o.getName().trim().length() > 0)
			{
				return o.getName();
			}
			return ((BTSCorpusObject) element).get_id().toString();
		}
		return element.toString();
	}

}
