package org.bbaw.bts.modelUtils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.bbaw.bts.btsmodel.DBLease;
import org.bbaw.bts.btsviewmodel.TreeNodeWrapper;
import org.bbaw.bts.commons.BTSConstants;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipselabs.emfjson.EMFJs;
import com.google.gson.Gson;

public class EmfModelHelper
{

	public static <T extends EObject> T mergeChanges(T target, T objectWithChanges)
	{
		Copier copier = new Copier();
		for (int i = 0, size = target.eClass().getFeatureCount(); i < size; ++i)
		{
			EStructuralFeature eStructuralFeature = target.eClass().getEStructuralFeature(i);
			if (eStructuralFeature.isChangeable() && !eStructuralFeature.isDerived())
			{
				if (eStructuralFeature instanceof EAttribute)
				{
//					if (eStructuralFeature.getName().equals("name"))
//					{
//						System.out.println("name");
//					}
					copyAttribute((EAttribute) eStructuralFeature, objectWithChanges, target, copier);
				} else
				{
					EReference eReference = (EReference) eStructuralFeature;
					if (eReference.isContainment())
					{
						copyContainment(eReference, objectWithChanges, target, copier);
					}
				}
			}
		}
		return (T) target;
	}

	/**
	 * Called to handle the copying of a containment feature; this adds a list
	 * of copies or sets a single copy as appropriate for the multiplicity.
	 * 
	 * @param eReference
	 *            the feature to copy.
	 * @param eObject
	 *            the object from which to copy.
	 * @param copyEObject
	 *            the object to copy to.
	 * @param copier
	 */
	protected static void copyContainment(EReference eReference, EObject objectWithChanges, EObject target,
			Copier copier)
	{
		if (!eReference.isTransient() && !(!target.eIsSet(eReference) && !objectWithChanges.eIsSet(eReference)))
		{
			if (eReference.isMany())
			{
				@SuppressWarnings("unchecked")
				List<EObject> source = (List<EObject>) objectWithChanges.eGet(eReference);
				@SuppressWarnings("unchecked")
				List<EObject> target2 = (List<EObject>) target.eGet(getTarget(eReference));
				if (source.isEmpty())
				{
					target2.clear();
				} else
				{
					mergeAll(target2, source);
				}
			} else
			{
				if (objectWithChanges.eIsSet(eReference) && target.eIsSet(eReference))
				{
					if (!objectWithChanges.eGet(eReference).equals(target.eGet(eReference)))
					{
						EObject childEObjectWithChanges = (EObject) objectWithChanges.eGet(eReference);
						EObject childEObjectTarget = (EObject) target.eGet(eReference);
						childEObjectTarget = mergeChanges(childEObjectTarget, childEObjectWithChanges);
						target.eSet(getTarget(eReference), childEObjectTarget);
					}
				} else if (objectWithChanges.eIsSet(eReference))
				{
					EObject childEObject = (EObject) objectWithChanges.eGet(eReference);
					target.eSet(getTarget(eReference), childEObject == null ? null : copier.copy(childEObject));
				} else
				{
					target.eSet(getTarget(eReference), null);
				}

			}
		}
	}

	private static void mergeAll(List<EObject> targetList, List<EObject> sourceList)
	{
		Set<EObject> toRemove = new HashSet<EObject>();
		List<EObject> toAdd = new Vector<EObject>();
		for (EObject target : targetList)
		{
			int i = listContainsUsingEqualsAtIndex(sourceList, target);
			if (i >= 0)
			{
				mergeChanges(target, sourceList.get(i));
			} else
			{
				toRemove.add(target);
			}
		}
		for (EObject source : sourceList)
		{
			if (!listContainsUsingEquals(targetList, source))
			{
				toAdd.add(source);
			}
		}
		targetList.addAll(toAdd);
		targetList.removeAll(toRemove);
	}

	private static int listContainsUsingEqualsAtIndex(List<EObject> sourceList, EObject target)
	{
		if (sourceList.isEmpty() || target == null)
		{
			return -1;
		}
		for (int i = 0; i < sourceList.size(); i++)
		{
			EObject o = sourceList.get(i);
			if (o.equals(target))
			{
				return i;
			}
		}
		return -1;
	}

