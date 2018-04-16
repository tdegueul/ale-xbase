/**
 */
package pingpongsem;

import ping.Pong;

import pong.PPong;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pong Bind PPong</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pingpongsem.PongBindPPong#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see pingpongsem.PingpongsemPackage#getPongBindPPong()
 * @model
 * @generated
 */
public interface PongBindPPong extends Pong {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(PPong)
	 * @see pingpongsem.PingpongsemPackage#getPongBindPPong_Delegate()
	 * @model required="true"
	 * @generated
	 */
	PPong getDelegate();

	/**
	 * Sets the value of the '{@link pingpongsem.PongBindPPong#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(PPong value);

} // PongBindPPong
