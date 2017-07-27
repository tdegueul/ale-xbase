package fr.inria.diverse.ad.visitor.visitor;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.Activity;
import activitydiagram.ActivityNode;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.InitialNode;
import activitydiagram.InputValue;
import activitydiagram.Token;
import activitydiagram.Trace;
import activitydiagram.Variable;
import activitydiagram.visitor.ActivityDiagramVisitorDefault;

public class ActivityMainVisitor extends ActivityDiagramVisitorDefault<Void> {

	private ActivityMainVisitor() {

	}

	public final static ActivityMainVisitor INSTANCE = new ActivityMainVisitor();

	private ActivityNodeTakeOfferdTokensVisitor activityNodeTakeOfferdTokensVisitor2;// =

	private ActivityNodeTakeOfferdTokensVisitor getTakOfferd() {
		if (this.activityNodeTakeOfferdTokensVisitor2 == null)
			activityNodeTakeOfferdTokensVisitor2 = ActivityNodeTakeOfferdTokensVisitor.INSTANCE;
		return activityNodeTakeOfferdTokensVisitor2;
	}

	private ActivityNodeFireVisitor activityNodeFireVisitor2;

	private ActivityNodeFireVisitor getFire() {
		if (this.activityNodeFireVisitor2 == null)
			activityNodeFireVisitor2 = ActivityNodeFireVisitor.INSTANCE;
		return this.activityNodeFireVisitor2;
	}

	private ActivityNodeIsReadyVisitor activityNodeIsReadyVisitor2;// =

	private ActivityNodeIsReadyVisitor getIdReady() {
		if (this.activityNodeIsReadyVisitor2 == null)
			activityNodeIsReadyVisitor2 = new ActivityNodeIsReadyVisitor();
		return this.activityNodeIsReadyVisitor2;
	}

	private ActivityNodeRunVisitor activityNodeRunVisitor2;

	private ActivityNodeRunVisitor getRun() {
		if (activityNodeRunVisitor2 == null)
			activityNodeRunVisitor2 = ActivityNodeRunVisitor.INSTANCE;
		return this.activityNodeRunVisitor2;
	}

	public Void visitActivity(Activity activity, Object ctx) {
		this.initialize((List<InputValue>) ctx, activity);
		this.initializeTrace(activity);
		this.run(activity);
		return null;
	}

	private void run(Activity activity) {
		this.runNodes(activity);

		this.fireInitialNode(activity);

		List<ActivityNode> enabledNodes = this.getEnabledNodes(activity);
		while (enabledNodes.size() > 0) {
			final ActivityNode nextNode = this.selectNextNode(enabledNodes);
			this.fireNode(nextNode, activity);
			enabledNodes = this.getEnabledNodes(activity);
		}

	}

	private void fireNode(final ActivityNode node, Activity activity) {
		// System.out.println("fire node " + node.getName());
		final List<Token> tokens = node.accept(this.getTakOfferd(), null);
		node.accept(this.getFire(), tokens);
		activity.getTrace().getExecutedNodes().add(node);

	}

	private ActivityNode selectNextNode(final List<ActivityNode> activityNodes) {
		return activityNodes.get(0);
	}

	private List<ActivityNode> getEnabledNodes(Activity activity) {
		final List<ActivityNode> enabledNodes = new ArrayList<ActivityNode>();
		for (final ActivityNode node : activity.getNodes()) {
			if (node.accept(this.getIdReady(), null)) {
				enabledNodes.add(node);
			}
		}
		return enabledNodes;
	}

	private void fireInitialNode(Activity activity) {
		final InitialNode initialNode = this.getInitialNode(activity);
		this.fireNode(initialNode, activity);

	}

	private InitialNode getInitialNode(Activity activity) {
		for (final ActivityNode node : activity.getNodes()) {
			if (node instanceof InitialNode) {
				return (InitialNode) node;
			}
		}
		return null;
	}

	private void runNodes(Activity activity) {
		for (final ActivityNode node : activity.getNodes()) {
			node.accept(this.getRun(), null);
		}
	}

	private void initializeTrace(Activity activity) {
		final Trace trace = ActivitydiagramFactory.eINSTANCE.createTrace();
		activity.setTrace(trace);

	}

	private void initialize(final List<InputValue> inputValues, Activity activity) {
		for (final Variable v : activity.getLocals()) {
			v.setCurrentValue(v.getInitialValue());
		}
		if (inputValues != null) {
			for (final InputValue v : inputValues) {
				v.getVariable().setCurrentValue(v.getValue());
			}
		}

	}

}
