/**
 */
package simpleALEnv;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleALEnv.Block#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @see simpleALEnv.SimpleALEnvPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
	 * The list contents are of type {@link simpleALEnv.Stmt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stmts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stmts</em>' containment reference list.
	 * @see simpleALEnv.SimpleALEnvPackage#getBlock_Stmts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stmt> getStmts();

} // Block
