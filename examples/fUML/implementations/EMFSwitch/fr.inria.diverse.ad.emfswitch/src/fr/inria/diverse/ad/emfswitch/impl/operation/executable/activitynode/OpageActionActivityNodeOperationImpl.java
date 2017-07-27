package fr.inria.diverse.ad.emfswitch.impl.operation.executable.activitynode;

import activitydiagram.Expression;
import activitydiagram.OpaqueAction;
import fr.inria.diverse.ad.emfswitch.switches.ExpressionVisitor;

public class OpageActionActivityNodeOperationImpl extends ActionActivityNodeOperationImpl {

	private final OpaqueAction opaqueAction;

	private final ExpressionVisitor expressionVisitor = ExpressionVisitor.INSTANCE;

	public OpageActionActivityNodeOperationImpl(final OpaqueAction opaqueAction) {
		super(opaqueAction);
		this.opaqueAction = opaqueAction;
	}

	@Override
	void doAction() {
		for (final Expression e : this.opaqueAction.getExpressions()) {
			expressionVisitor.doSwitch(e).execute();
		}

	}

}
