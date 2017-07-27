/**
 */
package activitydiagram.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import activitydiagram.ActivityFinalNode;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Final Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
	
	@Override
	public void fire(List<Token> tokens) {
		getActivity().terminate();
	}

} //ActivityFinalNodeImpl
