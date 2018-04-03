/**
 */
package printgfsmboolexp.impl;

import boolexp.BoolexpPackage;

import boolexp.impl.BoolexpPackageImpl;

import gfsm.GfsmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import printgfsmboolexp.GuardBind;
import printgfsmboolexp.PrintgfsmboolexpFactory;
import printgfsmboolexp.PrintgfsmboolexpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrintgfsmboolexpPackageImpl extends EPackageImpl implements PrintgfsmboolexpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardBindEClass = null;

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
	 * @see printgfsmboolexp.PrintgfsmboolexpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrintgfsmboolexpPackageImpl() {
		super(eNS_URI, PrintgfsmboolexpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PrintgfsmboolexpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrintgfsmboolexpPackage init() {
		if (isInited) return (PrintgfsmboolexpPackage)EPackage.Registry.INSTANCE.getEPackage(PrintgfsmboolexpPackage.eNS_URI);

		// Obtain or create and register package
		PrintgfsmboolexpPackageImpl thePrintgfsmboolexpPackage = (PrintgfsmboolexpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PrintgfsmboolexpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PrintgfsmboolexpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GfsmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BoolexpPackageImpl theBoolexpPackage = (BoolexpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BoolexpPackage.eNS_URI) instanceof BoolexpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BoolexpPackage.eNS_URI) : BoolexpPackage.eINSTANCE);

		// Create package meta-data objects
		thePrintgfsmboolexpPackage.createPackageContents();
		theBoolexpPackage.createPackageContents();

		// Initialize created meta-data
		thePrintgfsmboolexpPackage.initializePackageContents();
		theBoolexpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePrintgfsmboolexpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrintgfsmboolexpPackage.eNS_URI, thePrintgfsmboolexpPackage);
		return thePrintgfsmboolexpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardBind() {
		return guardBindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardBind_Delegate() {
		return (EReference)guardBindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintgfsmboolexpFactory getPrintgfsmboolexpFactory() {
		return (PrintgfsmboolexpFactory)getEFactoryInstance();
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
		guardBindEClass = createEClass(GUARD_BIND);
		createEReference(guardBindEClass, GUARD_BIND__DELEGATE);
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
		GfsmPackage theGfsmPackage = (GfsmPackage)EPackage.Registry.INSTANCE.getEPackage(GfsmPackage.eNS_URI);
		BoolexpPackage theBoolexpPackage = (BoolexpPackage)EPackage.Registry.INSTANCE.getEPackage(BoolexpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		guardBindEClass.getESuperTypes().add(theGfsmPackage.getGuard());

		// Initialize classes, features, and operations; add parameters
		initEClass(guardBindEClass, GuardBind.class, "GuardBind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuardBind_Delegate(), theBoolexpPackage.getExp(), null, "delegate", null, 1, 1, GuardBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PrintgfsmboolexpPackageImpl
