/**
 */
package activitydiagram.impl;

import org.eclipse.emf.ecore.EClass;

import activitydiagram.ActivityEdge;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.JoinNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class JoinNodeImpl extends ControlNodeImpl implements JoinNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.JOIN_NODE;
	}
	
	@Override
	public boolean isReady() {
		boolean ready = true;
		for (ActivityEdge edge : getIncoming()) {
			if (!edge.hasOffer())
				ready = false;
		}
		return ready;
	}
} //JoinNodeImpl
