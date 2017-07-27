package org.modelexecution.operationalsemantics.modularrevisitor.benchmark;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import activitydiagram.ActivitydiagramFactory;
import adruntime.Activity_Aspect;
import adruntime.AdruntimePackage;
import modularactivitydiagram.revisitor.ModularactivitydiagramRevisitor;

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
		final AdruntimePackage a = AdruntimePackage.eINSTANCE;
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		return new ResourceSetImpl();
	}

	private Long executeBenchmark(final String modelPath, final int itt, final String xmiPath) {
		final Activity_Aspect activity = getActivity(modelPath, xmiPath);
		return doTheJob(activity);

	}

	private Activity_Aspect getActivity(final String modelPath, final String xmiPath) {
		final ResourceSetImpl resourceSet = this.init();
		final URI uri = URI.createURI(MessageFormat.format(MODELS_PATH, xmiPath, modelPath));
		final Resource resource = resourceSet.getResource(uri, true);
		final EObject eObject = resource.getContents().get(0);
		if (eObject instanceof Activity_Aspect) {
			return (Activity_Aspect) eObject;
		}
		return null;
	}

	private long doTheJob(final Activity_Aspect activity) {
		final ModularactivitydiagramRevisitor modularRevisitorImpl = new ModularactivitydiagramRevisitor(){};
		final long start = System.currentTimeMillis();
		modularRevisitorImpl.$(activity).main(null);
		final long stop = System.currentTimeMillis();
		final long l = stop - start;
		return l;
	}

}
