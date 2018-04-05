package converters;

import basicFsmEnv.runtime.Context;
import simpleALEnv.runtime.Env;

public class ConvertFromActionToBlockMethodrun {

	private Context ctx;

	public void setInputctx(Context ctx) {
		this.ctx = ctx;

	}

	public Env conversionctx() {
		Env env = new Env();
		ctx.getEnv().forEach((k, v) -> {
			if (v instanceof Integer)
				env.bind(k, (Integer) v);
		});
		return env;
	}

	public void doInverse(Env env) {
		env.getEnv().forEach((k, v) -> {
			ctx.bind(k, v);
		});

	}

}
