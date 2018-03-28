/**
 */
package composeabprint;

import simplea.B;

import simpleb.B1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BBind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link composeabprint.BBind#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see composeabprint.ComposeabprintPackage#getBBind()
 * @model
 * @generated
 */
public interface BBind extends B {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(B1)
	 * @see composeabprint.ComposeabprintPackage#getBBind_Delegate()
	 * @model required="true"
	 * @generated
	 */
	B1 getDelegate();

	/**
	 * Sets the value of the '{@link composeabprint.BBind#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(B1 value);

} // BBind
