/**
 */
package idlmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idlmm.PrimitiveDef#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see idlmm.IdlmmPackage#getPrimitiveDef()
 * @model
 * @generated
 */
public interface PrimitiveDef extends IDLType {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link idlmm.PrimitiveKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see idlmm.PrimitiveKind
	 * @see #setKind(PrimitiveKind)
	 * @see idlmm.IdlmmPackage#getPrimitiveDef_Kind()
	 * @model
	 * @generated
	 */
	PrimitiveKind getKind();

	/**
	 * Sets the value of the '{@link idlmm.PrimitiveDef#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see idlmm.PrimitiveKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PrimitiveKind value);

} // PrimitiveDef
