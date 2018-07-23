/**
 */
package fullhierarchicalfsmeval;

import basicFsmEnv.Guard;

import boolExpEnv.Exp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard Bind Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fullhierarchicalfsmeval.GuardBindExp#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see fullhierarchicalfsmeval.FullhierarchicalfsmevalPackage#getGuardBindExp()
 * @model
 * @generated
 */
public interface GuardBindExp extends Guard {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(Exp)
	 * @see fullhierarchicalfsmeval.FullhierarchicalfsmevalPackage#getGuardBindExp_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Exp getDelegate();

	/**
	 * Sets the value of the '{@link fullhierarchicalfsmeval.GuardBindExp#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Exp value);

} // GuardBindExp
