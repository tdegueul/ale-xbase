/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.ale;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Semantics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ale.xtext.ale.ImportSemantics#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see ale.xtext.ale.AlePackage#getImportSemantics()
 * @model
 * @generated
 */
public interface ImportSemantics extends Import
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Root)
   * @see ale.xtext.ale.AlePackage#getImportSemantics_Ref()
   * @model
   * @generated
   */
  Root getRef();

  /**
   * Sets the value of the '{@link ale.xtext.ale.ImportSemantics#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Root value);

} // ImportSemantics
