/**
 */
package adruntime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adruntime.Input#getInputValues <em>Input Values</em>}</li>
 * </ul>
 *
 * @see adruntime.AdruntimePackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Values</b></em>' containment reference list.
	 * The list contents are of type {@link adruntime.InputValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Values</em>' containment reference list.
	 * @see adruntime.AdruntimePackage#getInput_InputValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputValue> getInputValues();

} // Input
