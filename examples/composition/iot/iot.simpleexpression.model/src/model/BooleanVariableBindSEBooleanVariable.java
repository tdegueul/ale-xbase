/**
 */
package model;

import activitydiagram.BooleanVariable;

import simpleexpressions.SEBooleanVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable Bind SE Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.BooleanVariableBindSEBooleanVariable#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getBooleanVariableBindSEBooleanVariable()
 * @model
 * @generated
 */
public interface BooleanVariableBindSEBooleanVariable extends BooleanVariable {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(SEBooleanVariable)
	 * @see model.ModelPackage#getBooleanVariableBindSEBooleanVariable_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	SEBooleanVariable getDelegate();

	/**
	 * Sets the value of the '{@link model.BooleanVariableBindSEBooleanVariable#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(SEBooleanVariable value);

} // BooleanVariableBindSEBooleanVariable
