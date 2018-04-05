/**
 */
package simpleALEnv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arith Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleALEnv.ArithLit#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see simpleALEnv.SimpleALEnvPackage#getArithLit()
 * @model
 * @generated
 */
public interface ArithLit extends Arith {
	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(int)
	 * @see simpleALEnv.SimpleALEnvPackage#getArithLit_Val()
	 * @model
	 * @generated
	 */
	int getVal();

	/**
	 * Sets the value of the '{@link simpleALEnv.ArithLit#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(int value);

} // ArithLit
