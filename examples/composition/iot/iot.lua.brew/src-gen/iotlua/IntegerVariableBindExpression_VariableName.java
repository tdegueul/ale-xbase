/**
 */
package iotlua;

import activitydiagram.IntegerVariable;

import org.xtext.lua.lua.Expression_VariableName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Variable Bind Expression Variable Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iotlua.IntegerVariableBindExpression_VariableName#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iotlua.IotluaPackage#getIntegerVariableBindExpression_VariableName()
 * @model
 * @generated
 */
public interface IntegerVariableBindExpression_VariableName extends IntegerVariable {
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
	 * @see iotlua.IotluaPackage#getIntegerVariableBindExpression_VariableName_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Expression_VariableName getDelegate();

	/**
	 * Sets the value of the '{@link iotlua.IntegerVariableBindExpression_VariableName#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Expression_VariableName value);

} // IntegerVariableBindExpression_VariableName
