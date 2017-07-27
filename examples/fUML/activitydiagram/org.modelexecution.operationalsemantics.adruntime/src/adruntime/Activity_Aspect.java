/**
 */
package adruntime;

import adwithoutruntime.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adruntime.Activity_Aspect#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @see adruntime.AdruntimePackage#getActivity_Aspect()
 * @model
 * @generated
 */
public interface Activity_Aspect extends Activity {
	/**
	 * Returns the value of the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' containment reference.
	 * @see #setTrace(Trace)
	 * @see adruntime.AdruntimePackage#getActivity_Aspect_Trace()
	 * @model containment="true"
	 * @generated
	 */
	Trace getTrace();

	/**
	 * Sets the value of the '{@link adruntime.Activity_Aspect#getTrace <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' containment reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(Trace value);

} // Activity_Aspect
