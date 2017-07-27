/**
 */
package activitydiagram.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.ControlNode;
import activitydiagram.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ControlNodeImpl extends ActivityNodeImpl implements ControlNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.CONTROL_NODE;
	}

	@Override
	public boolean isReady() {
		return super.isReady() && hasOffers();
	}

	@Override
	public void fire(List<Token> tokens) {
		addTokens(tokens);
		sendOffers(tokens);
	}
} //ControlNodeImpl
