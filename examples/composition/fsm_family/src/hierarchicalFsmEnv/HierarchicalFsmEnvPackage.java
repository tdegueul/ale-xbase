/**
 */
package hierarchicalFsmEnv;

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
 * @see hierarchicalFsmEnv.HierarchicalFsmEnvFactory
 * @model kind="package"
 * @generated
 */
public interface HierarchicalFsmEnvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hierarchicalFsmEnv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hierarchicalFsmEnv";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hierarchicalFsmEnv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HierarchicalFsmEnvPackage eINSTANCE = hierarchicalFsmEnv.impl.HierarchicalFsmEnvPackageImpl.init();

	/**
	 * The meta object id for the '{@link hierarchicalFsmEnv.impl.CompositeStateImpl <em>Composite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hierarchicalFsmEnv.impl.CompositeStateImpl
	 * @see hierarchicalFsmEnv.impl.HierarchicalFsmEnvPackageImpl#getCompositeState()
	 * @generated
	 */
	int COMPOSITE_STATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__NAME = BasicFsmEnvPackage.STATE__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__IN = BasicFsmEnvPackage.STATE__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__OUT = BasicFsmEnvPackage.STATE__OUT;

	/**
	 * The feature id for the '<em><b>Decls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__DECLS = BasicFsmEnvPackage.STATE__DECLS;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE__REGIONS = BasicFsmEnvPackage.STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_FEATURE_COUNT = BasicFsmEnvPackage.STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATE_OPERATION_COUNT = BasicFsmEnvPackage.STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hierarchicalFsmEnv.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hierarchicalFsmEnv.impl.RegionImpl
	 * @see hierarchicalFsmEnv.impl.HierarchicalFsmEnvPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__STATES = 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hierarchicalFsmEnv.CompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite State</em>'.
	 * @see hierarchicalFsmEnv.CompositeState
	 * @generated
	 */
	EClass getCompositeState();

	/**
	 * Returns the meta object for the containment reference list '{@link hierarchicalFsmEnv.CompositeState#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see hierarchicalFsmEnv.CompositeState#getRegions()
	 * @see #getCompositeState()
	 * @generated
	 */
	EReference getCompositeState_Regions();

	/**
	 * Returns the meta object for class '{@link hierarchicalFsmEnv.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see hierarchicalFsmEnv.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the container reference '{@link hierarchicalFsmEnv.Region#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see hierarchicalFsmEnv.Region#getParent()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link hierarchicalFsmEnv.Region#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see hierarchicalFsmEnv.Region#getStates()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_States();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HierarchicalFsmEnvFactory getHierarchicalFsmEnvFactory();

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
		 * The meta object literal for the '{@link hierarchicalFsmEnv.impl.CompositeStateImpl <em>Composite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hierarchicalFsmEnv.impl.CompositeStateImpl
		 * @see hierarchicalFsmEnv.impl.HierarchicalFsmEnvPackageImpl#getCompositeState()
		 * @generated
		 */
		EClass COMPOSITE_STATE = eINSTANCE.getCompositeState();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATE__REGIONS = eINSTANCE.getCompositeState_Regions();

		/**
		 * The meta object literal for the '{@link hierarchicalFsmEnv.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hierarchicalFsmEnv.impl.RegionImpl
		 * @see hierarchicalFsmEnv.impl.HierarchicalFsmEnvPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__PARENT = eINSTANCE.getRegion_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__STATES = eINSTANCE.getRegion_States();

	}

} //HierarchicalFsmEnvPackage
