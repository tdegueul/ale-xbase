/**
 */
package activitydiagram_simpleexpressions.impl;

import activitydiagram.ActivitydiagramPackage;

import activitydiagram_simpleexpressions.Activitydiagram_simpleexpressionsFactory;
import activitydiagram_simpleexpressions.Activitydiagram_simpleexpressionsPackage;
import activitydiagram_simpleexpressions.BooleanVariableBindSEBooleanVariable;
import activitydiagram_simpleexpressions.ExpBindSEExpression;
import activitydiagram_simpleexpressions.IntegerVariableBindSEIntegerVariable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleexpressions.SimpleexpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Activitydiagram_simpleexpressionsPackageImpl extends EPackageImpl implements Activitydiagram_simpleexpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expBindSEExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableBindSEBooleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableBindSEIntegerVariableEClass = null;

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
	 * @see activitydiagram_simpleexpressions.Activitydiagram_simpleexpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Activitydiagram_simpleexpressionsPackageImpl() {
		super(eNS_URI, Activitydiagram_simpleexpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Activitydiagram_simpleexpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Activitydiagram_simpleexpressionsPackage init() {
		if (isInited) return (Activitydiagram_simpleexpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(Activitydiagram_simpleexpressionsPackage.eNS_URI);

		// Obtain or create and register package
		Activitydiagram_simpleexpressionsPackageImpl theActivitydiagram_simpleexpressionsPackage = (Activitydiagram_simpleexpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Activitydiagram_simpleexpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Activitydiagram_simpleexpressionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();
		SimpleexpressionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theActivitydiagram_simpleexpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theActivitydiagram_simpleexpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivitydiagram_simpleexpressionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Activitydiagram_simpleexpressionsPackage.eNS_URI, theActivitydiagram_simpleexpressionsPackage);
		return theActivitydiagram_simpleexpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpBindSEExpression() {
		return expBindSEExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpBindSEExpression_Delegate() {
		return (EReference)expBindSEExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariableBindSEBooleanVariable() {
		return booleanVariableBindSEBooleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanVariableBindSEBooleanVariable_Delegate() {
		return (EReference)booleanVariableBindSEBooleanVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariableBindSEIntegerVariable() {
		return integerVariableBindSEIntegerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerVariableBindSEIntegerVariable_Delegate() {
		return (EReference)integerVariableBindSEIntegerVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_simpleexpressionsFactory getActivitydiagram_simpleexpressionsFactory() {
		return (Activitydiagram_simpleexpressionsFactory)getEFactoryInstance();
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
		expBindSEExpressionEClass = createEClass(EXP_BIND_SE_EXPRESSION);
		createEReference(expBindSEExpressionEClass, EXP_BIND_SE_EXPRESSION__DELEGATE);

		booleanVariableBindSEBooleanVariableEClass = createEClass(BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE);
		createEReference(booleanVariableBindSEBooleanVariableEClass, BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE);

		integerVariableBindSEIntegerVariableEClass = createEClass(INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE);
		createEReference(integerVariableBindSEIntegerVariableEClass, INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE__DELEGATE);
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
		ActivitydiagramPackage theActivitydiagramPackage = (ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI);
		SimpleexpressionsPackage theSimpleexpressionsPackage = (SimpleexpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleexpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		expBindSEExpressionEClass.getESuperTypes().add(theActivitydiagramPackage.getExp());
		booleanVariableBindSEBooleanVariableEClass.getESuperTypes().add(theActivitydiagramPackage.getBooleanVariable());
		integerVariableBindSEIntegerVariableEClass.getESuperTypes().add(theActivitydiagramPackage.getIntegerVariable());

		// Initialize classes, features, and operations; add parameters
		initEClass(expBindSEExpressionEClass, ExpBindSEExpression.class, "ExpBindSEExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpBindSEExpression_Delegate(), theSimpleexpressionsPackage.getSEExpression(), null, "delegate", null, 0, 1, ExpBindSEExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanVariableBindSEBooleanVariableEClass, BooleanVariableBindSEBooleanVariable.class, "BooleanVariableBindSEBooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanVariableBindSEBooleanVariable_Delegate(), theSimpleexpressionsPackage.getSEBooleanVariable(), null, "delegate", null, 0, 1, BooleanVariableBindSEBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVariableBindSEIntegerVariableEClass, IntegerVariableBindSEIntegerVariable.class, "IntegerVariableBindSEIntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerVariableBindSEIntegerVariable_Delegate(), theSimpleexpressionsPackage.getSEIntegerVariable(), null, "delegate", null, 0, 1, IntegerVariableBindSEIntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Activitydiagram_simpleexpressionsPackageImpl
