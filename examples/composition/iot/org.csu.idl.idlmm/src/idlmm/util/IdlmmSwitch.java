/**
 */
package idlmm.util;

import idlmm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see idlmm.IdlmmPackage
 * @generated
 */
public class IdlmmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IdlmmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlmmSwitch() {
		if (modelPackage == null) {
			modelPackage = IdlmmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IdlmmPackage.OPERATION_DEF: {
				OperationDef operationDef = (OperationDef)theEObject;
				T result = caseOperationDef(operationDef);
				if (result == null) result = caseContained(operationDef);
				if (result == null) result = caseTyped(operationDef);
				if (result == null) result = caseNamedElement(operationDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.CONTAINED: {
				Contained contained = (Contained)theEObject;
				T result = caseContained(contained);
				if (result == null) result = caseNamedElement(contained);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseContained(container);
				if (result == null) result = caseNamedElement(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.TYPED: {
				Typed typed = (Typed)theEObject;
				T result = caseTyped(typed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.IDL_TYPE: {
				IDLType idlType = (IDLType)theEObject;
				T result = caseIDLType(idlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.TYPEDEF_DEF: {
				TypedefDef typedefDef = (TypedefDef)theEObject;
				T result = caseTypedefDef(typedefDef);
				if (result == null) result = caseIDLType(typedefDef);
				if (result == null) result = caseContained(typedefDef);
				if (result == null) result = caseNamedElement(typedefDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.PARAMETER_DEF: {
				ParameterDef parameterDef = (ParameterDef)theEObject;
				T result = caseParameterDef(parameterDef);
				if (result == null) result = caseTyped(parameterDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.EXCEPTION_DEF: {
				ExceptionDef exceptionDef = (ExceptionDef)theEObject;
				T result = caseExceptionDef(exceptionDef);
				if (result == null) result = caseContained(exceptionDef);
				if (result == null) result = caseNamedElement(exceptionDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.FIELD_I: {
				FieldI fieldI = (FieldI)theEObject;
				T result = caseFieldI(fieldI);
				if (result == null) result = caseTyped(fieldI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.PRIMITIVE_DEF: {
				PrimitiveDef primitiveDef = (PrimitiveDef)theEObject;
				T result = casePrimitiveDef(primitiveDef);
				if (result == null) result = caseIDLType(primitiveDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlmmPackage.IDL_STMT: {
				IdlStmt idlStmt = (IdlStmt)theEObject;
				T result = caseIdlStmt(idlStmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDef(OperationDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contained</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contained</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContained(Contained object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTyped(Typed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDLType(IDLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typedef Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typedef Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedefDef(TypedefDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDef(ParameterDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionDef(ExceptionDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field I</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field I</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldI(FieldI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveDef(PrimitiveDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Idl Stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Idl Stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdlStmt(IdlStmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IdlmmSwitch
