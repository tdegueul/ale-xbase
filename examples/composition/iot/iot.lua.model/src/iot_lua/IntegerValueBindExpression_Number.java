/**
 */
package iot_lua;

import activitydiagram.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Value Bind Expression Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot_lua.IntegerValueBindExpression_Number#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iot_lua.Iot_luaPackage#getIntegerValueBindExpression_Number()
 * @model
 * @generated
 */
public interface IntegerValueBindExpression_Number extends IntegerValue {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(org.xtext.lua.lua.Expression_Number)
	 * @see iot_lua.Iot_luaPackage#getIntegerValueBindExpression_Number_Delegate()
	 * @model
	 * @generated
	 */
	org.xtext.lua.lua.Expression_Number getDelegate();

	/**
	 * Sets the value of the '{@link iot_lua.IntegerValueBindExpression_Number#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(org.xtext.lua.lua.Expression_Number value);

} // IntegerValueBindExpression_Number
