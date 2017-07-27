/**
 */
package guardedfsm;

import boolexp.Exp;

import minifsm.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guarded</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link guardedfsm.Guarded#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see guardedfsm.GuardedfsmPackage#getGuarded()
 * @model
 * @generated
 */
public interface Guarded extends Transition {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Exp)
	 * @see guardedfsm.GuardedfsmPackage#getGuarded_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Exp getGuard();

	/**
	 * Sets the value of the '{@link guardedfsm.Guarded#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Exp value);

} // Guarded
