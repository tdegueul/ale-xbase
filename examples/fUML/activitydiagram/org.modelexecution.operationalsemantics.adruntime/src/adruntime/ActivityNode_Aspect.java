/**
 */
package adruntime;

import adwithoutruntime.ActivityNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adruntime.ActivityNode_Aspect#getHeldTokens <em>Held Tokens</em>}</li>
 *   <li>{@link adruntime.ActivityNode_Aspect#isRunning <em>Running</em>}</li>
 * </ul>
 *
 * @see adruntime.AdruntimePackage#getActivityNode_Aspect()
 * @model
 * @generated
 */
public interface ActivityNode_Aspect extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Held Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link adruntime.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Tokens</em>' containment reference list.
	 * @see adruntime.AdruntimePackage#getActivityNode_Aspect_HeldTokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getHeldTokens();

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see adruntime.AdruntimePackage#getActivityNode_Aspect_Running()
	 * @model
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link adruntime.ActivityNode_Aspect#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

} // ActivityNode_Aspect
