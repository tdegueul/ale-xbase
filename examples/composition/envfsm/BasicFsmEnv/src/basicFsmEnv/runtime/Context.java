package basicFsmEnv.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import basicFsmEnv.State;

public class Context {
	private State current;
	private List<State> trace = new ArrayList<>();
	private Map<String, Object> env = new HashMap<>();

	public void bind(String s, Object o) {
		env.put(s, o);
	}

	public Object get(String s) {
		return env.get(s);
	}

	public Map<String, Object> getEnv() {
		return env;
	}

	public void setCurrent(State s) {
		current = s;
	}

	public State getCurrent() {
		return current;
	}

	public void visit(State s) {
		trace.add(s);
	}

	public List<State> getTrace() {
		return trace;
	}
}
