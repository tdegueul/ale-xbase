package prodSysTokenHolder.revisitor;

public interface ProdSysTokenHolderRevisitor<ProdSys__ConveyorT, TokenHolder__HT, ProdSysTokenHolder__HBindConveyorT extends TokenHolder__HT, ProdSys__MachineT, TokenHolder__PT, ProdSysTokenHolder__PBindMachineT extends TokenHolder__PT, ProdSys__PartT, TokenHolder__RT, ProdSysTokenHolder__RBindRootT extends TokenHolder__RT, ProdSys__RootT, TokenHolder__TT, ProdSysTokenHolder__TBindPartT extends TokenHolder__TT>
	extends tokenHolder.revisitor.TokenHolderRevisitor<TokenHolder__HT, TokenHolder__PT, TokenHolder__RT, TokenHolder__TT>,
		prodSys.revisitor.ProdSysRevisitor<ProdSys__ConveyorT, ProdSys__MachineT, ProdSys__PartT, ProdSys__RootT> {
	ProdSysTokenHolder__HBindConveyorT hBindConveyor(final prodSysTokenHolder.HBindConveyor it);
	ProdSysTokenHolder__PBindMachineT pBindMachine(final prodSysTokenHolder.PBindMachine it);
	ProdSysTokenHolder__RBindRootT rBindRoot(final prodSysTokenHolder.RBindRoot it);
	ProdSysTokenHolder__TBindPartT tBindPart(final prodSysTokenHolder.TBindPart it);

	default ProdSys__ConveyorT $(final prodSys.Conveyor it) {
		return conveyor(it);
	}
	default TokenHolder__HT $(final tokenHolder.H it) {
		if (it.getClass() == prodSysTokenHolder.impl.HBindConveyorImpl.class)
			return hBindConveyor((prodSysTokenHolder.HBindConveyor) it);
		return null;
	}
	default ProdSysTokenHolder__HBindConveyorT $(final prodSysTokenHolder.HBindConveyor it) {
		return hBindConveyor(it);
	}
	default ProdSys__MachineT $(final prodSys.Machine it) {
		return machine(it);
	}
	default TokenHolder__PT $(final tokenHolder.P it) {
		if (it.getClass() == prodSysTokenHolder.impl.PBindMachineImpl.class)
			return pBindMachine((prodSysTokenHolder.PBindMachine) it);
		return null;
	}
	default ProdSysTokenHolder__PBindMachineT $(final prodSysTokenHolder.PBindMachine it) {
		return pBindMachine(it);
	}
	default ProdSys__PartT $(final prodSys.Part it) {
		return part(it);
	}
	default TokenHolder__RT $(final tokenHolder.R it) {
		if (it.getClass() == prodSysTokenHolder.impl.RBindRootImpl.class)
			return rBindRoot((prodSysTokenHolder.RBindRoot) it);
		return null;
	}
	default ProdSysTokenHolder__RBindRootT $(final prodSysTokenHolder.RBindRoot it) {
		return rBindRoot(it);
	}
	default ProdSys__RootT $(final prodSys.Root it) {
		return root(it);
	}
	default TokenHolder__TT $(final tokenHolder.T it) {
		if (it.getClass() == prodSysTokenHolder.impl.TBindPartImpl.class)
			return tBindPart((prodSysTokenHolder.TBindPart) it);
		return null;
	}
	default ProdSysTokenHolder__TBindPartT $(final prodSysTokenHolder.TBindPart it) {
		return tBindPart(it);
	}
}
