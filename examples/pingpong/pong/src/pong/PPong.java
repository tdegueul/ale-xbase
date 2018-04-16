/**
 */
package pong;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PPong</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pong.PPong#getPping <em>Pping</em>}</li>
 * </ul>
 *
 * @see pong.PongPackage#getPPong()
 * @model
 * @generated
 */
public interface PPong extends EObject {
	/**
	 * Returns the value of the '<em><b>Pping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pping</em>' reference.
	 * @see #setPping(PPing)
	 * @see pong.PongPackage#getPPong_Pping()
	 * @model
	 * @generated
	 */
	PPing getPping();

	/**
	 * Sets the value of the '{@link pong.PPong#getPping <em>Pping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pping</em>' reference.
	 * @see #getPping()
	 * @generated
	 */
	void setPping(PPing value);

} // PPong
