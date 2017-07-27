/**
 */
package activitydiagram.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import activitydiagram.ActivityEdge;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.BooleanValue;
import activitydiagram.ControlFlow;
import activitydiagram.DecisionNode;
import activitydiagram.Token;
import activitydiagram.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DecisionNodeImpl extends ControlNodeImpl implements DecisionNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.DECISION_NODE;
	}
	
	@Override
	public void fire(List<Token> tokens) {
		ActivityEdge selectedEdge = null;
		for(ActivityEdge edge : outgoing) {
			if (edge instanceof ControlFlow) {
				ControlFlow controlFlow = (ControlFlow) edge;
				Value guardValue = controlFlow.getGuard().getCurrentValue();
				if(guardValue instanceof BooleanValue) {
					BooleanValue booleanValue = (BooleanValue) guardValue;
					if(booleanValue.isValue()) {
						selectedEdge = edge;
						break;
					}
				}
			}
		}
		
		if(selectedEdge != null) {
			addTokens(tokens);
			selectedEdge.sendOffer(tokens);
		}
	}
	
	@Override
	public boolean isReady() {
		boolean ready = true;
		for (ActivityEdge edge : incoming) {
			if (!edge.hasOffer())
				ready = false;
		}
		return ready;
	}

} //DecisionNodeImpl
