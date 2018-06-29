/**
 */
package composeabprint2.impl;

import composeabprint2.BBindB1;
import composeabprint2.Composeabprint2Factory;
import composeabprint2.Composeabprint2Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simplea.SimpleaPackage;

import simpleb.SimplebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Composeabprint2PackageImpl extends EPackageImpl implements Composeabprint2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bBindB1EClass = null;

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
	 * @see composeabprint2.Composeabprint2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Composeabprint2PackageImpl() {
		super(eNS_URI, Composeabprint2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Composeabprint2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Composeabprint2Package init() {
		if (isInited) return (Composeabprint2Package)EPackage.Registry.INSTANCE.getEPackage(Composeabprint2Package.eNS_URI);

		// Obtain or create and register package
		Composeabprint2PackageImpl theComposeabprint2Package = (Composeabprint2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Composeabprint2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Composeabprint2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SimpleaPackage.eINSTANCE.eClass();
		SimplebPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComposeabprint2Package.createPackageContents();

		// Initialize created meta-data
		theComposeabprint2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComposeabprint2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Composeabprint2Package.eNS_URI, theComposeabprint2Package);
		return theComposeabprint2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBBindB1() {
		return bBindB1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBBindB1_Delegate() {
		return (EReference)bBindB1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composeabprint2Factory getComposeabprint2Factory() {
		return (Composeabprint2Factory)getEFactoryInstance();
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
		bBindB1EClass = createEClass(BBIND_B1);
		createEReference(bBindB1EClass, BBIND_B1__DELEGATE);
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
		SimpleaPackage theSimpleaPackage = (SimpleaPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleaPackage.eNS_URI);
		SimplebPackage theSimplebPackage = (SimplebPackage)EPackage.Registry.INSTANCE.getEPackage(SimplebPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bBindB1EClass.getESuperTypes().add(theSimpleaPackage.getB());

		// Initialize classes, features, and operations; add parameters
		initEClass(bBindB1EClass, BBindB1.class, "BBindB1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBBindB1_Delegate(), theSimplebPackage.getB1(), null, "delegate", null, 1, 1, BBindB1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Composeabprint2PackageImpl