/**
 */
package guardedfsm;

import minifsm.MinifsmPackage;

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
 * @see guardedfsm.GuardedfsmFactory
 * @model kind="package"
 * @generated
 */
public interface GuardedfsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "guardedfsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://guardedfsm/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "guardedfsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuardedfsmPackage eINSTANCE = guardedfsm.impl.GuardedfsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link guardedfsm.impl.GuardedImpl <em>Guarded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guardedfsm.impl.GuardedImpl
	 * @see guardedfsm.impl.GuardedfsmPackageImpl#getGuarded()
	 * @generated
	 */
	int GUARDED = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED__EVENT = MinifsmPackage.TRANSITION__EVENT;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED__SRC = MinifsmPackage.TRANSITION__SRC;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED__TGT = MinifsmPackage.TRANSITION__TGT;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED__GUARD = MinifsmPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guarded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_FEATURE_COUNT = MinifsmPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Guarded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_OPERATION_COUNT = MinifsmPackage.TRANSITION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link guardedfsm.Guarded <em>Guarded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guarded</em>'.
	 * @see guardedfsm.Guarded
	 * @generated
	 */
	EClass getGuarded();

	/**
	 * Returns the meta object for the containment reference '{@link guardedfsm.Guarded#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see guardedfsm.Guarded#getGuard()
	 * @see #getGuarded()
	 * @generated
	 */
	EReference getGuarded_Guard();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GuardedfsmFactory getGuardedfsmFactory();

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
		 * The meta object literal for the '{@link guardedfsm.impl.GuardedImpl <em>Guarded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guardedfsm.impl.GuardedImpl
		 * @see guardedfsm.impl.GuardedfsmPackageImpl#getGuarded()
		 * @generated
		 */
		EClass GUARDED = eINSTANCE.getGuarded();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARDED__GUARD = eINSTANCE.getGuarded_Guard();

	}

} //GuardedfsmPackage
