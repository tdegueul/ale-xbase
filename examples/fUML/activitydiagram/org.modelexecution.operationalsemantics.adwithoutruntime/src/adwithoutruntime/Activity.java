/**
 */
package adwithoutruntime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adwithoutruntime.Activity#getNodes <em>Nodes</em>}</li>
 *   <li>{@link adwithoutruntime.Activity#getEdges <em>Edges</em>}</li>
 *   <li>{@link adwithoutruntime.Activity#getLocals <em>Locals</em>}</li>
 *   <li>{@link adwithoutruntime.Activity#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see adwithoutruntime.AdwithoutruntimePackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link adwithoutruntime.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link adwithoutruntime.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see adwithoutruntime.AdwithoutruntimePackage#getActivity_Nodes()
	 * @see adwithoutruntime.ActivityNode#getActivity
	 * @model opposite="activity" containment="true"
	 * @generated
	 */
	EList<ActivityNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link adwithoutruntime.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see adwithoutruntime.AdwithoutruntimePackage#getActivity_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getEdges();

	/**
	 * Returns the value of the '<em><b>Locals</b></em>' containment reference list.
	 * The list contents are of type {@link adwithoutruntime.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locals</em>' containment reference list.
	 * @see adwithoutruntime.AdwithoutruntimePackage#getActivity_Locals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getLocals();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link adwithoutruntime.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see adwithoutruntime.AdwithoutruntimePackage#getActivity_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getInputs();

} // Activity
