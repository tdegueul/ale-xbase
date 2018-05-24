/**
 */
package hierarchicalFsmEnv;

import basicFsmEnv.State;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hierarchicalFsmEnv.Region#getParent <em>Parent</em>}</li>
 *   <li>{@link hierarchicalFsmEnv.Region#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see hierarchicalFsmEnv.HierarchicalFsmEnvPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hierarchicalFsmEnv.CompositeState#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(CompositeState)
	 * @see hierarchicalFsmEnv.HierarchicalFsmEnvPackage#getRegion_Parent()
	 * @see hierarchicalFsmEnv.CompositeState#getRegions
	 * @model opposite="regions" required="true" transient="false"
	 * @generated
	 */
	CompositeState getParent();

	/**
	 * Sets the value of the '{@link hierarchicalFsmEnv.Region#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CompositeState value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link basicFsmEnv.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see hierarchicalFsmEnv.HierarchicalFsmEnvPackage#getRegion_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // Region
