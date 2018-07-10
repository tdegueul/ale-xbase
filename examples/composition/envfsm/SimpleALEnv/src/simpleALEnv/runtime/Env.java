package simpleALEnv.runtime;

import java.util.HashMap;
import java.util.Map;

public class Env {
	Map<String, Integer> env = new HashMap<>();

	public void bind(String s, Integer v) {
		System.out.println("bind " + s + " to " + v);
		env.put(s, v);
	}

	public Integer get(String s) {
		return env.get(s);
	}

	public Map<String, Integer> getEnv() {
		return env;
	}

	@Override
	public String toString() {
		
		final StringBuilder sb = new StringBuilder();
		
		sb.append("Env  "+super.toString()+"\n");
		env.entrySet().forEach(es -> {
			sb.append(es.getKey() + " = " + es.getValue());
		});
		
		return sb.toString(); 
	}
	
	
}
