/**
 */
package evalgfsmboolexp.impl;

import evalgfsmboolexp.*;

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
public class EvalgfsmboolexpFactoryImpl extends EFactoryImpl implements EvalgfsmboolexpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvalgfsmboolexpFactory init() {
		try {
			EvalgfsmboolexpFactory theEvalgfsmboolexpFactory = (EvalgfsmboolexpFactory)EPackage.Registry.INSTANCE.getEFactory(EvalgfsmboolexpPackage.eNS_URI);
			if (theEvalgfsmboolexpFactory != null) {
				return theEvalgfsmboolexpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvalgfsmboolexpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvalgfsmboolexpFactoryImpl() {
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
			case EvalgfsmboolexpPackage.GUARD_BIND: return createGuardBind();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardBind createGuardBind() {
		GuardBindImpl guardBind = new GuardBindImpl();
		return guardBind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvalgfsmboolexpPackage getEvalgfsmboolexpPackage() {
		return (EvalgfsmboolexpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvalgfsmboolexpPackage getPackage() {
		return EvalgfsmboolexpPackage.eINSTANCE;
	}

} //EvalgfsmboolexpFactoryImpl
