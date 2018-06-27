/**
 */
package idlmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idlmm.ExceptionDef#getTypeCode <em>Type Code</em>}</li>
 *   <li>{@link idlmm.ExceptionDef#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see idlmm.IdlmmPackage#getExceptionDef()
 * @model
 * @generated
 */
public interface ExceptionDef extends Contained {
	/**
	 * Returns the value of the '<em><b>Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Code</em>' attribute.
	 * @see #setTypeCode(String)
	 * @see idlmm.IdlmmPackage#getExceptionDef_TypeCode()
	 * @model dataType="idlmm.ETypeCode"
	 * @generated
	 */
	String getTypeCode();

	/**
	 * Sets the value of the '{@link idlmm.ExceptionDef#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Code</em>' attribute.
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link idlmm.FieldI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see idlmm.IdlmmPackage#getExceptionDef_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldI> getMembers();

} // ExceptionDef
