/**
 */
package activitydiagram;

import activitydiagram.visitor.ActivityDiagramVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagram.ActivitydiagramPackage#getBooleanVariable()
 * @model
 * @generated
 */
public interface BooleanVariable extends Variable {
	/**
	 * @generated NOT
	 * @param visitor
	 * @return
	 */
	<T> T accept(ActivityDiagramVisitor<T> visitor, Object ctx);
} // BooleanVariable
