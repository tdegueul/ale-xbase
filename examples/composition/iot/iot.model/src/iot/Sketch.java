/**
 */
package iot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sketch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.Sketch#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see iot.IotPackage#getSketch()
 * @model
 * @generated
 */
public interface Sketch extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(IotActivity)
	 * @see iot.IotPackage#getSketch_Activity()
	 * @model containment="true"
	 * @generated
	 */
	IotActivity getActivity();

	/**
	 * Sets the value of the '{@link iot.Sketch#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(IotActivity value);

} // Sketch
