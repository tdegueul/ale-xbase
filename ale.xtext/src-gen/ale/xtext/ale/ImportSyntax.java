/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.ale;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ale.xtext.ale.ImportSyntax#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see ale.xtext.ale.AlePackage#getImportSyntax()
 * @model
 * @generated
 */
public interface ImportSyntax extends Import
{
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
   * @see ale.xtext.ale.AlePackage#getImportSyntax_Ref()
   * @model
   * @generated
   */
  String getRef();

  /**
   * Sets the value of the '{@link ale.xtext.ale.ImportSyntax#getRef <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' attribute.
   * @see #getRef()
   * @generated
   */
  void setRef(String value);

} // ImportSyntax
