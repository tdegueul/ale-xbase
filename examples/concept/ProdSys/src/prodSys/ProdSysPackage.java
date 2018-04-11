/**
 */
package prodSys;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see prodSys.ProdSysFactory
 * @model kind="package"
 * @generated
 */
public interface ProdSysPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "prodSys";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/prodSys";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prodSys";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProdSysPackage eINSTANCE = prodSys.impl.ProdSysPackageImpl.init();

	/**
	 * The meta object id for the '{@link prodSys.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prodSys.impl.MachineImpl
	 * @see prodSys.impl.ProdSysPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__REF = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>In C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__IN_C = 2;

	/**
	 * The feature id for the '<em><b>Out C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OUT_C = 3;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link prodSys.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prodSys.impl.ConveyorImpl
	 * @see prodSys.impl.ProdSysPackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 1;

	/**
	 * The feature id for the '<em><b>Out M</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__OUT_M = 0;

	/**
	 * The feature id for the '<em><b>In M</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__IN_M = 1;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__PARTS = 2;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link prodSys.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prodSys.impl.PartImpl
	 * @see prodSys.impl.ProdSysPackageImpl#getPart()
	 * @generated
	 */
	int PART = 2;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__CREATION_TIME = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__OWNER = 1;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link prodSys.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prodSys.impl.RootImpl
	 * @see prodSys.impl.ProdSysPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 3;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Conveyor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__CONVEYOR = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link prodSys.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see prodSys.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link prodSys.Machine#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see prodSys.Machine#getRef()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Ref();

	/**
	 * Returns the meta object for the attribute '{@link prodSys.Machine#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see prodSys.Machine#getType()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Type();

	/**
	 * Returns the meta object for the reference list '{@link prodSys.Machine#getInC <em>In C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In C</em>'.
	 * @see prodSys.Machine#getInC()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_InC();

	/**
	 * Returns the meta object for the reference list '{@link prodSys.Machine#getOutC <em>Out C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out C</em>'.
	 * @see prodSys.Machine#getOutC()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_OutC();

	/**
	 * Returns the meta object for class '{@link prodSys.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see prodSys.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for the reference '{@link prodSys.Conveyor#getOutM <em>Out M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out M</em>'.
	 * @see prodSys.Conveyor#getOutM()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_OutM();

	/**
	 * Returns the meta object for the reference '{@link prodSys.Conveyor#getInM <em>In M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In M</em>'.
	 * @see prodSys.Conveyor#getInM()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_InM();

	/**
	 * Returns the meta object for the containment reference list '{@link prodSys.Conveyor#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see prodSys.Conveyor#getParts()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Parts();

	/**
	 * Returns the meta object for class '{@link prodSys.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see prodSys.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the attribute '{@link prodSys.Part#getCreationTime <em>Creation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Time</em>'.
	 * @see prodSys.Part#getCreationTime()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_CreationTime();

	/**
	 * Returns the meta object for the container reference '{@link prodSys.Part#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see prodSys.Part#getOwner()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Owner();

	/**
	 * Returns the meta object for class '{@link prodSys.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see prodSys.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link prodSys.Root#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine</em>'.
	 * @see prodSys.Root#getMachine()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Machine();

	/**
	 * Returns the meta object for the containment reference list '{@link prodSys.Root#getConveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conveyor</em>'.
	 * @see prodSys.Root#getConveyor()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Conveyor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProdSysFactory getProdSysFactory();

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
		 * The meta object literal for the '{@link prodSys.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prodSys.impl.MachineImpl
		 * @see prodSys.impl.ProdSysPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__REF = eINSTANCE.getMachine_Ref();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__TYPE = eINSTANCE.getMachine_Type();

		/**
		 * The meta object literal for the '<em><b>In C</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__IN_C = eINSTANCE.getMachine_InC();

		/**
		 * The meta object literal for the '<em><b>Out C</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__OUT_C = eINSTANCE.getMachine_OutC();

		/**
		 * The meta object literal for the '{@link prodSys.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prodSys.impl.ConveyorImpl
		 * @see prodSys.impl.ProdSysPackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '<em><b>Out M</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__OUT_M = eINSTANCE.getConveyor_OutM();

		/**
		 * The meta object literal for the '<em><b>In M</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__IN_M = eINSTANCE.getConveyor_InM();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__PARTS = eINSTANCE.getConveyor_Parts();

		/**
		 * The meta object literal for the '{@link prodSys.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prodSys.impl.PartImpl
		 * @see prodSys.impl.ProdSysPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Creation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__CREATION_TIME = eINSTANCE.getPart_CreationTime();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__OWNER = eINSTANCE.getPart_Owner();

		/**
		 * The meta object literal for the '{@link prodSys.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prodSys.impl.RootImpl
		 * @see prodSys.impl.ProdSysPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__MACHINE = eINSTANCE.getRoot_Machine();

		/**
		 * The meta object literal for the '<em><b>Conveyor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__CONVEYOR = eINSTANCE.getRoot_Conveyor();

	}

} //ProdSysPackage
