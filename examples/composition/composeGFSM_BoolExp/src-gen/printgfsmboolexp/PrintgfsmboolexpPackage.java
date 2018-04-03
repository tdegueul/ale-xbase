/**
 */
package printgfsmboolexp;

import gfsm.GfsmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see printgfsmboolexp.PrintgfsmboolexpFactory
 * @model kind="package"
 * @generated
 */
public interface PrintgfsmboolexpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "printgfsmboolexp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://printgfsmboolexp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "printgfsmboolexp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrintgfsmboolexpPackage eINSTANCE = printgfsmboolexp.impl.PrintgfsmboolexpPackageImpl.init();

	/**
	 * The meta object id for the '{@link printgfsmboolexp.impl.GuardBindImpl <em>Guard Bind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see printgfsmboolexp.impl.GuardBindImpl
	 * @see printgfsmboolexp.impl.PrintgfsmboolexpPackageImpl#getGuardBind()
	 * @generated
	 */
	int GUARD_BIND = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_BIND__DELEGATE = GfsmPackage.GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guard Bind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_BIND_FEATURE_COUNT = GfsmPackage.GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Guard Bind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_BIND_OPERATION_COUNT = GfsmPackage.GUARD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link printgfsmboolexp.GuardBind <em>Guard Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Bind</em>'.
	 * @see printgfsmboolexp.GuardBind
	 * @generated
	 */
	EClass getGuardBind();

	/**
	 * Returns the meta object for the reference '{@link printgfsmboolexp.GuardBind#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see printgfsmboolexp.GuardBind#getDelegate()
	 * @see #getGuardBind()
	 * @generated
	 */
	EReference getGuardBind_Delegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrintgfsmboolexpFactory getPrintgfsmboolexpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link printgfsmboolexp.impl.GuardBindImpl <em>Guard Bind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see printgfsmboolexp.impl.GuardBindImpl
		 * @see printgfsmboolexp.impl.PrintgfsmboolexpPackageImpl#getGuardBind()
		 * @generated
		 */
		EClass GUARD_BIND = eINSTANCE.getGuardBind();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD_BIND__DELEGATE = eINSTANCE.getGuardBind_Delegate();

	}

} //PrintgfsmboolexpPackage
