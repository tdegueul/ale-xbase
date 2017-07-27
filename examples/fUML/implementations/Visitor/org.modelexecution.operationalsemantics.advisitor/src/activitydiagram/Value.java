/**
 */
package activitydiagram;

import org.eclipse.emf.ecore.EObject;

import activitydiagram.visitor.ActivityDiagramVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see activitydiagram.ActivitydiagramPackage#getValue()
 * @model abstract="true"
 * @generated
 */
public interface Value extends EObject {
	/**
	 * @generated NOT
	 * @param visitor
	 * @return
	 */
	<T> T accept(ActivityDiagramVisitor<T> visitor, Object ctx);
} // Value
