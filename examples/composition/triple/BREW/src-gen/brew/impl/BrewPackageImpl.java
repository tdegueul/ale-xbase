/**
 */
package brew.impl;

import ale1.Ale1Package;

import ale2.Ale2Package;

import ale3.Ale3Package;

import brew.BrewFactory;
import brew.BrewPackage;
import brew.RA1BindB;
import brew.RA2BindC1;
import brew.RBBindC1;
import brew.RBBindC2;

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
public class BrewPackageImpl extends EPackageImpl implements BrewPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ra1BindBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ra2BindC1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbBindC1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbBindC2EClass = null;

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
	 * @see brew.BrewPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BrewPackageImpl() {
		super(eNS_URI, BrewFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BrewPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BrewPackage init() {
		if (isInited) return (BrewPackage)EPackage.Registry.INSTANCE.getEPackage(BrewPackage.eNS_URI);

		// Obtain or create and register package
		BrewPackageImpl theBrewPackage = (BrewPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BrewPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BrewPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Ale1Package.eINSTANCE.eClass();
		Ale2Package.eINSTANCE.eClass();
		Ale3Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theBrewPackage.createPackageContents();

		// Initialize created meta-data
		theBrewPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBrewPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BrewPackage.eNS_URI, theBrewPackage);
		return theBrewPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRA1BindB() {
		return ra1BindBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRA1BindB_Delegate() {
		return (EReference)ra1BindBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRA2BindC1() {
		return ra2BindC1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRA2BindC1_Delegate() {
		return (EReference)ra2BindC1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRBBindC1() {
		return rbBindC1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBBindC1_Delegate() {
		return (EReference)rbBindC1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRBBindC2() {
		return rbBindC2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBBindC2_Delegate() {
		return (EReference)rbBindC2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrewFactory getBrewFactory() {
		return (BrewFactory)getEFactoryInstance();
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
		ra1BindBEClass = createEClass(RA1_BIND_B);
		createEReference(ra1BindBEClass, RA1_BIND_B__DELEGATE);

		ra2BindC1EClass = createEClass(RA2_BIND_C1);
		createEReference(ra2BindC1EClass, RA2_BIND_C1__DELEGATE);

		rbBindC1EClass = createEClass(RB_BIND_C1);
		createEReference(rbBindC1EClass, RB_BIND_C1__DELEGATE);

		rbBindC2EClass = createEClass(RB_BIND_C2);
		createEReference(rbBindC2EClass, RB_BIND_C2__DELEGATE);
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
		Ale1Package theAle1Package = (Ale1Package)EPackage.Registry.INSTANCE.getEPackage(Ale1Package.eNS_URI);
		Ale2Package theAle2Package = (Ale2Package)EPackage.Registry.INSTANCE.getEPackage(Ale2Package.eNS_URI);
		Ale3Package theAle3Package = (Ale3Package)EPackage.Registry.INSTANCE.getEPackage(Ale3Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ra1BindBEClass.getESuperTypes().add(theAle1Package.getRA1());
		ra2BindC1EClass.getESuperTypes().add(theAle1Package.getRA2());
		rbBindC1EClass.getESuperTypes().add(theAle2Package.getRB());
		rbBindC2EClass.getESuperTypes().add(theAle2Package.getRB());

		// Initialize classes, features, and operations; add parameters
		initEClass(ra1BindBEClass, RA1BindB.class, "RA1BindB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRA1BindB_Delegate(), theAle2Package.getB(), null, "delegate", null, 1, 1, RA1BindB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ra2BindC1EClass, RA2BindC1.class, "RA2BindC1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRA2BindC1_Delegate(), theAle3Package.getC1(), null, "delegate", null, 1, 1, RA2BindC1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rbBindC1EClass, RBBindC1.class, "RBBindC1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRBBindC1_Delegate(), theAle3Package.getC1(), null, "delegate", null, 1, 1, RBBindC1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rbBindC2EClass, RBBindC2.class, "RBBindC2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRBBindC2_Delegate(), theAle3Package.getC2(), null, "delegate", null, 1, 1, RBBindC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BrewPackageImpl
