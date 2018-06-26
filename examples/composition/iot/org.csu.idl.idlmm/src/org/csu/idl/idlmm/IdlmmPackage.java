/**
 */
package org.csu.idl.idlmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.csu.idl.idlmm.IdlmmFactory
 * @model kind="package"
 * @generated
 */
public interface IdlmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "idlmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://idlmm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "idlmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdlmmPackage eINSTANCE = org.csu.idl.idlmm.impl.IdlmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.NamedElementImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ContainedImpl <em>Contained</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ContainedImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getContained()
	 * @generated
	 */
	int CONTAINED = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__IDENTIFIER = NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__REPOSITORY_ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__ABSOLUTE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED__DEFINED_IN = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Contained</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.OperationDefImpl <em>Operation Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.OperationDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getOperationDef()
	 * @generated
	 */
	int OPERATION_DEF = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__IDENTIFIER = CONTAINED__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__REPOSITORY_ID = CONTAINED__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__VERSION = CONTAINED__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__ABSOLUTE_NAME = CONTAINED__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__DEFINED_IN = CONTAINED__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__CONTAINED_TYPE = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__SHARED_TYPE = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__PARAMETERS = CONTAINED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Oneway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__IS_ONEWAY = CONTAINED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__CONTEXTS = CONTAINED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Can Raise</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF__CAN_RAISE = CONTAINED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Operation Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEF_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ContainerImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IDENTIFIER = CONTAINED__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__REPOSITORY_ID = CONTAINED__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VERSION = CONTAINED__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ABSOLUTE_NAME = CONTAINED__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DEFINED_IN = CONTAINED__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINS = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.TypedImpl <em>Typed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.TypedImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getTyped()
	 * @generated
	 */
	int TYPED = 4;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED__CONTAINED_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED__SHARED_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.IDLTypeImpl <em>IDL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.IDLTypeImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getIDLType()
	 * @generated
	 */
	int IDL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE__TYPE_CODE = 0;

	/**
	 * The number of structural features of the '<em>IDL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.TypedefDefImpl <em>Typedef Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.TypedefDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getTypedefDef()
	 * @generated
	 */
	int TYPEDEF_DEF = 6;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__TYPE_CODE = IDL_TYPE__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__IDENTIFIER = IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__REPOSITORY_ID = IDL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__VERSION = IDL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__ABSOLUTE_NAME = IDL_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF__DEFINED_IN = IDL_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Typedef Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_DEF_FEATURE_COUNT = IDL_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ParameterDefImpl <em>Parameter Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ParameterDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getParameterDef()
	 * @generated
	 */
	int PARAMETER_DEF = 7;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__CONTAINED_TYPE = TYPED__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__SHARED_TYPE = TYPED__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__IDENTIFIER = TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF__DIRECTION = TYPED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEF_FEATURE_COUNT = TYPED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.ExceptionDefImpl <em>Exception Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.ExceptionDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getExceptionDef()
	 * @generated
	 */
	int EXCEPTION_DEF = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__IDENTIFIER = CONTAINED__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__REPOSITORY_ID = CONTAINED__REPOSITORY_ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__VERSION = CONTAINED__VERSION;

	/**
	 * The feature id for the '<em><b>Absolute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__ABSOLUTE_NAME = CONTAINED__ABSOLUTE_NAME;

	/**
	 * The feature id for the '<em><b>Defined In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__DEFINED_IN = CONTAINED__DEFINED_IN;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__TYPE_CODE = CONTAINED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF__MEMBERS = CONTAINED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exception Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_DEF_FEATURE_COUNT = CONTAINED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.FieldIImpl <em>Field I</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.FieldIImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getFieldI()
	 * @generated
	 */
	int FIELD_I = 9;

	/**
	 * The feature id for the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I__CONTAINED_TYPE = TYPED__CONTAINED_TYPE;

	/**
	 * The feature id for the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I__SHARED_TYPE = TYPED__SHARED_TYPE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I__IDENTIFIER = TYPED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field I</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_I_FEATURE_COUNT = TYPED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.impl.PrimitiveDefImpl <em>Primitive Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.impl.PrimitiveDefImpl
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getPrimitiveDef()
	 * @generated
	 */
	int PRIMITIVE_DEF = 10;

	/**
	 * The feature id for the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DEF__TYPE_CODE = IDL_TYPE__TYPE_CODE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DEF__KIND = IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DEF_FEATURE_COUNT = IDL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.ParameterMode <em>Parameter Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.ParameterMode
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getParameterMode()
	 * @generated
	 */
	int PARAMETER_MODE = 11;

	/**
	 * The meta object id for the '{@link org.csu.idl.idlmm.PrimitiveKind <em>Primitive Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.csu.idl.idlmm.PrimitiveKind
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getPrimitiveKind()
	 * @generated
	 */
	int PRIMITIVE_KIND = 12;

	/**
	 * The meta object id for the '<em>EType Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getETypeCode()
	 * @generated
	 */
	int ETYPE_CODE = 13;


	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.OperationDef <em>Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Def</em>'.
	 * @see org.csu.idl.idlmm.OperationDef
	 * @generated
	 */
	EClass getOperationDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.csu.idl.idlmm.OperationDef#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.csu.idl.idlmm.OperationDef#getParameters()
	 * @see #getOperationDef()
	 * @generated
	 */
	EReference getOperationDef_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.OperationDef#isIsOneway <em>Is Oneway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Oneway</em>'.
	 * @see org.csu.idl.idlmm.OperationDef#isIsOneway()
	 * @see #getOperationDef()
	 * @generated
	 */
	EAttribute getOperationDef_IsOneway();

	/**
	 * Returns the meta object for the attribute list '{@link org.csu.idl.idlmm.OperationDef#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contexts</em>'.
	 * @see org.csu.idl.idlmm.OperationDef#getContexts()
	 * @see #getOperationDef()
	 * @generated
	 */
	EAttribute getOperationDef_Contexts();

	/**
	 * Returns the meta object for the reference list '{@link org.csu.idl.idlmm.OperationDef#getCanRaise <em>Can Raise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Can Raise</em>'.
	 * @see org.csu.idl.idlmm.OperationDef#getCanRaise()
	 * @see #getOperationDef()
	 * @generated
	 */
	EReference getOperationDef_CanRaise();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.Contained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained</em>'.
	 * @see org.csu.idl.idlmm.Contained
	 * @generated
	 */
	EClass getContained();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.Contained#getRepositoryId <em>Repository Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Id</em>'.
	 * @see org.csu.idl.idlmm.Contained#getRepositoryId()
	 * @see #getContained()
	 * @generated
	 */
	EAttribute getContained_RepositoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.Contained#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.csu.idl.idlmm.Contained#getVersion()
	 * @see #getContained()
	 * @generated
	 */
	EAttribute getContained_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.Contained#getAbsoluteName <em>Absolute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Name</em>'.
	 * @see org.csu.idl.idlmm.Contained#getAbsoluteName()
	 * @see #getContained()
	 * @generated
	 */
	EAttribute getContained_AbsoluteName();

	/**
	 * Returns the meta object for the container reference '{@link org.csu.idl.idlmm.Contained#getDefinedIn <em>Defined In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Defined In</em>'.
	 * @see org.csu.idl.idlmm.Contained#getDefinedIn()
	 * @see #getContained()
	 * @generated
	 */
	EReference getContained_DefinedIn();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.csu.idl.idlmm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.NamedElement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.csu.idl.idlmm.NamedElement#getIdentifier()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Identifier();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.csu.idl.idlmm.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.csu.idl.idlmm.Container#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see org.csu.idl.idlmm.Container#getContains()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Contains();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed</em>'.
	 * @see org.csu.idl.idlmm.Typed
	 * @generated
	 */
	EClass getTyped();

	/**
	 * Returns the meta object for the containment reference '{@link org.csu.idl.idlmm.Typed#getContainedType <em>Contained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Type</em>'.
	 * @see org.csu.idl.idlmm.Typed#getContainedType()
	 * @see #getTyped()
	 * @generated
	 */
	EReference getTyped_ContainedType();

	/**
	 * Returns the meta object for the reference '{@link org.csu.idl.idlmm.Typed#getSharedType <em>Shared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shared Type</em>'.
	 * @see org.csu.idl.idlmm.Typed#getSharedType()
	 * @see #getTyped()
	 * @generated
	 */
	EReference getTyped_SharedType();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.IDLType <em>IDL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDL Type</em>'.
	 * @see org.csu.idl.idlmm.IDLType
	 * @generated
	 */
	EClass getIDLType();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.IDLType#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.csu.idl.idlmm.IDLType#getTypeCode()
	 * @see #getIDLType()
	 * @generated
	 */
	EAttribute getIDLType_TypeCode();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.TypedefDef <em>Typedef Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typedef Def</em>'.
	 * @see org.csu.idl.idlmm.TypedefDef
	 * @generated
	 */
	EClass getTypedefDef();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.ParameterDef <em>Parameter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Def</em>'.
	 * @see org.csu.idl.idlmm.ParameterDef
	 * @generated
	 */
	EClass getParameterDef();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.ParameterDef#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.csu.idl.idlmm.ParameterDef#getIdentifier()
	 * @see #getParameterDef()
	 * @generated
	 */
	EAttribute getParameterDef_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.ParameterDef#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.csu.idl.idlmm.ParameterDef#getDirection()
	 * @see #getParameterDef()
	 * @generated
	 */
	EAttribute getParameterDef_Direction();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.ExceptionDef <em>Exception Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Def</em>'.
	 * @see org.csu.idl.idlmm.ExceptionDef
	 * @generated
	 */
	EClass getExceptionDef();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.ExceptionDef#getTypeCode <em>Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Code</em>'.
	 * @see org.csu.idl.idlmm.ExceptionDef#getTypeCode()
	 * @see #getExceptionDef()
	 * @generated
	 */
	EAttribute getExceptionDef_TypeCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.csu.idl.idlmm.ExceptionDef#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.csu.idl.idlmm.ExceptionDef#getMembers()
	 * @see #getExceptionDef()
	 * @generated
	 */
	EReference getExceptionDef_Members();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.FieldI <em>Field I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field I</em>'.
	 * @see org.csu.idl.idlmm.FieldI
	 * @generated
	 */
	EClass getFieldI();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.FieldI#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.csu.idl.idlmm.FieldI#getIdentifier()
	 * @see #getFieldI()
	 * @generated
	 */
	EAttribute getFieldI_Identifier();

	/**
	 * Returns the meta object for class '{@link org.csu.idl.idlmm.PrimitiveDef <em>Primitive Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Def</em>'.
	 * @see org.csu.idl.idlmm.PrimitiveDef
	 * @generated
	 */
	EClass getPrimitiveDef();

	/**
	 * Returns the meta object for the attribute '{@link org.csu.idl.idlmm.PrimitiveDef#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.csu.idl.idlmm.PrimitiveDef#getKind()
	 * @see #getPrimitiveDef()
	 * @generated
	 */
	EAttribute getPrimitiveDef_Kind();

	/**
	 * Returns the meta object for enum '{@link org.csu.idl.idlmm.ParameterMode <em>Parameter Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Mode</em>'.
	 * @see org.csu.idl.idlmm.ParameterMode
	 * @generated
	 */
	EEnum getParameterMode();

	/**
	 * Returns the meta object for enum '{@link org.csu.idl.idlmm.PrimitiveKind <em>Primitive Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Kind</em>'.
	 * @see org.csu.idl.idlmm.PrimitiveKind
	 * @generated
	 */
	EEnum getPrimitiveKind();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EType Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EType Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getETypeCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdlmmFactory getIdlmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.OperationDefImpl <em>Operation Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.OperationDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getOperationDef()
		 * @generated
		 */
		EClass OPERATION_DEF = eINSTANCE.getOperationDef();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEF__PARAMETERS = eINSTANCE.getOperationDef_Parameters();

		/**
		 * The meta object literal for the '<em><b>Is Oneway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_DEF__IS_ONEWAY = eINSTANCE.getOperationDef_IsOneway();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_DEF__CONTEXTS = eINSTANCE.getOperationDef_Contexts();

		/**
		 * The meta object literal for the '<em><b>Can Raise</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEF__CAN_RAISE = eINSTANCE.getOperationDef_CanRaise();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ContainedImpl <em>Contained</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ContainedImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getContained()
		 * @generated
		 */
		EClass CONTAINED = eINSTANCE.getContained();

		/**
		 * The meta object literal for the '<em><b>Repository Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED__REPOSITORY_ID = eINSTANCE.getContained_RepositoryId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED__VERSION = eINSTANCE.getContained_Version();

		/**
		 * The meta object literal for the '<em><b>Absolute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED__ABSOLUTE_NAME = eINSTANCE.getContained_AbsoluteName();

		/**
		 * The meta object literal for the '<em><b>Defined In</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED__DEFINED_IN = eINSTANCE.getContained_DefinedIn();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.NamedElementImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__IDENTIFIER = eINSTANCE.getNamedElement_Identifier();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ContainerImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTAINS = eINSTANCE.getContainer_Contains();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.TypedImpl <em>Typed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.TypedImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getTyped()
		 * @generated
		 */
		EClass TYPED = eINSTANCE.getTyped();

		/**
		 * The meta object literal for the '<em><b>Contained Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED__CONTAINED_TYPE = eINSTANCE.getTyped_ContainedType();

		/**
		 * The meta object literal for the '<em><b>Shared Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED__SHARED_TYPE = eINSTANCE.getTyped_SharedType();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.IDLTypeImpl <em>IDL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.IDLTypeImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getIDLType()
		 * @generated
		 */
		EClass IDL_TYPE = eINSTANCE.getIDLType();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDL_TYPE__TYPE_CODE = eINSTANCE.getIDLType_TypeCode();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.TypedefDefImpl <em>Typedef Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.TypedefDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getTypedefDef()
		 * @generated
		 */
		EClass TYPEDEF_DEF = eINSTANCE.getTypedefDef();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ParameterDefImpl <em>Parameter Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ParameterDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getParameterDef()
		 * @generated
		 */
		EClass PARAMETER_DEF = eINSTANCE.getParameterDef();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEF__IDENTIFIER = eINSTANCE.getParameterDef_Identifier();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEF__DIRECTION = eINSTANCE.getParameterDef_Direction();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.ExceptionDefImpl <em>Exception Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.ExceptionDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getExceptionDef()
		 * @generated
		 */
		EClass EXCEPTION_DEF = eINSTANCE.getExceptionDef();

		/**
		 * The meta object literal for the '<em><b>Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_DEF__TYPE_CODE = eINSTANCE.getExceptionDef_TypeCode();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_DEF__MEMBERS = eINSTANCE.getExceptionDef_Members();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.FieldIImpl <em>Field I</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.FieldIImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getFieldI()
		 * @generated
		 */
		EClass FIELD_I = eINSTANCE.getFieldI();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_I__IDENTIFIER = eINSTANCE.getFieldI_Identifier();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.impl.PrimitiveDefImpl <em>Primitive Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.impl.PrimitiveDefImpl
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getPrimitiveDef()
		 * @generated
		 */
		EClass PRIMITIVE_DEF = eINSTANCE.getPrimitiveDef();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_DEF__KIND = eINSTANCE.getPrimitiveDef_Kind();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.ParameterMode <em>Parameter Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.ParameterMode
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getParameterMode()
		 * @generated
		 */
		EEnum PARAMETER_MODE = eINSTANCE.getParameterMode();

		/**
		 * The meta object literal for the '{@link org.csu.idl.idlmm.PrimitiveKind <em>Primitive Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.csu.idl.idlmm.PrimitiveKind
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getPrimitiveKind()
		 * @generated
		 */
		EEnum PRIMITIVE_KIND = eINSTANCE.getPrimitiveKind();

		/**
		 * The meta object literal for the '<em>EType Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.csu.idl.idlmm.impl.IdlmmPackageImpl#getETypeCode()
		 * @generated
		 */
		EDataType ETYPE_CODE = eINSTANCE.getETypeCode();

	}

} //IdlmmPackage
