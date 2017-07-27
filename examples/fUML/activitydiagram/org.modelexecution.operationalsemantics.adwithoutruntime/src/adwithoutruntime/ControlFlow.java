/**
 */
package adwithoutruntime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adwithoutruntime.ControlFlow#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see adwithoutruntime.AdwithoutruntimePackage#getControlFlow()
 * @model
 * @generated
 */
public interface ControlFlow extends ActivityEdge {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(BooleanVariable)
	 * @see adwithoutruntime.AdwithoutruntimePackage#getControlFlow_Guard()
	 * @model
	 * @generated
	 */
	BooleanVariable getGuard();

	/**
	 * Sets the value of the '{@link adwithoutruntime.ControlFlow#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(BooleanVariable value);

} // ControlFlow
