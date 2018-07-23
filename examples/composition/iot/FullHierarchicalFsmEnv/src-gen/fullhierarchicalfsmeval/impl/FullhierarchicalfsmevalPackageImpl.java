/**
 */
package fullhierarchicalfsmeval.impl;

import basicFsmEnv.BasicFsmEnvPackage;

import boolExpEnv.BoolExpEnvPackage;

import fullhierarchicalfsmeval.ActionBindBlock;
import fullhierarchicalfsmeval.FullhierarchicalfsmevalFactory;
import fullhierarchicalfsmeval.FullhierarchicalfsmevalPackage;
import fullhierarchicalfsmeval.GuardBindExp;

import hierarchicalFsmEnv.HierarchicalFsmEnvPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleALEnv.SimpleALEnvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FullhierarchicalfsmevalPackageImpl extends EPackageImpl implements FullhierarchicalfsmevalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionBindBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardBindExpEClass = null;

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
	 * @see fullhierarchicalfsmeval.FullhierarchicalfsmevalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FullhierarchicalfsmevalPackageImpl() {
		super(eNS_URI, FullhierarchicalfsmevalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FullhierarchicalfsmevalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FullhierarchicalfsmevalPackage init() {
		if (isInited) return (FullhierarchicalfsmevalPackage)EPackage.Registry.INSTANCE.getEPackage(FullhierarchicalfsmevalPackage.eNS_URI);

		// Obtain or create and register package
		FullhierarchicalfsmevalPackageImpl theFullhierarchicalfsmevalPackage = (FullhierarchicalfsmevalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FullhierarchicalfsmevalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FullhierarchicalfsmevalPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		HierarchicalFsmEnvPackage.eINSTANCE.eClass();
		BasicFsmEnvPackage.eINSTANCE.eClass();
		BoolExpEnvPackage.eINSTANCE.eClass();
		SimpleALEnvPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFullhierarchicalfsmevalPackage.createPackageContents();

		// Initialize created meta-data
		theFullhierarchicalfsmevalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFullhierarchicalfsmevalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FullhierarchicalfsmevalPackage.eNS_URI, theFullhierarchicalfsmevalPackage);
		return theFullhierarchicalfsmevalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionBindBlock() {
		return actionBindBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBindBlock_Delegate() {
		return (EReference)actionBindBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardBindExp() {
		return guardBindExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardBindExp_Delegate() {
		return (EReference)guardBindExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullhierarchicalfsmevalFactory getFullhierarchicalfsmevalFactory() {
		return (FullhierarchicalfsmevalFactory)getEFactoryInstance();
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
		actionBindBlockEClass = createEClass(ACTION_BIND_BLOCK);
		createEReference(actionBindBlockEClass, ACTION_BIND_BLOCK__DELEGATE);

		guardBindExpEClass = createEClass(GUARD_BIND_EXP);
		createEReference(guardBindExpEClass, GUARD_BIND_EXP__DELEGATE);
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
		SimpleALEnvPackage theSimpleALEnvPackage = (SimpleALEnvPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleALEnvPackage.eNS_URI);
		BoolExpEnvPackage theBoolExpEnvPackage = (BoolExpEnvPackage)EPackage.Registry.INSTANCE.getEPackage(BoolExpEnvPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionBindBlockEClass.getESuperTypes().add(theBasicFsmEnvPackage.getAction());
		guardBindExpEClass.getESuperTypes().add(theBasicFsmEnvPackage.getGuard());

		// Initialize classes, features, and operations; add parameters
		initEClass(actionBindBlockEClass, ActionBindBlock.class, "ActionBindBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionBindBlock_Delegate(), theSimpleALEnvPackage.getBlock(), null, "delegate", null, 1, 1, ActionBindBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guardBindExpEClass, GuardBindExp.class, "GuardBindExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuardBindExp_Delegate(), theBoolExpEnvPackage.getExp(), null, "delegate", null, 1, 1, GuardBindExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// @BrewRequires
		create_BrewRequiresAnnotations();
	}

	/**
	 * Initializes the annotations for <b>@BrewRequires</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_BrewRequiresAnnotations() {
		String source = "@BrewRequires";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "platform:/resource/HierarchicalFsmEnv/model/hierarchicalFsmEnv.ecore", "ecoreUrl",
			 "platform:/resource/BoolExpEnv/model/boolExpEnv.ecore", "ecoreUrl",
			 "platform:/resource/SimpleALEnv/model/simpleALEnv.ecore", "ecoreUrl"
		   });
	}

} //FullhierarchicalfsmevalPackageImpl
