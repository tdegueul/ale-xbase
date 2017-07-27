/**
 */
package activitydiagram;

import activitydiagram.visitor.ActivityDiagramVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Token</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagram.ActivitydiagramPackage#getControlToken()
 * @model
 * @generated
 */
public interface ControlToken extends Token {
	/**
	 * @generated NOT
	 * @param visitor
	 * @return
	 */
	<T> T accept(ActivityDiagramVisitor<T> visitor, Object ctx);
} // ControlToken
