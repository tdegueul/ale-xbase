/**
 */
package fullhierarchicalfsmeval;

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
 * @see fullhierarchicalfsmeval.FullhierarchicalfsmevalFactory
 * @model kind="package"
 *        annotation="@BrewRequires platform:/resource/HierarchicalFsmEnv/model/hierarchicalFsmEnv.ecore='ecoreUrl' platform:/resource/BoolExpEnv/model/boolExpEnv.ecore='ecoreUrl' platform:/resource/SimpleALEnv/model/simpleALEnv.ecore='ecoreUrl'"
 * @generated
 */
public interface FullhierarchicalfsmevalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fullhierarchicalfsmeval";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fullhierarchicalfsmeval";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fullhierarchicalfsmeval";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FullhierarchicalfsmevalPackage eINSTANCE = fullhierarchicalfsmeval.impl.FullhierarchicalfsmevalPackageImpl.init();

	/**
	 * The meta object id for the '{@link fullhierarchicalfsmeval.impl.ActionBindBlockImpl <em>Action Bind Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fullhierarchicalfsmeval.impl.ActionBindBlockImpl
	 * @see fullhierarchicalfsmeval.impl.FullhierarchicalfsmevalPackageImpl#getActionBindBlock()
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
	 * The meta object id for the '{@link fullhierarchicalfsmeval.impl.GuardBindExpImpl <em>Guard Bind Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fullhierarchicalfsmeval.impl.GuardBindExpImpl
	 * @see fullhierarchicalfsmeval.impl.FullhierarchicalfsmevalPackageImpl#getGuardBindExp()
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
	 * Returns the meta object for class '{@link fullhierarchicalfsmeval.ActionBindBlock <em>Action Bind Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Bind Block</em>'.
	 * @see fullhierarchicalfsmeval.ActionBindBlock
	 * @generated
	 */
	EClass getActionBindBlock();

	/**
	 * Returns the meta object for the reference '{@link fullhierarchicalfsmeval.ActionBindBlock#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see fullhierarchicalfsmeval.ActionBindBlock#getDelegate()
	 * @see #getActionBindBlock()
	 * @generated
	 */
	EReference getActionBindBlock_Delegate();

	/**
	 * Returns the meta object for class '{@link fullhierarchicalfsmeval.GuardBindExp <em>Guard Bind Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Bind Exp</em>'.
	 * @see fullhierarchicalfsmeval.GuardBindExp
	 * @generated
	 */
	EClass getGuardBindExp();

	/**
	 * Returns the meta object for the reference '{@link fullhierarchicalfsmeval.GuardBindExp#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see fullhierarchicalfsmeval.GuardBindExp#getDelegate()
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
	FullhierarchicalfsmevalFactory getFullhierarchicalfsmevalFactory();

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
		 * The meta object literal for the '{@link fullhierarchicalfsmeval.impl.ActionBindBlockImpl <em>Action Bind Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fullhierarchicalfsmeval.impl.ActionBindBlockImpl
		 * @see fullhierarchicalfsmeval.impl.FullhierarchicalfsmevalPackageImpl#getActionBindBlock()
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
		 * The meta object literal for the '{@link fullhierarchicalfsmeval.impl.GuardBindExpImpl <em>Guard Bind Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fullhierarchicalfsmeval.impl.GuardBindExpImpl
		 * @see fullhierarchicalfsmeval.impl.FullhierarchicalfsmevalPackageImpl#getGuardBindExp()
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

} //FullhierarchicalfsmevalPackage
