/**
 */
package pingpongsem;

import ping.Ping;

import pong.PPing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PPing Bind Ping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pingpongsem.PPingBindPing#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see pingpongsem.PingpongsemPackage#getPPingBindPing()
 * @model
 * @generated
 */
public interface PPingBindPing extends PPing {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(Ping)
	 * @see pingpongsem.PingpongsemPackage#getPPingBindPing_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Ping getDelegate();

	/**
	 * Sets the value of the '{@link pingpongsem.PPingBindPing#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Ping value);

} // PPingBindPing
