package gfsm.dyn;

import java.util.ArrayList;
import java.util.List;

import gfsm.State;

public class Context {
	private State current;
	private List<State> trace = new ArrayList<>();

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