	public static boolean listContainsUsingEquals(List<EObject> sourceList, EObject target)
	{
		if (sourceList.isEmpty() || target == null)
		{
			return false;
		}
		for (EObject o : sourceList)
		{
			if (o.equals(target))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Called to handle the copying of an attribute; this adds a list of values
	 * or sets a single value as appropriate for the multiplicity.
	 * 
	 * @param eAttribute
	 *            the attribute to copy.
	 * @param objectWithChanges
	 *            the object from which to copy.
	 * @param copyEObject
	 *            the object to copy to.
	 * @param copier
	 */
	protected static void copyAttribute(EAttribute eAttribute, EObject objectWithChanges, EObject target, Copier copier)
	{
		if (!eAttribute.isTransient() && !(!target.eIsSet(eAttribute) && !objectWithChanges.eIsSet(eAttribute)))
		{
			if (FeatureMapUtil.isFeatureMap(eAttribute))
			{
				FeatureMap featureMap = (FeatureMap) objectWithChanges.eGet(eAttribute);
				for (int i = 0, size = featureMap.size(); i < size; ++i)
				{
					EStructuralFeature feature = featureMap.getEStructuralFeature(i);
					if (feature instanceof EReference && ((EReference) feature).isContainment())
					{
						Object value = featureMap.getValue(i);
						if (value != null)
						{
							copier.copy((EObject) value); // versteh ich
															// nicht??? cp
						}
					}
				}
			} else if (eAttribute.isMany())
			{
				List<?> source = (List<?>) objectWithChanges.eGet(eAttribute);
				@SuppressWarnings("unchecked")
				List<Object> target2 = (List<Object>) target.eGet(getTarget(eAttribute));
				if (source.isEmpty())
				{
					target2.clear();
				} else
				{
					target2.addAll(source);
				}
			} else
			{
				if (objectWithChanges.eIsSet(eAttribute) && target.eIsSet(eAttribute))
				{
					if (!objectWithChanges.eGet(eAttribute).equals(target.eGet(eAttribute)))
					{
						target.eSet(getTarget(eAttribute), objectWithChanges.eGet(eAttribute));
					}
				} else if (objectWithChanges.eIsSet(eAttribute))
				{
					target.eSet(getTarget(eAttribute), objectWithChanges.eGet(eAttribute));
				} else if(!eAttribute.isTransient())
				{
					Object attribute = objectWithChanges.eGet(eAttribute);
					if (eAttribute.getEType().getInstanceTypeName().equals("java.lang.String"))
					{
						target.eSet(getTarget(eAttribute), "");
					} else if (eAttribute.getEType().getInstanceTypeName().equals("java.lang.Integer")
							|| eAttribute.getEType().getInstanceTypeName().equals("java.lang.int"))
					{
						target.eSet(getTarget(eAttribute), 0);
					} else
					{
						target.eUnset(getTarget(eAttribute));
					}
				}
			}
		}
	}

	/**
	 * Returns the target class used to create a copy instance for objects of
	 * the given source class.
	 * 
	 * @param eClass
	 *            the source class.
	 * @return the target class used to create a copy instance.
	 * @see #getTarget(EStructuralFeature)
	 */
	protected static EClass getTarget(EClass eClass)
	{
		return eClass;
	}

	/**
	 * Returns the target feature used to populate a copy instance from the
	 * given source feature.
	 * 
	 * @param eStructuralFeature
	 *            the source feature.
	 * @return the target feature used to populate a copy instance.
	 * @see #getTarget(EClass)
	 */
	protected static EStructuralFeature getTarget(EStructuralFeature eStructuralFeature)
	{
		return eStructuralFeature;
	}

	public static String modelToString(Object object)
	{
//		throw new UnsupportedOperationException();
		String string = null;
		
		//FIXME
//		Map options = new HashMap<Object, Object>();
//		 options.put(EMFJs.OPTION_INDENT_OUTPUT, false);
//		JSONSave js = new JSONSave(options);
//		if (object instanceof EObject)
//		{
//			EObject eo = (EObject) object;
//			JsonNode node = js.writeEObject(eo, eo.eResource());
//			string = node.toString();
//		}
//		else
//		{
//		ByteArrayOutputStream os = new ByteArrayOutputStream();
//		
//		js.writeValue(os, object);
//		
//		try
//		{
//			string = os.toString(BTSConstants.ENCODING);
//		} catch (UnsupportedEncodingException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		}
		return string;
	}

	public static boolean listContainsNodeWrapperUsingEquals(List<EObject> sourceList, Object target)
	{
		if (sourceList.isEmpty() || target == null)
		{
			return false;
		}
		for (EObject o : sourceList)
		{
			if (o instanceof TreeNodeWrapper && ((TreeNodeWrapper) o).getObject() != null
					&& ((TreeNodeWrapper) o).getObject().equals(target))
			{
				return true;
			}
		}
		return false;
	}

	
	 public static <T> T load(final InputStream inputStream, final Class<T> clazz) {
	        try {
	            if (inputStream != null) {
	                final Gson gson = new Gson();
	                final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
	                return gson.fromJson(reader, clazz);
	            }
	        } catch (final Exception e) {
	        }
	        return null;
	    }
}
