/**
 */
package sortingAlgorithm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sortingAlgorithm.Sortable;
import sortingAlgorithm.SortingAlgorithmFactory;
import sortingAlgorithm.SortingAlgorithmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SortingAlgorithmPackageImpl extends EPackageImpl implements SortingAlgorithmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortableEClass = null;

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
	 * @see sortingAlgorithm.SortingAlgorithmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SortingAlgorithmPackageImpl() {
		super(eNS_URI, SortingAlgorithmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SortingAlgorithmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SortingAlgorithmPackage init() {
		if (isInited) return (SortingAlgorithmPackage)EPackage.Registry.INSTANCE.getEPackage(SortingAlgorithmPackage.eNS_URI);

		// Obtain or create and register package
		SortingAlgorithmPackageImpl theSortingAlgorithmPackage = (SortingAlgorithmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SortingAlgorithmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SortingAlgorithmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSortingAlgorithmPackage.createPackageContents();

		// Initialize created meta-data
		theSortingAlgorithmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSortingAlgorithmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SortingAlgorithmPackage.eNS_URI, theSortingAlgorithmPackage);
		return theSortingAlgorithmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortable() {
		return sortableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingAlgorithmFactory getSortingAlgorithmFactory() {
		return (SortingAlgorithmFactory)getEFactoryInstance();
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
		sortableEClass = createEClass(SORTABLE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(sortableEClass, Sortable.class, "Sortable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Required
		createRequiredAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Required</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRequiredAnnotations() {
		String source = "Required";	
		addAnnotation
		  (sortableEClass, 
		   source, 
		   new String[] {
		   });
	}

} //SortingAlgorithmPackageImpl
