package prodSysBlank.revisitor.operations.impl;

import java.util.List;
import prodSys.Conveyor;
import prodSys.Part;
import prodSys.revisitor.ProdSysRevisitor;
import prodSysBlank.revisitor.operations.ConveyorOperation;
import prodSysBlank.revisitor.operations.MachineOperation;
import prodSysBlank.revisitor.operations.RootOperation;

@SuppressWarnings("all")
public class ConveyorOperationImpl implements ConveyorOperation {
  private Conveyor obj;
  
  private ProdSysRevisitor<ConveyorOperation, MachineOperation, Object, RootOperation> alg;
  
  public ConveyorOperationImpl(final Conveyor obj, final ProdSysRevisitor<ConveyorOperation, MachineOperation, Object, RootOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public List<Part> parts() {
    return this.obj.getParts();
  }
}
