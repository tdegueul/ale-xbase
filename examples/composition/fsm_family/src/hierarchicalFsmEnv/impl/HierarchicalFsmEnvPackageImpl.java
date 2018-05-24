/**
 */
package hierarchicalFsmEnv.impl;

import basicFsmEnv.BasicFsmEnvPackage;

import basicFsmEnv.impl.BasicFsmEnvPackageImpl;

import hierarchicalFsmEnv.CompositeState;
import hierarchicalFsmEnv.HierarchicalFsmEnvFactory;
import hierarchicalFsmEnv.HierarchicalFsmEnvPackage;
import hierarchicalFsmEnv.Region;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchicalFsmEnvPackageImpl extends EPackageImpl implements HierarchicalFsmEnvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hierarchicalFsmEnv.HierarchicalFsmEnvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HierarchicalFsmEnvPackageImpl() {
		super(eNS_URI, HierarchicalFsmEnvFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HierarchicalFsmEnvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HierarchicalFsmEnvPackage init() {
		if (isInited) return (HierarchicalFsmEnvPackage)EPackage.Registry.INSTANCE.getEPackage(HierarchicalFsmEnvPackage.eNS_URI);

		// Obtain or create and register package
		HierarchicalFsmEnvPackageImpl theHierarchicalFsmEnvPackage = (HierarchicalFsmEnvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HierarchicalFsmEnvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HierarchicalFsmEnvPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasicFsmEnvPackageImpl theBasicFsmEnvPackage = (BasicFsmEnvPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicFsmEnvPackage.eNS_URI) instanceof BasicFsmEnvPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicFsmEnvPackage.eNS_URI) : BasicFsmEnvPackage.eINSTANCE);

		// Create package meta-data objects
		theHierarchicalFsmEnvPackage.createPackageContents();
		theBasicFsmEnvPackage.createPackageContents();

		// Initialize created meta-data
		theHierarchicalFsmEnvPackage.initializePackageContents();
		theBasicFsmEnvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHierarchicalFsmEnvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HierarchicalFsmEnvPackage.eNS_URI, theHierarchicalFsmEnvPackage);
		return theHierarchicalFsmEnvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeState() {
		return compositeStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeState_Regions() {
		return (EReference)compositeStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Parent() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_States() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchicalFsmEnvFactory getHierarchicalFsmEnvFactory() {
		return (HierarchicalFsmEnvFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		compositeStateEClass = createEClass(COMPOSITE_STATE);
		createEReference(compositeStateEClass, COMPOSITE_STATE__REGIONS);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__PARENT);
		createEReference(regionEClass, REGION__STATES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasicFsmEnvPackage theBasicFsmEnvPackage = (BasicFsmEnvPackage)EPackage.Registry.INSTANCE.getEPackage(BasicFsmEnvPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeStateEClass.getESuperTypes().add(theBasicFsmEnvPackage.getState());

		// Initialize classes, features, and operations; add parameters
		initEClass(compositeStateEClass, CompositeState.class, "CompositeState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeState_Regions(), this.getRegion(), this.getRegion_Parent(), "regions", null, 1, -1, CompositeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_Parent(), this.getCompositeState(), this.getCompositeState_Regions(), "parent", null, 1, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_States(), theBasicFsmEnvPackage.getState(), null, "states", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HierarchicalFsmEnvPackageImpl
