/**
 */
package timedminifsm.impl;

import minifsm.MinifsmPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import timedminifsm.TimedTransition;
import timedminifsm.TimedminifsmFactory;
import timedminifsm.TimedminifsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedminifsmPackageImpl extends EPackageImpl implements TimedminifsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedTransitionEClass = null;

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
	 * @see timedminifsm.TimedminifsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimedminifsmPackageImpl() {
		super(eNS_URI, TimedminifsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TimedminifsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimedminifsmPackage init() {
		if (isInited) return (TimedminifsmPackage)EPackage.Registry.INSTANCE.getEPackage(TimedminifsmPackage.eNS_URI);

		// Obtain or create and register package
		TimedminifsmPackageImpl theTimedminifsmPackage = (TimedminifsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TimedminifsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TimedminifsmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MinifsmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTimedminifsmPackage.createPackageContents();

		// Initialize created meta-data
		theTimedminifsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimedminifsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimedminifsmPackage.eNS_URI, theTimedminifsmPackage);
		return theTimedminifsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedTransition() {
		return timedTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedTransition_Time() {
		return (EAttribute)timedTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedminifsmFactory getTimedminifsmFactory() {
		return (TimedminifsmFactory)getEFactoryInstance();
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
		timedTransitionEClass = createEClass(TIMED_TRANSITION);
		createEAttribute(timedTransitionEClass, TIMED_TRANSITION__TIME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timedTransitionEClass.getESuperTypes().add(theMinifsmPackage.getTransition());

		// Initialize classes, features, and operations; add parameters
		initEClass(timedTransitionEClass, TimedTransition.class, "TimedTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedTransition_Time(), ecorePackage.getEInt(), "time", null, 0, 1, TimedTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TimedminifsmPackageImpl
