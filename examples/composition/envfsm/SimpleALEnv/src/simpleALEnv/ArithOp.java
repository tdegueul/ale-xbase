/**
 */
package simpleALEnv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arith Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleALEnv.ArithOp#getLhs <em>Lhs</em>}</li>
 *   <li>{@link simpleALEnv.ArithOp#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see simpleALEnv.SimpleALEnvPackage#getArithOp()
 * @model abstract="true"
 * @generated
 */
public interface ArithOp extends Arith {
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
	 * @see simpleALEnv.SimpleALEnvPackage#getArithOp_Lhs()
	 * @model containment="true"
	 * @generated
	 */
	Arith getLhs();

	/**
	 * Sets the value of the '{@link simpleALEnv.ArithOp#getLhs <em>Lhs</em>}' containment reference.
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
	 * @see simpleALEnv.SimpleALEnvPackage#getArithOp_Rhs()
	 * @model containment="true"
	 * @generated
	 */
	Arith getRhs();

	/**
	 * Sets the value of the '{@link simpleALEnv.ArithOp#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Arith value);

} // ArithOp
