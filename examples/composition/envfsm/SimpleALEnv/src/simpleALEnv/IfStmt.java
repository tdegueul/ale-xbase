/**
 */
package simpleALEnv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleALEnv.IfStmt#getIfBranch <em>If Branch</em>}</li>
 *   <li>{@link simpleALEnv.IfStmt#getElseBranch <em>Else Branch</em>}</li>
 *   <li>{@link simpleALEnv.IfStmt#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see simpleALEnv.SimpleALEnvPackage#getIfStmt()
 * @model
 * @generated
 */
public interface IfStmt extends Stmt {
	/**
	 * Returns the value of the '<em><b>If Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Branch</em>' containment reference.
	 * @see #setIfBranch(Assign)
	 * @see simpleALEnv.SimpleALEnvPackage#getIfStmt_IfBranch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Assign getIfBranch();

	/**
	 * Sets the value of the '{@link simpleALEnv.IfStmt#getIfBranch <em>If Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Branch</em>' containment reference.
	 * @see #getIfBranch()
	 * @generated
	 */
	void setIfBranch(Assign value);

	/**
	 * Returns the value of the '<em><b>Else Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Branch</em>' containment reference.
	 * @see #setElseBranch(Assign)
	 * @see simpleALEnv.SimpleALEnvPackage#getIfStmt_ElseBranch()
	 * @model containment="true"
	 * @generated
	 */
	Assign getElseBranch();

	/**
	 * Sets the value of the '{@link simpleALEnv.IfStmt#getElseBranch <em>Else Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Branch</em>' containment reference.
	 * @see #getElseBranch()
	 * @generated
	 */
	void setElseBranch(Assign value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference.
	 * @see #setTest(EqualityTest)
	 * @see simpleALEnv.SimpleALEnvPackage#getIfStmt_Test()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EqualityTest getTest();

	/**
	 * Sets the value of the '{@link simpleALEnv.IfStmt#getTest <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' containment reference.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(EqualityTest value);

} // IfStmt
