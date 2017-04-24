/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.ale;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ale.xtext.ale.LetStatement#getBindings <em>Bindings</em>}</li>
 *   <li>{@link ale.xtext.ale.LetStatement#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see ale.xtext.ale.AlePackage#getLetStatement()
 * @model
 * @generated
 */
public interface LetStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
   * The list contents are of type {@link ale.xtext.ale.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' containment reference list.
   * @see ale.xtext.ale.AlePackage#getLetStatement_Bindings()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getBindings();

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Statement)
   * @see ale.xtext.ale.AlePackage#getLetStatement_Block()
   * @model containment="true"
   * @generated
   */
  Statement getBlock();

  /**
   * Sets the value of the '{@link ale.xtext.ale.LetStatement#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Statement value);

} // LetStatement
