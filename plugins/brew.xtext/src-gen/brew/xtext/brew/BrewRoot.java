/**
 * generated by Xtext 2.12.0
 */
package brew.xtext.brew;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link brew.xtext.brew.BrewRoot#getImportSemantics <em>Import Semantics</em>}</li>
 * </ul>
 *
 * @see brew.xtext.brew.BrewPackage#getBrewRoot()
 * @model
 * @generated
 */
public interface BrewRoot extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Semantics</b></em>' containment reference list.
   * The list contents are of type {@link brew.xtext.brew.AleImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Semantics</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Semantics</em>' containment reference list.
   * @see brew.xtext.brew.BrewPackage#getBrewRoot_ImportSemantics()
   * @model containment="true"
   * @generated
   */
  EList<AleImport> getImportSemantics();

} // BrewRoot