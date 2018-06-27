/**
 */
package iot_lua;

import idlmm.IdlStmt;

import org.xtext.lua.lua.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Idl Stmt Bind Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot_lua.IdlStmtBindBlock#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iot_lua.Iot_luaPackage#getIdlStmtBindBlock()
 * @model
 * @generated
 */
public interface IdlStmtBindBlock extends IdlStmt {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(Block)
	 * @see iot_lua.Iot_luaPackage#getIdlStmtBindBlock_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	Block getDelegate();

	/**
	 * Sets the value of the '{@link iot_lua.IdlStmtBindBlock#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Block value);

} // IdlStmtBindBlock
