/**
 */
package activitydiagram.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.ForkNode;
import activitydiagram.ForkedToken;
import activitydiagram.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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

	@Override
	public void fire(List<Token> tokens) {
		List<Token> forkedTokens = new ArrayList<Token>();
		for(Token token : tokens) {
			ForkedToken forkedToken = new ForkedTokenImpl();
			forkedToken.setBaseToken(token);
			forkedToken.setRemainingOffersCount(outgoing.size());
			forkedTokens.add(forkedToken);
		}
		addTokens(forkedTokens);
		sendOffers(forkedTokens);
	}

} //ForkNodeImpl
