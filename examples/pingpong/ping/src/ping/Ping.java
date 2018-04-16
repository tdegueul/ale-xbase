/**
 */
package ping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ping.Ping#getPong <em>Pong</em>}</li>
 *   <li>{@link ping.Ping#getCptr <em>Cptr</em>}</li>
 * </ul>
 *
 * @see ping.PingPackage#getPing()
 * @model
 * @generated
 */
public interface Ping extends EObject {
	/**
	 * Returns the value of the '<em><b>Pong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pong</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pong</em>' containment reference.
	 * @see #setPong(Pong)
	 * @see ping.PingPackage#getPing_Pong()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pong getPong();

	/**
	 * Sets the value of the '{@link ping.Ping#getPong <em>Pong</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pong</em>' containment reference.
	 * @see #getPong()
	 * @generated
	 */
	void setPong(Pong value);

	/**
	 * Returns the value of the '<em><b>Cptr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cptr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cptr</em>' attribute.
	 * @see #setCptr(int)
	 * @see ping.PingPackage#getPing_Cptr()
	 * @model
	 * @generated
	 */
	int getCptr();

	/**
	 * Sets the value of the '{@link ping.Ping#getCptr <em>Cptr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cptr</em>' attribute.
	 * @see #getCptr()
	 * @generated
	 */
	void setCptr(int value);

} // Ping
