package org.modelexecution.operationalsemantics.modularrevisitor.benchmark;

import java.io.IOException;

public class BenchmarkGeneric {
	public static void main(String[] args) throws IOException {
		final String xmiPath = args[0];
		final String casePath = args[1];
		final String prefix = args[2];
		
		new Benchmark().start(casePath, 50, 500, xmiPath, prefix);
	}
}
