/**
 */
package guardedfsm.impl;

import boolexp.BoolexpPackage;

import guardedfsm.Guarded;
import guardedfsm.GuardedfsmFactory;
import guardedfsm.GuardedfsmPackage;

import minifsm.MinifsmPackage;

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
public class GuardedfsmPackageImpl extends EPackageImpl implements GuardedfsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardedEClass = null;

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
	 * @see guardedfsm.GuardedfsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GuardedfsmPackageImpl() {
		super(eNS_URI, GuardedfsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GuardedfsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GuardedfsmPackage init() {
		if (isInited) return (GuardedfsmPackage)EPackage.Registry.INSTANCE.getEPackage(GuardedfsmPackage.eNS_URI);

		// Obtain or create and register package
		GuardedfsmPackageImpl theGuardedfsmPackage = (GuardedfsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GuardedfsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GuardedfsmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BoolexpPackage.eINSTANCE.eClass();
		MinifsmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGuardedfsmPackage.createPackageContents();

		// Initialize created meta-data
		theGuardedfsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGuardedfsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GuardedfsmPackage.eNS_URI, theGuardedfsmPackage);
		return theGuardedfsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuarded() {
		return guardedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuarded_Guard() {
		return (EReference)guardedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardedfsmFactory getGuardedfsmFactory() {
		return (GuardedfsmFactory)getEFactoryInstance();
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
		guardedEClass = createEClass(GUARDED);
		createEReference(guardedEClass, GUARDED__GUARD);
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
		MinifsmPackage theMinifsmPackage = (MinifsmPackage)EPackage.Registry.INSTANCE.getEPackage(MinifsmPackage.eNS_URI);
		BoolexpPackage theBoolexpPackage = (BoolexpPackage)EPackage.Registry.INSTANCE.getEPackage(BoolexpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		guardedEClass.getESuperTypes().add(theMinifsmPackage.getTransition());

		// Initialize classes, features, and operations; add parameters
		initEClass(guardedEClass, Guarded.class, "Guarded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuarded_Guard(), theBoolexpPackage.getExp(), null, "guard", null, 0, 1, Guarded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GuardedfsmPackageImpl
