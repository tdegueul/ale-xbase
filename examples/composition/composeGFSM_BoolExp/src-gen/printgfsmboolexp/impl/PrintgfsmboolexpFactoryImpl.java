/**
 */
package printgfsmboolexp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import printgfsmboolexp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrintgfsmboolexpFactoryImpl extends EFactoryImpl implements PrintgfsmboolexpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrintgfsmboolexpFactory init() {
		try {
			PrintgfsmboolexpFactory thePrintgfsmboolexpFactory = (PrintgfsmboolexpFactory)EPackage.Registry.INSTANCE.getEFactory(PrintgfsmboolexpPackage.eNS_URI);
			if (thePrintgfsmboolexpFactory != null) {
				return thePrintgfsmboolexpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PrintgfsmboolexpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintgfsmboolexpFactoryImpl() {
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
			case PrintgfsmboolexpPackage.GUARD_BIND: return createGuardBind();
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
	public PrintgfsmboolexpPackage getPrintgfsmboolexpPackage() {
		return (PrintgfsmboolexpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PrintgfsmboolexpPackage getPackage() {
		return PrintgfsmboolexpPackage.eINSTANCE;
	}

} //PrintgfsmboolexpFactoryImpl
