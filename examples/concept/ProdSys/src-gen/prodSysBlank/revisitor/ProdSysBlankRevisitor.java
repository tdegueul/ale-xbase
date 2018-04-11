package prodSysBlank.revisitor;

import prodSys.Conveyor;
import prodSys.Machine;
import prodSys.Part;
import prodSys.Root;
import prodSys.revisitor.ProdSysRevisitor;
import prodSysBlank.revisitor.operations.ConveyorOperation;
import prodSysBlank.revisitor.operations.MachineOperation;
import prodSysBlank.revisitor.operations.RootOperation;

@SuppressWarnings("all")
public interface ProdSysBlankRevisitor extends ProdSysRevisitor<ConveyorOperation, MachineOperation, Object, RootOperation> {
  @Override
  public default ConveyorOperation conveyor(final Conveyor it) {
    return new prodSysBlank.revisitor.operations.impl.ConveyorOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation machine(final Machine it) {
    return new prodSysBlank.revisitor.operations.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default Object part(final Part it) {
    return null;
  }
  
  @Override
  public default RootOperation root(final Root it) {
    return new prodSysBlank.revisitor.operations.impl.RootOperationImpl(it, this);
  }
}
