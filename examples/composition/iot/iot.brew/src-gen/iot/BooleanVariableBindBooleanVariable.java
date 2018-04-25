/**
 */
package iot;

import activitydiagram.BooleanVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable Bind Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.BooleanVariableBindBooleanVariable#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iot.IotPackage#getBooleanVariableBindBooleanVariable()
 * @model
 * @generated
 */
public interface BooleanVariableBindBooleanVariable extends BooleanVariable {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(simpleexpressions.BooleanVariable)
	 * @see iot.IotPackage#getBooleanVariableBindBooleanVariable_Delegate()
	 * @model required="true"
	 * @generated
	 */
	simpleexpressions.BooleanVariable getDelegate();

	/**
	 * Sets the value of the '{@link iot.BooleanVariableBindBooleanVariable#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(simpleexpressions.BooleanVariable value);

} // BooleanVariableBindBooleanVariable
