package simpleALEnv.runtime;

import java.util.HashMap;
import java.util.Map;

public class Env {
	Map<String, Integer> env = new HashMap<>();

	public void bind(String s, Integer v) {
		env.put(s, v);
	}

	public Integer get(String s) {
		return env.get(s);
	}

	public Map<String, Integer> getEnv() {
		return env;
	}
}
