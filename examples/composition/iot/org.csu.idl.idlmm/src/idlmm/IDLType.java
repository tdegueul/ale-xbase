/**
 */
package idlmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idlmm.IDLType#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 *
 * @see idlmm.IdlmmPackage#getIDLType()
 * @model abstract="true"
 * @generated
 */
public interface IDLType extends EObject {
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
	 * @see idlmm.IdlmmPackage#getIDLType_TypeCode()
	 * @model dataType="idlmm.ETypeCode"
	 * @generated
	 */
	String getTypeCode();

	/**
	 * Sets the value of the '{@link idlmm.IDLType#getTypeCode <em>Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Code</em>' attribute.
	 * @see #getTypeCode()
	 * @generated
	 */
	void setTypeCode(String value);

} // IDLType
