package prodSysTokenHolder.scenario;

import prodSys.Conveyor;
import prodSys.Machine;
import prodSys.Part;
import prodSys.ProdSysFactory;
import prodSys.Root;
import prodSysTokenHolder.ProdSysTokenHolderFactory;
import prodSysTokenHolder.RBindRoot;
import prodSysTokenHolder.revisitor.impl.ProdSysTokenHolderRevisitor;

public class Scenar1 {
	public static void main(final String[] args) {
		final ProdSysTokenHolderRevisitor rev = new ProdSysTokenHolderRevisitor() {
		};
		final ProdSysFactory psf = ProdSysFactory.eINSTANCE;

		final Conveyor waitProduce = psf.createConveyor();

		final Machine readyP = psf.createMachine();

		final Part token0 = psf.createPart();
		token0.setCreationTime(0);
		waitProduce.getParts().add(token0);

		readyP.getInC().add(waitProduce);
		final Conveyor readyProduce = psf.createConveyor();
		readyP.getOutC().add(readyProduce);

		final Conveyor buffer = psf.createConveyor();

		final Machine in = psf.createMachine();

		in.getInC().add(readyProduce);
		in.getOutC().add(buffer);
		in.getOutC().add(waitProduce);

		final Conveyor consume = psf.createConveyor();

		final Machine out = psf.createMachine();

		final Conveyor waitConsume = psf.createConveyor();

		out.getInC().add(buffer);
		out.getInC().add(waitConsume);
		out.getOutC().add(consume);

		final Machine waitC = psf.createMachine();

		waitC.getInC().add(consume);
		waitC.getOutC().add(waitConsume);

		final Part token1 = psf.createPart();
		token0.setCreationTime(1);
		waitConsume.getParts().add(token1);

		final Root machineRoot = psf.createRoot();
		machineRoot.getConveyor().add(waitProduce);
		machineRoot.getConveyor().add(readyProduce);
		machineRoot.getConveyor().add(buffer);
		machineRoot.getConveyor().add(consume);
		machineRoot.getConveyor().add(waitConsume);

		machineRoot.getMachine().add(readyP);
		machineRoot.getMachine().add(in);
		machineRoot.getMachine().add(out);
		machineRoot.getMachine().add(waitC);

		final RBindRoot it = ProdSysTokenHolderFactory.eINSTANCE.createRBindRoot();
		it.setDelegate(machineRoot);
		// final PBindMachine createPBindMachine =
		// ProdSysTokenHolderFactory.eINSTANCE.createPBindMachine();
		// createPBindMachine.setDelegate(createMachine);
		// it.getP().add(createPBindMachine);

		rev.$(it).main();
	}
}
