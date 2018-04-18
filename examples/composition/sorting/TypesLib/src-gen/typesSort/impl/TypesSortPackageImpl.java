/**
 */
package typesSort.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sortingAlgorithm.SortingAlgorithmPackage;

import typesLib.TypesLibPackage;

import typesSort.SortableBindIntWrapper;
import typesSort.TypesSortFactory;
import typesSort.TypesSortPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesSortPackageImpl extends EPackageImpl implements TypesSortPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortableBindIntWrapperEClass = null;

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
	 * @see typesSort.TypesSortPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesSortPackageImpl() {
		super(eNS_URI, TypesSortFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypesSortPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesSortPackage init() {
		if (isInited) return (TypesSortPackage)EPackage.Registry.INSTANCE.getEPackage(TypesSortPackage.eNS_URI);

		// Obtain or create and register package
		TypesSortPackageImpl theTypesSortPackage = (TypesSortPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypesSortPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypesSortPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesLibPackage.eINSTANCE.eClass();
		SortingAlgorithmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTypesSortPackage.createPackageContents();

		// Initialize created meta-data
		theTypesSortPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesSortPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesSortPackage.eNS_URI, theTypesSortPackage);
		return theTypesSortPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortableBindIntWrapper() {
		return sortableBindIntWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortableBindIntWrapper_Delegate() {
		return (EReference)sortableBindIntWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSortFactory getTypesSortFactory() {
		return (TypesSortFactory)getEFactoryInstance();
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
		sortableBindIntWrapperEClass = createEClass(SORTABLE_BIND_INT_WRAPPER);
		createEReference(sortableBindIntWrapperEClass, SORTABLE_BIND_INT_WRAPPER__DELEGATE);
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
		SortingAlgorithmPackage theSortingAlgorithmPackage = (SortingAlgorithmPackage)EPackage.Registry.INSTANCE.getEPackage(SortingAlgorithmPackage.eNS_URI);
		TypesLibPackage theTypesLibPackage = (TypesLibPackage)EPackage.Registry.INSTANCE.getEPackage(TypesLibPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sortableBindIntWrapperEClass.getESuperTypes().add(theSortingAlgorithmPackage.getSortable());

		// Initialize classes, features, and operations; add parameters
		initEClass(sortableBindIntWrapperEClass, SortableBindIntWrapper.class, "SortableBindIntWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortableBindIntWrapper_Delegate(), theTypesLibPackage.getIntWrapper(), null, "delegate", null, 1, 1, SortableBindIntWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TypesSortPackageImpl
