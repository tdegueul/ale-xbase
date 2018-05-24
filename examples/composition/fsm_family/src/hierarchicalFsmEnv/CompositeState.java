/**
 */
package hierarchicalFsmEnv;

import basicFsmEnv.State;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hierarchicalFsmEnv.CompositeState#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see hierarchicalFsmEnv.HierarchicalFsmEnvPackage#getCompositeState()
 * @model
 * @generated
 */
public interface CompositeState extends State {
	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link hierarchicalFsmEnv.Region}.
	 * It is bidirectional and its opposite is '{@link hierarchicalFsmEnv.Region#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see hierarchicalFsmEnv.HierarchicalFsmEnvPackage#getCompositeState_Regions()
	 * @see hierarchicalFsmEnv.Region#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	EList<Region> getRegions();

} // CompositeState
