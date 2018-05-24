/**
 */
package iotlua;

import activitydiagram.BooleanVariable;

import org.xtext.lua.lua.Statement_Assignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable Bind Statement Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iotlua.BooleanVariableBindStatement_Assignment#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iotlua.IotluaPackage#getBooleanVariableBindStatement_Assignment()
 * @model
 * @generated
 */
public interface BooleanVariableBindStatement_Assignment extends BooleanVariable {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(Statement_Assignment)
	 * @see iotlua.IotluaPackage#getBooleanVariableBindStatement_Assignment_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Statement_Assignment getDelegate();

	/**
	 * Sets the value of the '{@link iotlua.BooleanVariableBindStatement_Assignment#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Statement_Assignment value);

} // BooleanVariableBindStatement_Assignment
