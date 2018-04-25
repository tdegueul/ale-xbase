/**
 */
package composeabprint.impl;

import composeabprint.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComposeabprintFactoryImpl extends EFactoryImpl implements ComposeabprintFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComposeabprintFactory init() {
		try {
			ComposeabprintFactory theComposeabprintFactory = (ComposeabprintFactory)EPackage.Registry.INSTANCE.getEFactory(ComposeabprintPackage.eNS_URI);
			if (theComposeabprintFactory != null) {
				return theComposeabprintFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComposeabprintFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeabprintFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComposeabprintPackage.BBIND_B1: return createBBindB1();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBindB1 createBBindB1() {
		BBindB1Impl bBindB1 = new BBindB1Impl();
		return bBindB1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeabprintPackage getComposeabprintPackage() {
		return (ComposeabprintPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComposeabprintPackage getPackage() {
		return ComposeabprintPackage.eINSTANCE;
	}

} //ComposeabprintFactoryImpl
