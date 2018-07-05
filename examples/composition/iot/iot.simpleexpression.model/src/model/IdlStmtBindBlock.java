/**
 */
package model;

import idlmm.IdlStmt;

import simpleALEnv.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Idl Stmt Bind Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.IdlStmtBindBlock#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getIdlStmtBindBlock()
 * @model
 * @generated
 */
public interface IdlStmtBindBlock extends IdlStmt {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(Block)
	 * @see model.ModelPackage#getIdlStmtBindBlock_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	Block getDelegate();

	/**
	 * Sets the value of the '{@link model.IdlStmtBindBlock#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Block value);

} // IdlStmtBindBlock
