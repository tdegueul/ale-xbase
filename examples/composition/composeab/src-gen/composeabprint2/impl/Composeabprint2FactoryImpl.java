/**
 */
package composeabprint2.impl;

import composeabprint2.*;

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
public class Composeabprint2FactoryImpl extends EFactoryImpl implements Composeabprint2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Composeabprint2Factory init() {
		try {
			Composeabprint2Factory theComposeabprint2Factory = (Composeabprint2Factory)EPackage.Registry.INSTANCE.getEFactory(Composeabprint2Package.eNS_URI);
			if (theComposeabprint2Factory != null) {
				return theComposeabprint2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Composeabprint2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composeabprint2FactoryImpl() {
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
			case Composeabprint2Package.BBIND_B1: return createBBindB1();
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
	public Composeabprint2Package getComposeabprint2Package() {
		return (Composeabprint2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Composeabprint2Package getPackage() {
		return Composeabprint2Package.eINSTANCE;
	}

} //Composeabprint2FactoryImpl
