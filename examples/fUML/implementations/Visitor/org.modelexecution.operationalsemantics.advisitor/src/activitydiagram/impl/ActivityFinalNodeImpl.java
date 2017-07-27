/**
 */
package activitydiagram.impl;

import activitydiagram.ActivityFinalNode;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.visitor.ActivityDiagramVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Final Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ActivityFinalNodeImpl extends FinalNodeImpl implements ActivityFinalNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityFinalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.ACTIVITY_FINAL_NODE;
	}
	
	/**
	 * @generated NOT
	 */
	public <T> T accept(ActivityDiagramVisitor<T> visitor, Object ctx) {
		return visitor.visitActivityFinalNode(this, ctx);
	}

} //ActivityFinalNodeImpl
