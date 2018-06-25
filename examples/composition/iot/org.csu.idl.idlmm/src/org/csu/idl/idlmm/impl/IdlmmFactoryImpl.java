/**
 */
package org.csu.idl.idlmm.impl;

import org.csu.idl.idlmm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdlmmFactoryImpl extends EFactoryImpl implements IdlmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IdlmmFactory init() {
		try {
			IdlmmFactory theIdlmmFactory = (IdlmmFactory)EPackage.Registry.INSTANCE.getEFactory(IdlmmPackage.eNS_URI);
			if (theIdlmmFactory != null) {
				return theIdlmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IdlmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlmmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IdlmmPackage.OPERATION_DEF: return createOperationDef();
			case IdlmmPackage.PARAMETER_DEF: return createParameterDef();
			case IdlmmPackage.EXCEPTION_DEF: return createExceptionDef();
			case IdlmmPackage.FIELD: return createField();
			case IdlmmPackage.PRIMITIVE_DEF: return createPrimitiveDef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IdlmmPackage.PARAMETER_MODE:
				return createParameterModeFromString(eDataType, initialValue);
			case IdlmmPackage.PRIMITIVE_KIND:
				return createPrimitiveKindFromString(eDataType, initialValue);
			case IdlmmPackage.ETYPE_CODE:
				return createETypeCodeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IdlmmPackage.PARAMETER_MODE:
				return convertParameterModeToString(eDataType, instanceValue);
			case IdlmmPackage.PRIMITIVE_KIND:
				return convertPrimitiveKindToString(eDataType, instanceValue);
			case IdlmmPackage.ETYPE_CODE:
				return convertETypeCodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDef createOperationDef() {
		OperationDefImpl operationDef = new OperationDefImpl();
		return operationDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDef createParameterDef() {
		ParameterDefImpl parameterDef = new ParameterDefImpl();
		return parameterDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionDef createExceptionDef() {
		ExceptionDefImpl exceptionDef = new ExceptionDefImpl();
		return exceptionDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDef createPrimitiveDef() {
		PrimitiveDefImpl primitiveDef = new PrimitiveDefImpl();
		return primitiveDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMode createParameterModeFromString(EDataType eDataType, String initialValue) {
		ParameterMode result = ParameterMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveKind createPrimitiveKindFromString(EDataType eDataType, String initialValue) {
		PrimitiveKind result = PrimitiveKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createETypeCodeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETypeCodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlmmPackage getIdlmmPackage() {
		return (IdlmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IdlmmPackage getPackage() {
		return IdlmmPackage.eINSTANCE;
	}

} //IdlmmFactoryImpl
