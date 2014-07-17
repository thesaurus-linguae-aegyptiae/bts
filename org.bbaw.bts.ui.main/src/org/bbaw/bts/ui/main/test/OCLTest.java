package org.bbaw.bts.ui.main.test;

import org.bbaw.bts.btsmodel.BTSObject;
import org.bbaw.bts.btsmodel.BtsmodelFactory;
import org.bbaw.bts.btsmodel.BtsmodelPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

public class OCLTest
{

	public static void main(String[] args)
	{
		OCLTest t = new OCLTest();
		t.validate(null);
	}

	public boolean validate(BTSObject object2)
	{
//		BTSObject object = BtsmodelFactory.eINSTANCE.createBTSTextCorpus();
//		object.setName("aaa");
//		boolean valid;
//		OCLExpression<EClassifier> query = null;
//		Constraint invariant = null;
//		try
//		{
//			// create an OCL instance for Ecore
//			OCL<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, org.eclipse.ocl.ecore.Constraint, EClass, EObject> ocl;
//			// ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
//			ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
//
//			// create an OCL helper object
//			OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = ocl.createOCLHelper();
//
//			// set the OCL context classifier
//			helper.setContext(BtsmodelPackage.Literals.BTS_CORPUS_OBJECT);
//
//			String var1 = "self.name <> 'aaa'";
//			String var2 = "not self.children->isEmpty()";
//			query = helper.createQuery(var2);
//
//			// record success
//			valid = true;
//
//			try
//			{
//				// // set the OCL context classifier
//				// helper.setContext(EXTLibraryPackage.Literals.LIBRARY);
//
//				invariant = helper.createInvariant(var2);
//			} catch (ParserException e)
//			{
//				// record failure to parse
//				System.err.println(e.getLocalizedMessage());
//			}
//
//			// use the query expression parsed before to create a Query
//			Query<EClassifier, EClass, EObject> eval = ocl.createQuery(query);
//
//			// Collection<?> result = (Collection<?>) eval.evaluate(object);
//			boolean ok = eval.check(object);
//			System.out.println(ok);
//		} catch (ParserException e)
//		{
//			// record failure to parse
//			valid = false;
//			System.err.println(e.getLocalizedMessage());
//		}

		boolean valid = false;
		return valid;

	}
}
