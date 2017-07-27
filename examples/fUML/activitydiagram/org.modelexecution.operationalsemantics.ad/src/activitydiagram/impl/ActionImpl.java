/**
 */
package activitydiagram.impl;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.Action;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.Token;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ActionImpl extends ExecutableNodeImpl implements Action {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.ACTION;
	}

	@Override
	public void fire(List<Token> tokens) {
		doAction();
		sendOffers();
	}
		
	@Override
	public void sendOffers() {
		if(getOutgoing().size() > 0) {
			List<Token> tokens = new ArrayList<Token>();
			tokens.add(new ControlTokenImpl());
			addTokens(tokens);
			getOutgoing().get(0).sendOffer(tokens);
		}
	}
	
	@Override
	public boolean isReady() {
		return super.isReady() && hasOffers();
	}
	
} //ActionImpl
