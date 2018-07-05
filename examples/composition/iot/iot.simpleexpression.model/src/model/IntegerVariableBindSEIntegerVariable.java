/**
 */
package model;

import activitydiagram.IntegerVariable;
import simpleexpressions.SEIntegerVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Variable Bind SE Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.IntegerVariableBindSEIntegerVariable#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getIntegerVariableBindSEIntegerVariable()
 * @model
 * @generated
 */
public interface IntegerVariableBindSEIntegerVariable extends IntegerVariable {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(SEIntegerVariable)
	 * @see model.ModelPackage#getIntegerVariableBindSEIntegerVariable_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	SEIntegerVariable getDelegate();

	/**
	 * Sets the value of the '{@link model.IntegerVariableBindSEIntegerVariable#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(SEIntegerVariable value);

} // IntegerVariableBindSEIntegerVariable
