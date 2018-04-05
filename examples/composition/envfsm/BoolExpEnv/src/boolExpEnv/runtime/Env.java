package boolExpEnv.runtime;

import java.util.HashMap;
import java.util.Map;

public class Env {
	private Map<String, Boolean> env = new HashMap<>();

	public void bind(String s, Boolean b) {
		env.put(s, b);
	}

	public boolean get(String s) {
		return env.get(s);
	}
}
