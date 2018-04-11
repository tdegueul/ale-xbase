/**
 */
package prodSysTokenHolder;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import tokenHolder.TokenHolderPackage;

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
 * @see prodSysTokenHolder.ProdSysTokenHolderFactory
 * @model kind="package"
 * @generated
 */
public interface ProdSysTokenHolderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "prodSysTokenHolder";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://prodSysTokenHolder";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prodSysTokenHolder";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProdSysTokenHolderPackage eINSTANCE = prodSysTokenHolder.impl.ProdSysTokenHolderPackageImpl.init();

	/**
	 * The meta object id for the '{@link prodSysTokenHolder.impl.HBindConveyorImpl <em>HBind Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prodSysTokenHolder.impl.HBindConveyorImpl
	 * @see prodSysTokenHolder.impl.ProdSysTokenHolderPackageImpl#getHBindConveyor()
	 * @generated
	 */
	int HBIND_CONVEYOR = 0;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBIND_CONVEYOR__TOKENS = TokenHolderPackage.H__TOKENS;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBIND_CONVEYOR__DELEGATE = TokenHolderPackage.H_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HBind Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBIND_CONVEYOR_FEATURE_COUNT = TokenHolderPackage.H_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HBind Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBIND_CONVEYOR_OPERATION_COUNT = TokenHolderPackage.H_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prodSysTokenHolder.impl.RBindRootImpl <em>RBind Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prodSysTokenHolder.impl.RBindRootImpl
	 * @see prodSysTokenHolder.impl.ProdSysTokenHolderPackageImpl#getRBindRoot()
	 * @generated
	 */
	int RBIND_ROOT = 1;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBIND_ROOT__H = TokenHolderPackage.R__H;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBIND_ROOT__P = TokenHolderPackage.R__P;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBIND_ROOT__DELEGATE = TokenHolderPackage.R_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RBind Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBIND_ROOT_FEATURE_COUNT = TokenHolderPackage.R_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RBind Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBIND_ROOT_OPERATION_COUNT = TokenHolderPackage.R_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prodSysTokenHolder.impl.PBindMachineImpl <em>PBind Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prodSysTokenHolder.impl.PBindMachineImpl
	 * @see prodSysTokenHolder.impl.ProdSysTokenHolderPackageImpl#getPBindMachine()
	 * @generated
	 */
	int PBIND_MACHINE = 2;

	/**
	 * The feature id for the '<em><b>In Holders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBIND_MACHINE__IN_HOLDERS = TokenHolderPackage.P__IN_HOLDERS;

	/**
	 * The feature id for the '<em><b>Out Holders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBIND_MACHINE__OUT_HOLDERS = TokenHolderPackage.P__OUT_HOLDERS;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBIND_MACHINE__DELEGATE = TokenHolderPackage.P_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PBind Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBIND_MACHINE_FEATURE_COUNT = TokenHolderPackage.P_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PBind Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBIND_MACHINE_OPERATION_COUNT = TokenHolderPackage.P_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prodSysTokenHolder.impl.TBindPartImpl <em>TBind Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prodSysTokenHolder.impl.TBindPartImpl
	 * @see prodSysTokenHolder.impl.ProdSysTokenHolderPackageImpl#getTBindPart()
	 * @generated
	 */
	int TBIND_PART = 3;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBIND_PART__DELEGATE = TokenHolderPackage.T_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TBind Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBIND_PART_FEATURE_COUNT = TokenHolderPackage.T_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TBind Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBIND_PART_OPERATION_COUNT = TokenHolderPackage.T_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link prodSysTokenHolder.HBindConveyor <em>HBind Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HBind Conveyor</em>'.
	 * @see prodSysTokenHolder.HBindConveyor
	 * @generated
	 */
	EClass getHBindConveyor();

	/**
	 * Returns the meta object for the reference '{@link prodSysTokenHolder.HBindConveyor#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see prodSysTokenHolder.HBindConveyor#getDelegate()
	 * @see #getHBindConveyor()
	 * @generated
	 */
	EReference getHBindConveyor_Delegate();

	/**
	 * Returns the meta object for class '{@link prodSysTokenHolder.RBindRoot <em>RBind Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RBind Root</em>'.
	 * @see prodSysTokenHolder.RBindRoot
	 * @generated
	 */
	EClass getRBindRoot();

	/**
	 * Returns the meta object for the reference '{@link prodSysTokenHolder.RBindRoot#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see prodSysTokenHolder.RBindRoot#getDelegate()
	 * @see #getRBindRoot()
	 * @generated
	 */
	EReference getRBindRoot_Delegate();

	/**
	 * Returns the meta object for class '{@link prodSysTokenHolder.PBindMachine <em>PBind Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PBind Machine</em>'.
	 * @see prodSysTokenHolder.PBindMachine
	 * @generated
	 */
	EClass getPBindMachine();

	/**
	 * Returns the meta object for the reference '{@link prodSysTokenHolder.PBindMachine#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see prodSysTokenHolder.PBindMachine#getDelegate()
	 * @see #getPBindMachine()
	 * @generated
	 */
	EReference getPBindMachine_Delegate();

	/**
	 * Returns the meta object for class '{@link prodSysTokenHolder.TBindPart <em>TBind Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBind Part</em>'.
	 * @see prodSysTokenHolder.TBindPart
	 * @generated
	 */
	EClass getTBindPart();

	/**
	 * Returns the meta object for the reference '{@link prodSysTokenHolder.TBindPart#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see prodSysTokenHolder.TBindPart#getDelegate()
	 * @see #getTBindPart()
	 * @generated
	 */
	EReference getTBindPart_Delegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProdSysTokenHolderFactory getProdSysTokenHolderFactory();

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
		 * The meta object literal for the '{@link prodSysTokenHolder.impl.HBindConveyorImpl <em>HBind Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prodSysTokenHolder.impl.HBindConveyorImpl
		 * @see prodSysTokenHolder.impl.ProdSysTokenHolderPackageImpl#getHBindConveyor()
		 * @generated
		 */
		EClass HBIND_CONVEYOR = eINSTANCE.getHBindConveyor();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HBIND_CONVEYOR__DELEGATE = eINSTANCE.getHBindConveyor_Delegate();

		/**
		 * The meta object literal for the '{@link prodSysTokenHolder.impl.RBindRootImpl <em>RBind Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prodSysTokenHolder.impl.RBindRootImpl
		 * @see prodSysTokenHolder.impl.ProdSysTokenHolderPackageImpl#getRBindRoot()
		 * @generated
		 */
		EClass RBIND_ROOT = eINSTANCE.getRBindRoot();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBIND_ROOT__DELEGATE = eINSTANCE.getRBindRoot_Delegate();

		/**
		 * The meta object literal for the '{@link prodSysTokenHolder.impl.PBindMachineImpl <em>PBind Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prodSysTokenHolder.impl.PBindMachineImpl
		 * @see prodSysTokenHolder.impl.ProdSysTokenHolderPackageImpl#getPBindMachine()
		 * @generated
		 */
		EClass PBIND_MACHINE = eINSTANCE.getPBindMachine();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PBIND_MACHINE__DELEGATE = eINSTANCE.getPBindMachine_Delegate();

		/**
		 * The meta object literal for the '{@link prodSysTokenHolder.impl.TBindPartImpl <em>TBind Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prodSysTokenHolder.impl.TBindPartImpl
		 * @see prodSysTokenHolder.impl.ProdSysTokenHolderPackageImpl#getTBindPart()
		 * @generated
		 */
		EClass TBIND_PART = eINSTANCE.getTBindPart();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBIND_PART__DELEGATE = eINSTANCE.getTBindPart_Delegate();

	}

} //ProdSysTokenHolderPackage
