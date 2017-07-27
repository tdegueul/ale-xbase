/**
 */
package activitydiagram.impl;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.InitialNode;
import activitydiagram.Token;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InitialNodeImpl extends ControlNodeImpl implements InitialNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.INITIAL_NODE;
	}

	@Override
	public void fire(List<Token> tokens) {
		List<Token> producedTokens = new ArrayList<Token>();
		producedTokens.add(new ControlTokenImpl());
		addTokens(producedTokens);
		sendOffers(producedTokens);		
	}
	
	@Override
	public boolean isReady() {
		return false; // is fired by activity directly
	}

} //InitialNodeImpl
