/**
 */
package iot;

import activitydiagram.IntegerVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Variable Bind Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.IntegerVariableBindIntegerVariable#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iot.IotPackage#getIntegerVariableBindIntegerVariable()
 * @model
 * @generated
 */
public interface IntegerVariableBindIntegerVariable extends IntegerVariable {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(simpleexpressions.IntegerVariable)
	 * @see iot.IotPackage#getIntegerVariableBindIntegerVariable_Delegate()
	 * @model required="true"
	 * @generated
	 */
	simpleexpressions.IntegerVariable getDelegate();

	/**
	 * Sets the value of the '{@link iot.IntegerVariableBindIntegerVariable#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(simpleexpressions.IntegerVariable value);

} // IntegerVariableBindIntegerVariable
