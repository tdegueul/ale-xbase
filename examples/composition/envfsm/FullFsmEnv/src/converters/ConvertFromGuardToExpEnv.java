package converters;

import basicFsmEnv.runtime.Context;
import boolExpEnv.runtime.Env;

public class ConvertFromGuardToExpEnv {

	private Context ctx;

	public void setInputctx(Context ctx) {
		this.ctx = ctx;

	}

	public Env conversionctx() {
		Env env = new Env();
		ctx.getEnv().forEach((k, v) -> {
			if (v instanceof Boolean)
				env.bind(k, (Boolean) v);
		});

		return env;
	}

	public void doInverse(Env env) {
		
	}
	
	public void doInit() {
		
	}

	public boolean convertReturn(boolean eval) {
		return eval;
	}

}
