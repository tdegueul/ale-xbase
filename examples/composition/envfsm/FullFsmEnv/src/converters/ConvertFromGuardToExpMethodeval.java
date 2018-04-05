package converters;

import basicFsmEnv.runtime.Context;
import boolExpEnv.runtime.Env;

public class ConvertFromGuardToExpMethodeval {

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

}
