/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.ForkNode;
import activitydiagram.visitor.ActivityDiagramVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ForkNodeImpl extends ControlNodeImpl implements ForkNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.FORK_NODE;
	}
	
	/**
	 * @generated NOT
	 */
	public <T> T accept(ActivityDiagramVisitor<T> visitor, Object ctx) {
		return visitor.visitForkNode(this,ctx);
	}

} //ForkNodeImpl
