package prodSys.revisitor;

public interface ProdSysRevisitor<ProdSys__ConveyorT, ProdSys__MachineT, ProdSys__PartT, ProdSys__RootT> {
	ProdSys__ConveyorT conveyor(final prodSys.Conveyor it);
	ProdSys__MachineT machine(final prodSys.Machine it);
	ProdSys__PartT part(final prodSys.Part it);
	ProdSys__RootT root(final prodSys.Root it);

	default ProdSys__ConveyorT $(final prodSys.Conveyor it) {
		return conveyor(it);
	}
	default ProdSys__MachineT $(final prodSys.Machine it) {
		return machine(it);
	}
	default ProdSys__PartT $(final prodSys.Part it) {
		return part(it);
	}
	default ProdSys__RootT $(final prodSys.Root it) {
		return root(it);
	}
}
