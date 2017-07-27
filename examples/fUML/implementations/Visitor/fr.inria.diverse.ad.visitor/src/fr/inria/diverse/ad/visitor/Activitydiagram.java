package fr.inria.diverse.ad.visitor;

import java.util.List;

import activitydiagram.Activity;
import activitydiagram.InputValue;
import fr.inria.diverse.ad.visitor.visitor.ActivityMainVisitor;

public class Activitydiagram {

	public long execute(final Activity activity, final List<InputValue> inputValues) {

		final long start = System.currentTimeMillis();
		activity.accept(ActivityMainVisitor.INSTANCE, inputValues);
		final long stop = System.currentTimeMillis();
		return stop - start;
	}
}
