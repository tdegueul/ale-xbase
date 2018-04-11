package prodSysBlank.revisitor.operations.impl;

import java.util.List;
import prodSys.Conveyor;
import prodSys.Machine;
import prodSys.Root;
import prodSys.revisitor.ProdSysRevisitor;
import prodSysBlank.revisitor.operations.ConveyorOperation;
import prodSysBlank.revisitor.operations.MachineOperation;
import prodSysBlank.revisitor.operations.RootOperation;

@SuppressWarnings("all")
public class RootOperationImpl implements RootOperation {
  private Root obj;
  
  private ProdSysRevisitor<ConveyorOperation, MachineOperation, Object, RootOperation> alg;
  
  public RootOperationImpl(final Root obj, final ProdSysRevisitor<ConveyorOperation, MachineOperation, Object, RootOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public List<Machine> getMachine() {
    return this.obj.getMachine();
  }
  
  @Override
  public List<Conveyor> getConveyor() {
    return this.obj.getConveyor();
  }
}
