/**
 */
package fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsm.Machine#getName <em>Name</em>}</li>
 *   <li>{@link fsm.Machine#getStates <em>States</em>}</li>
 *   <li>{@link fsm.Machine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see fsm.FsmPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fsm.FsmPackage#getMachine_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fsm.Machine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link fsm.State}.
	 * It is bidirectional and its opposite is '{@link fsm.State#getOwning <em>Owning</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see fsm.FsmPackage#getMachine_States()
	 * @see fsm.State#getOwning
	 * @model opposite="owning" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link fsm.Transition#getOwning <em>Owning</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see fsm.FsmPackage#getMachine_Transitions()
	 * @see fsm.Transition#getOwning
	 * @model opposite="owning" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // Machine
