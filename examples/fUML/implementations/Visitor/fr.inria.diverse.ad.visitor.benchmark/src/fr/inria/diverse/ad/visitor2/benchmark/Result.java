package fr.inria.diverse.ad.visitor2.benchmark;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Result {
	private final List<Long> results = new ArrayList<>();

	public List<Long> getResults() {
		return results;
	}

	public void save(final String model, String prefix) throws IOException {
		final File file = new File(prefix + model + ".csv");

		if (file.exists())
			file.delete();

		final StringBuffer sb = new StringBuffer();
		sb.append("res");
		sb.append(System.lineSeparator());
		final String values = results.stream().map(String::valueOf).collect(Collectors.joining(System.lineSeparator()));
		sb.append(values);

		com.google.common.io.Files.append(sb, file, Charset.defaultCharset());
	}

}
