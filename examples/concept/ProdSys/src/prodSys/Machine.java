/**
 */
package prodSys;

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
 *   <li>{@link prodSys.Machine#getRef <em>Ref</em>}</li>
 *   <li>{@link prodSys.Machine#getType <em>Type</em>}</li>
 *   <li>{@link prodSys.Machine#getInC <em>In C</em>}</li>
 *   <li>{@link prodSys.Machine#getOutC <em>Out C</em>}</li>
 * </ul>
 *
 * @see prodSys.ProdSysPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see prodSys.ProdSysPackage#getMachine_Ref()
	 * @model
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link prodSys.Machine#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see prodSys.ProdSysPackage#getMachine_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link prodSys.Machine#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>In C</b></em>' reference list.
	 * The list contents are of type {@link prodSys.Conveyor}.
	 * It is bidirectional and its opposite is '{@link prodSys.Conveyor#getOutM <em>Out M</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In C</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In C</em>' reference list.
	 * @see prodSys.ProdSysPackage#getMachine_InC()
	 * @see prodSys.Conveyor#getOutM
	 * @model opposite="outM"
	 * @generated
	 */
	EList<Conveyor> getInC();

	/**
	 * Returns the value of the '<em><b>Out C</b></em>' reference list.
	 * The list contents are of type {@link prodSys.Conveyor}.
	 * It is bidirectional and its opposite is '{@link prodSys.Conveyor#getInM <em>In M</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out C</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out C</em>' reference list.
	 * @see prodSys.ProdSysPackage#getMachine_OutC()
	 * @see prodSys.Conveyor#getInM
	 * @model opposite="inM"
	 * @generated
	 */
	EList<Conveyor> getOutC();

} // Machine
