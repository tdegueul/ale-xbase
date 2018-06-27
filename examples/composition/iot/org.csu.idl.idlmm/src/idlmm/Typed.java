/**
 */
package idlmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idlmm.Typed#getContainedType <em>Contained Type</em>}</li>
 *   <li>{@link idlmm.Typed#getSharedType <em>Shared Type</em>}</li>
 * </ul>
 *
 * @see idlmm.IdlmmPackage#getTyped()
 * @model abstract="true"
 * @generated
 */
public interface Typed extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Type</em>' containment reference.
	 * @see #setContainedType(IDLType)
	 * @see idlmm.IdlmmPackage#getTyped_ContainedType()
	 * @model containment="true"
	 * @generated
	 */
	IDLType getContainedType();

	/**
	 * Sets the value of the '{@link idlmm.Typed#getContainedType <em>Contained Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Type</em>' containment reference.
	 * @see #getContainedType()
	 * @generated
	 */
	void setContainedType(IDLType value);

	/**
	 * Returns the value of the '<em><b>Shared Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Type</em>' reference.
	 * @see #setSharedType(TypedefDef)
	 * @see idlmm.IdlmmPackage#getTyped_SharedType()
	 * @model
	 * @generated
	 */
	TypedefDef getSharedType();

	/**
	 * Sets the value of the '{@link idlmm.Typed#getSharedType <em>Shared Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Type</em>' reference.
	 * @see #getSharedType()
	 * @generated
	 */
	void setSharedType(TypedefDef value);

} // Typed
