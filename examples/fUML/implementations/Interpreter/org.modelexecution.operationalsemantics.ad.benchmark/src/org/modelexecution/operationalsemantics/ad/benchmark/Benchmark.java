package org.modelexecution.operationalsemantics.ad.benchmark;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import activitydiagram.Activity;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.ActivitydiagramPackage;

public class Benchmark {

	private static final String MODELS_PATH = "{0}/{1}.xmi";

	public void start(final String model, final int warmup, final int iterations, String xmiPath, String prefix) throws IOException {
		final Result res = new Result();
		for (int i = 0; i < warmup; i++) {
			System.out.print(MessageFormat.format("Warmup    [{0}/{1}]\r", i + 1, warmup));
			this.executeBenchmark(model, i, xmiPath);
		}
		System.out.println();
		for (int i = 0; i < iterations; i++) {
			System.out.print(MessageFormat.format("Benchmark [{0}/{1}]\r", i + 1, iterations));
			res.getResults().add(this.executeBenchmark(model, i, xmiPath));
		}
		System.out.println();
		System.out.println(MessageFormat.format("Min: {0} Max: {1} Avg: {2}",
				Collections.min(res.getResults()),
				Collections.max(res.getResults()),
				res.getResults().stream().mapToDouble(i -> i).average().getAsDouble()));
		res.save(model, prefix);
	}

	private ResourceSetImpl init() {
		ActivitydiagramFactory.eINSTANCE.eClass();
		ActivitydiagramPackage a = ActivitydiagramPackage.eINSTANCE;
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		return new ResourceSetImpl();
	}

	private Long executeBenchmark(String modelPath, int itt, String xmiPath) {
		final Activity activity = getActivity(modelPath, xmiPath);
		return doTheJob(activity);

	}

	private Activity getActivity(String modelPath, String xmiPath) {
		ResourceSetImpl resourceSet = this.init();
		final URI uri = URI.createURI(MessageFormat.format(MODELS_PATH, xmiPath, modelPath));
		final Resource resource = resourceSet.getResource(uri, true);
		final EObject eObject = resource.getContents().get(0);
		if (eObject instanceof Activity) {
			return (Activity) eObject;
		}
		return null;
	}

	private long doTheJob(final Activity activity) {
		final long start = System.currentTimeMillis();
		activity.main(null);
		final long stop = System.currentTimeMillis();
		long res = stop - start;
		return res;
	}

}
