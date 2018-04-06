/**
 */
package brew.impl;

import brew.*;

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
public class BrewFactoryImpl extends EFactoryImpl implements BrewFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BrewFactory init() {
		try {
			BrewFactory theBrewFactory = (BrewFactory)EPackage.Registry.INSTANCE.getEFactory(BrewPackage.eNS_URI);
			if (theBrewFactory != null) {
				return theBrewFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BrewFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrewFactoryImpl() {
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
			case BrewPackage.RA1_BIND_B: return createRA1BindB();
			case BrewPackage.RA2_BIND_C1: return createRA2BindC1();
			case BrewPackage.RB_BIND_C1: return createRBBindC1();
			case BrewPackage.RB_BIND_C2: return createRBBindC2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RA1BindB createRA1BindB() {
		RA1BindBImpl ra1BindB = new RA1BindBImpl();
		return ra1BindB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RA2BindC1 createRA2BindC1() {
		RA2BindC1Impl ra2BindC1 = new RA2BindC1Impl();
		return ra2BindC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBBindC1 createRBBindC1() {
		RBBindC1Impl rbBindC1 = new RBBindC1Impl();
		return rbBindC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBBindC2 createRBBindC2() {
		RBBindC2Impl rbBindC2 = new RBBindC2Impl();
		return rbBindC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrewPackage getBrewPackage() {
		return (BrewPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BrewPackage getPackage() {
		return BrewPackage.eINSTANCE;
	}

} //BrewFactoryImpl
