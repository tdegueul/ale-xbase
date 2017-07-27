/**
 */
package activitydiagram;

import activitydiagram.visitor.ActivityDiagramVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagram.ActivitydiagramPackage#getMergeNode()
 * @model
 * @generated
 */
public interface MergeNode extends ControlNode {
	/**
	 * @generated NOT
	 * @param visitor
	 * @return
	 */
	<T> T accept(ActivityDiagramVisitor<T> visitor, Object ctx);
} // MergeNode
