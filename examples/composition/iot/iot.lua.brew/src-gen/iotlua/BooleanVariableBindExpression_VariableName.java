/**
 */
package iotlua;

import activitydiagram.BooleanVariable;

import org.xtext.lua.lua.Expression_VariableName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable Bind Expression Variable Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iotlua.BooleanVariableBindExpression_VariableName#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iotlua.IotluaPackage#getBooleanVariableBindExpression_VariableName()
 * @model
 * @generated
 */
public interface BooleanVariableBindExpression_VariableName extends BooleanVariable {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(Expression_VariableName)
	 * @see iotlua.IotluaPackage#getBooleanVariableBindExpression_VariableName_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Expression_VariableName getDelegate();

	/**
	 * Sets the value of the '{@link iotlua.BooleanVariableBindExpression_VariableName#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Expression_VariableName value);

} // BooleanVariableBindExpression_VariableName
