/**
 */
package fullfsmeval;

import basicFsmEnv.Action;

import simpleALEnv.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Bind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fullfsmeval.ActionBind#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see fullfsmeval.FullfsmevalPackage#getActionBind()
 * @model
 * @generated
 */
public interface ActionBind extends Action {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(Block)
	 * @see fullfsmeval.FullfsmevalPackage#getActionBind_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Block getDelegate();

	/**
	 * Sets the value of the '{@link fullfsmeval.ActionBind#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Block value);

} // ActionBind
