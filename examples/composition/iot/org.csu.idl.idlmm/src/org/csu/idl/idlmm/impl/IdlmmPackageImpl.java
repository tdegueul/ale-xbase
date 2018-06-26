/**
 */
package org.csu.idl.idlmm.impl;

import org.csu.idl.idlmm.Contained;
import org.csu.idl.idlmm.ExceptionDef;
import org.csu.idl.idlmm.FieldI;
import org.csu.idl.idlmm.IDLType;
import org.csu.idl.idlmm.IdlmmFactory;
import org.csu.idl.idlmm.IdlmmPackage;
import org.csu.idl.idlmm.NamedElement;
import org.csu.idl.idlmm.OperationDef;
import org.csu.idl.idlmm.ParameterDef;
import org.csu.idl.idlmm.ParameterMode;
import org.csu.idl.idlmm.PrimitiveDef;
import org.csu.idl.idlmm.PrimitiveKind;
import org.csu.idl.idlmm.Typed;
import org.csu.idl.idlmm.TypedefDef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdlmmPackageImpl extends EPackageImpl implements IdlmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedefDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eTypeCodeEDataType = null;

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
	 * @see org.csu.idl.idlmm.IdlmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdlmmPackageImpl() {
		super(eNS_URI, IdlmmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IdlmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IdlmmPackage init() {
		if (isInited) return (IdlmmPackage)EPackage.Registry.INSTANCE.getEPackage(IdlmmPackage.eNS_URI);

		// Obtain or create and register package
		IdlmmPackageImpl theIdlmmPackage = (IdlmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IdlmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IdlmmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIdlmmPackage.createPackageContents();

		// Initialize created meta-data
		theIdlmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIdlmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IdlmmPackage.eNS_URI, theIdlmmPackage);
		return theIdlmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDef() {
		return operationDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDef_Parameters() {
		return (EReference)operationDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationDef_IsOneway() {
		return (EAttribute)operationDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationDef_Contexts() {
		return (EAttribute)operationDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDef_CanRaise() {
		return (EReference)operationDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContained() {
		return containedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContained_RepositoryId() {
		return (EAttribute)containedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContained_Version() {
		return (EAttribute)containedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContained_AbsoluteName() {
		return (EAttribute)containedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContained_DefinedIn() {
		return (EReference)containedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Identifier() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Contains() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTyped() {
		return typedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTyped_ContainedType() {
		return (EReference)typedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTyped_SharedType() {
		return (EReference)typedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDLType() {
		return idlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDLType_TypeCode() {
		return (EAttribute)idlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedefDef() {
		return typedefDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDef() {
		return parameterDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDef_Identifier() {
		return (EAttribute)parameterDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDef_Direction() {
		return (EAttribute)parameterDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionDef() {
		return exceptionDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionDef_TypeCode() {
		return (EAttribute)exceptionDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionDef_Members() {
		return (EReference)exceptionDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldI() {
		return fieldIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldI_Identifier() {
		return (EAttribute)fieldIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDef() {
		return primitiveDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveDef_Kind() {
		return (EAttribute)primitiveDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterMode() {
		return parameterModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveKind() {
		return primitiveKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getETypeCode() {
		return eTypeCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlmmFactory getIdlmmFactory() {
		return (IdlmmFactory)getEFactoryInstance();
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
		operationDefEClass = createEClass(OPERATION_DEF);
		createEReference(operationDefEClass, OPERATION_DEF__PARAMETERS);
		createEAttribute(operationDefEClass, OPERATION_DEF__IS_ONEWAY);
		createEAttribute(operationDefEClass, OPERATION_DEF__CONTEXTS);
		createEReference(operationDefEClass, OPERATION_DEF__CAN_RAISE);

		containedEClass = createEClass(CONTAINED);
		createEAttribute(containedEClass, CONTAINED__REPOSITORY_ID);
		createEAttribute(containedEClass, CONTAINED__VERSION);
		createEAttribute(containedEClass, CONTAINED__ABSOLUTE_NAME);
		createEReference(containedEClass, CONTAINED__DEFINED_IN);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__IDENTIFIER);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CONTAINS);

		typedEClass = createEClass(TYPED);
		createEReference(typedEClass, TYPED__CONTAINED_TYPE);
		createEReference(typedEClass, TYPED__SHARED_TYPE);

		idlTypeEClass = createEClass(IDL_TYPE);
		createEAttribute(idlTypeEClass, IDL_TYPE__TYPE_CODE);

		typedefDefEClass = createEClass(TYPEDEF_DEF);

		parameterDefEClass = createEClass(PARAMETER_DEF);
		createEAttribute(parameterDefEClass, PARAMETER_DEF__IDENTIFIER);
		createEAttribute(parameterDefEClass, PARAMETER_DEF__DIRECTION);

		exceptionDefEClass = createEClass(EXCEPTION_DEF);
		createEAttribute(exceptionDefEClass, EXCEPTION_DEF__TYPE_CODE);
		createEReference(exceptionDefEClass, EXCEPTION_DEF__MEMBERS);

		fieldIEClass = createEClass(FIELD_I);
		createEAttribute(fieldIEClass, FIELD_I__IDENTIFIER);

		primitiveDefEClass = createEClass(PRIMITIVE_DEF);
		createEAttribute(primitiveDefEClass, PRIMITIVE_DEF__KIND);

		// Create enums
		parameterModeEEnum = createEEnum(PARAMETER_MODE);
		primitiveKindEEnum = createEEnum(PRIMITIVE_KIND);

		// Create data types
		eTypeCodeEDataType = createEDataType(ETYPE_CODE);
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
		operationDefEClass.getESuperTypes().add(this.getContained());
		operationDefEClass.getESuperTypes().add(this.getTyped());
		containedEClass.getESuperTypes().add(this.getNamedElement());
		containerEClass.getESuperTypes().add(this.getContained());
		typedefDefEClass.getESuperTypes().add(this.getIDLType());
		typedefDefEClass.getESuperTypes().add(this.getContained());
		parameterDefEClass.getESuperTypes().add(this.getTyped());
		exceptionDefEClass.getESuperTypes().add(this.getContained());
		fieldIEClass.getESuperTypes().add(this.getTyped());
		primitiveDefEClass.getESuperTypes().add(this.getIDLType());

		// Initialize classes and features; add operations and parameters
		initEClass(operationDefEClass, OperationDef.class, "OperationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationDef_Parameters(), this.getParameterDef(), null, "parameters", null, 0, -1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationDef_IsOneway(), ecorePackage.getEBoolean(), "isOneway", null, 0, 1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationDef_Contexts(), ecorePackage.getEString(), "contexts", null, 0, -1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationDef_CanRaise(), this.getExceptionDef(), null, "canRaise", null, 0, -1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containedEClass, Contained.class, "Contained", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContained_RepositoryId(), ecorePackage.getEString(), "repositoryId", null, 0, 1, Contained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContained_Version(), ecorePackage.getEString(), "version", null, 0, 1, Contained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContained_AbsoluteName(), ecorePackage.getEString(), "absoluteName", null, 0, 1, Contained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContained_DefinedIn(), this.getContainer(), this.getContainer_Contains(), "definedIn", null, 0, 1, Contained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.csu.idl.idlmm.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Contains(), this.getContained(), this.getContained_DefinedIn(), "contains", null, 0, -1, org.csu.idl.idlmm.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedEClass, Typed.class, "Typed", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTyped_ContainedType(), this.getIDLType(), null, "containedType", null, 0, 1, Typed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTyped_SharedType(), this.getTypedefDef(), null, "sharedType", null, 0, 1, Typed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idlTypeEClass, IDLType.class, "IDLType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDLType_TypeCode(), this.getETypeCode(), "typeCode", null, 0, 1, IDLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedefDefEClass, TypedefDef.class, "TypedefDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterDefEClass, ParameterDef.class, "ParameterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterDef_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ParameterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDef_Direction(), this.getParameterMode(), "direction", null, 0, 1, ParameterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionDefEClass, ExceptionDef.class, "ExceptionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExceptionDef_TypeCode(), this.getETypeCode(), "typeCode", null, 0, 1, ExceptionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExceptionDef_Members(), this.getFieldI(), null, "members", null, 0, -1, ExceptionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldIEClass, FieldI.class, "FieldI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldI_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, FieldI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDefEClass, PrimitiveDef.class, "PrimitiveDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveDef_Kind(), this.getPrimitiveKind(), "kind", null, 0, 1, PrimitiveDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameterModeEEnum, ParameterMode.class, "ParameterMode");
		addEEnumLiteral(parameterModeEEnum, ParameterMode.PARAM_IN);
		addEEnumLiteral(parameterModeEEnum, ParameterMode.PARAM_OUT);
		addEEnumLiteral(parameterModeEEnum, ParameterMode.PARAM_INOUT);

		initEEnum(primitiveKindEEnum, PrimitiveKind.class, "PrimitiveKind");
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_NULL);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_VOID);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_SHORT);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_LONG);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_USHORT);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_ULONG);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_FLOAT);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_DOUBLE);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_BOOLEAN);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_CHAR);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_OCTET);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_ANY);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_LONGDOUBLE);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_WSTRING);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_TYPECODE);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_WCHAR);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_PRINCIPAL);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_STRING);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_ULONGLONG);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_OBJREF);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.PK_LONGLONG);

		// Initialize data types
		initEDataType(eTypeCodeEDataType, String.class, "ETypeCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getNamedElement_Identifier(), 
		   source, 
		   new String[] {
		   });
	}

} //IdlmmPackageImpl
