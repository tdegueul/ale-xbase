/**
 */
package fsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsm.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link fsm.Transition#getOwning <em>Owning</em>}</li>
 *   <li>{@link fsm.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link fsm.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see fsm.FsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see fsm.FsmPackage#getTransition_Event()
	 * @model required="true"
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link fsm.Transition#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Owning</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fsm.Machine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning</em>' container reference.
	 * @see #setOwning(Machine)
	 * @see fsm.FsmPackage#getTransition_Owning()
	 * @see fsm.Machine#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	Machine getOwning();

	/**
	 * Sets the value of the '{@link fsm.Transition#getOwning <em>Owning</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning</em>' container reference.
	 * @see #getOwning()
	 * @generated
	 */
	void setOwning(Machine value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fsm.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see fsm.FsmPackage#getTransition_Source()
	 * @see fsm.State#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link fsm.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fsm.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see fsm.FsmPackage#getTransition_Target()
	 * @see fsm.State#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link fsm.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

} // Transition
