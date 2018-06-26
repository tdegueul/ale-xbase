/**
 */
package iot_lua;

import activitydiagram.Exp;
import org.csu.idl.idlmm.OperationDef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Bind Operation Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot_lua.ExpressionBindOperationDef#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iot_lua.Iot_luaPackage#getExpressionBindOperationDef()
 * @model
 * @generated
 */
public interface ExpressionBindOperationDef extends Exp {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(OperationDef)
	 * @see iot_lua.Iot_luaPackage#getExpressionBindOperationDef_Delegate()
	 * @model
	 * @generated
	 */
	OperationDef getDelegate();

	/**
	 * Sets the value of the '{@link iot_lua.ExpressionBindOperationDef#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(OperationDef value);

} // ExpressionBindOperationDef
