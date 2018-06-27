/**
 */
package iot_lua;

import idlmm.OperationDef;

import iot.IotOperationDef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iot Operation Def Bind Operation Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot_lua.IotOperationDefBindOperationDef#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iot_lua.Iot_luaPackage#getIotOperationDefBindOperationDef()
 * @model
 * @generated
 */
public interface IotOperationDefBindOperationDef extends IotOperationDef {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(OperationDef)
	 * @see iot_lua.Iot_luaPackage#getIotOperationDefBindOperationDef_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	OperationDef getDelegate();

	/**
	 * Sets the value of the '{@link iot_lua.IotOperationDefBindOperationDef#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(OperationDef value);

} // IotOperationDefBindOperationDef
