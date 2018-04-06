/**
 */
package brew;

import ale2.RB;

import ale3.C1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RB Bind C1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link brew.RBBindC1#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see brew.BrewPackage#getRBBindC1()
 * @model
 * @generated
 */
public interface RBBindC1 extends RB {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(C1)
	 * @see brew.BrewPackage#getRBBindC1_Delegate()
	 * @model required="true"
	 * @generated
	 */
	C1 getDelegate();

	/**
	 * Sets the value of the '{@link brew.RBBindC1#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(C1 value);

} // RBBindC1
