/**
 */
package tokenHolder;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>H</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tokenHolder.H#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see tokenHolder.TokenHolderPackage#getH()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface H extends EObject {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link tokenHolder.T}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see tokenHolder.TokenHolderPackage#getH_Tokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<T> getTokens();

} // H
