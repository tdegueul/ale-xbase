/**
 */
package fullfsmeval;

import basicFsmEnv.Action;

import simpleALEnv.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Bind Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fullfsmeval.ActionBindBlock#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see fullfsmeval.FullfsmevalPackage#getActionBindBlock()
 * @model
 * @generated
 */
public interface ActionBindBlock extends Action {
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
	 * @see fullfsmeval.FullfsmevalPackage#getActionBindBlock_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Block getDelegate();

	/**
	 * Sets the value of the '{@link fullfsmeval.ActionBindBlock#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Block value);

} // ActionBindBlock
