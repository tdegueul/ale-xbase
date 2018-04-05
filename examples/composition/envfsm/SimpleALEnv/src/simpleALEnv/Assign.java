/**
 */
package simpleALEnv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleALEnv.Assign#getName <em>Name</em>}</li>
 *   <li>{@link simpleALEnv.Assign#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see simpleALEnv.SimpleALEnvPackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends Stmt {
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
	 * @see simpleALEnv.SimpleALEnvPackage#getAssign_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleALEnv.Assign#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Val</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' containment reference.
	 * @see #setVal(Arith)
	 * @see simpleALEnv.SimpleALEnvPackage#getAssign_Val()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Arith getVal();

	/**
	 * Sets the value of the '{@link simpleALEnv.Assign#getVal <em>Val</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' containment reference.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(Arith value);

} // Assign
