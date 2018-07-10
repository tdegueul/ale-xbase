/**
 */
package simpleALEnv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleALEnv.EqualityTest#getLhs <em>Lhs</em>}</li>
 *   <li>{@link simpleALEnv.EqualityTest#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see simpleALEnv.SimpleALEnvPackage#getEqualityTest()
 * @model
 * @generated
 */
public interface EqualityTest extends EObject {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Arith)
	 * @see simpleALEnv.SimpleALEnvPackage#getEqualityTest_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Arith getLhs();

	/**
	 * Sets the value of the '{@link simpleALEnv.EqualityTest#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Arith value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Arith)
	 * @see simpleALEnv.SimpleALEnvPackage#getEqualityTest_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Arith getRhs();

	/**
	 * Sets the value of the '{@link simpleALEnv.EqualityTest#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Arith value);

} // EqualityTest
