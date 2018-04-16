/**
 */
package fullfsmeval;

import basicFsmEnv.BasicFsmEnvPackage;

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
 * @see fullfsmeval.FullfsmevalFactory
 * @model kind="package"
 * @generated
 */
public interface FullfsmevalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fullfsmeval";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fullfsmeval";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fullfsmeval";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FullfsmevalPackage eINSTANCE = fullfsmeval.impl.FullfsmevalPackageImpl.init();

	/**
	 * The meta object id for the '{@link fullfsmeval.impl.ActionBindBlockImpl <em>Action Bind Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fullfsmeval.impl.ActionBindBlockImpl
	 * @see fullfsmeval.impl.FullfsmevalPackageImpl#getActionBindBlock()
	 * @generated
	 */
	int ACTION_BIND_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BIND_BLOCK__DELEGATE = BasicFsmEnvPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Bind Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BIND_BLOCK_FEATURE_COUNT = BasicFsmEnvPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Bind Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BIND_BLOCK_OPERATION_COUNT = BasicFsmEnvPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fullfsmeval.impl.GuardBindExpImpl <em>Guard Bind Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fullfsmeval.impl.GuardBindExpImpl
	 * @see fullfsmeval.impl.FullfsmevalPackageImpl#getGuardBindExp()
	 * @generated
	 */
	int GUARD_BIND_EXP = 1;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_BIND_EXP__DELEGATE = BasicFsmEnvPackage.GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guard Bind Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_BIND_EXP_FEATURE_COUNT = BasicFsmEnvPackage.GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Guard Bind Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_BIND_EXP_OPERATION_COUNT = BasicFsmEnvPackage.GUARD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fullfsmeval.ActionBindBlock <em>Action Bind Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Bind Block</em>'.
	 * @see fullfsmeval.ActionBindBlock
	 * @generated
	 */
	EClass getActionBindBlock();

	/**
	 * Returns the meta object for the reference '{@link fullfsmeval.ActionBindBlock#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see fullfsmeval.ActionBindBlock#getDelegate()
	 * @see #getActionBindBlock()
	 * @generated
	 */
	EReference getActionBindBlock_Delegate();

	/**
	 * Returns the meta object for class '{@link fullfsmeval.GuardBindExp <em>Guard Bind Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Bind Exp</em>'.
	 * @see fullfsmeval.GuardBindExp
	 * @generated
	 */
	EClass getGuardBindExp();

	/**
	 * Returns the meta object for the reference '{@link fullfsmeval.GuardBindExp#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see fullfsmeval.GuardBindExp#getDelegate()
	 * @see #getGuardBindExp()
	 * @generated
	 */
	EReference getGuardBindExp_Delegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FullfsmevalFactory getFullfsmevalFactory();

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
		 * The meta object literal for the '{@link fullfsmeval.impl.ActionBindBlockImpl <em>Action Bind Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fullfsmeval.impl.ActionBindBlockImpl
		 * @see fullfsmeval.impl.FullfsmevalPackageImpl#getActionBindBlock()
		 * @generated
		 */
		EClass ACTION_BIND_BLOCK = eINSTANCE.getActionBindBlock();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BIND_BLOCK__DELEGATE = eINSTANCE.getActionBindBlock_Delegate();

		/**
		 * The meta object literal for the '{@link fullfsmeval.impl.GuardBindExpImpl <em>Guard Bind Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fullfsmeval.impl.GuardBindExpImpl
		 * @see fullfsmeval.impl.FullfsmevalPackageImpl#getGuardBindExp()
		 * @generated
		 */
		EClass GUARD_BIND_EXP = eINSTANCE.getGuardBindExp();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD_BIND_EXP__DELEGATE = eINSTANCE.getGuardBindExp_Delegate();

	}

} //FullfsmevalPackage
