package ale.compiler.generator.util;

import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

public class DollarGeneratorUtil {
	private boolean debug;

	public void sortForDollars(List<EClass> eclasses) {
		eclasses.sort(new Comparator<EClass>() {

			@Override
			public int compare(EClass o1, EClass o2) {
				final int ret;
				if (o1.isSuperTypeOf(o2)) {
					ret = 1;
				} else if (o2.isSuperTypeOf(o1)) {
					ret = -1;
				} else {
					ret = 0;
				}
				if (debug) {
					System.out.println(o1.getName() + " " + o2.getName() + " -> " + ret);
				}
				return ret;
			}
		});
	}

	public void debug() {
		this.debug = true;

	}
}
