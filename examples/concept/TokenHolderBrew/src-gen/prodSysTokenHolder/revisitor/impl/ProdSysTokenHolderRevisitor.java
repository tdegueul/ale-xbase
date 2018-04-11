package prodSysTokenHolder.revisitor.impl;

import prodSys.Conveyor;
import prodSys.Machine;
import prodSys.Part;
import prodSys.Root;
import prodSysBlank.revisitor.operations.ConveyorOperation;
import prodSysBlank.revisitor.operations.MachineOperation;
import prodSysBlank.revisitor.operations.RootOperation;
import prodSysTokenHolder.HBindConveyor;
import prodSysTokenHolder.PBindMachine;
import prodSysTokenHolder.RBindRoot;
import prodSysTokenHolder.TBindPart;
import prodSysTokenHolder.revisitor.operations.HBindConveyorOperation;
import prodSysTokenHolder.revisitor.operations.PBindMachineOperation;
import prodSysTokenHolder.revisitor.operations.RBindRootOperation;
import tokenholderexec.revisitor.operations.HOperation;
import tokenholderexec.revisitor.operations.POperation;
import tokenholderexec.revisitor.operations.ROperation;

@SuppressWarnings("all")
public interface ProdSysTokenHolderRevisitor extends prodSysTokenHolder.revisitor.ProdSysTokenHolderRevisitor<ConveyorOperation, HOperation, HBindConveyorOperation, MachineOperation, POperation, PBindMachineOperation, Object, ROperation, RBindRootOperation, RootOperation, Object, Object> {
  @Override
  public default ConveyorOperation conveyor(final Conveyor it) {
    return new prodSysBlank.revisitor.operations.impl.ConveyorOperationImpl(it, this);
  }
  
  @Override
  public default HBindConveyorOperation hBindConveyor(final HBindConveyor it) {
    return new prodSysTokenHolder.revisitor.operations.impl.HBindConveyorOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation machine(final Machine it) {
    return new prodSysBlank.revisitor.operations.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default PBindMachineOperation pBindMachine(final PBindMachine it) {
    return new prodSysTokenHolder.revisitor.operations.impl.PBindMachineOperationImpl(it, this);
  }
  
  @Override
  public default Object part(final Part it) {
    return null;
  }
  
  @Override
  public default RBindRootOperation rBindRoot(final RBindRoot it) {
    return new prodSysTokenHolder.revisitor.operations.impl.RBindRootOperationImpl(it, this);
  }
  
  @Override
  public default RootOperation root(final Root it) {
    return new prodSysBlank.revisitor.operations.impl.RootOperationImpl(it, this);
  }
  
  @Override
  public default Object tBindPart(final TBindPart it) {
    return null;
  }
}
