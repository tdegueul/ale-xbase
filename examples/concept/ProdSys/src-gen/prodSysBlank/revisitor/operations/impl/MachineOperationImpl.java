package prodSysBlank.revisitor.operations.impl;

import java.util.List;
import prodSys.Conveyor;
import prodSys.Machine;
import prodSys.Part;
import prodSys.ProdSysFactory;
import prodSys.revisitor.ProdSysRevisitor;
import prodSysBlank.revisitor.operations.ConveyorOperation;
import prodSysBlank.revisitor.operations.MachineOperation;
import prodSysBlank.revisitor.operations.RootOperation;

@SuppressWarnings("all")
public class MachineOperationImpl implements MachineOperation {
  private Machine obj;
  
  private ProdSysRevisitor<ConveyorOperation, MachineOperation, Object, RootOperation> alg;
  
  public MachineOperationImpl(final Machine obj, final ProdSysRevisitor<ConveyorOperation, MachineOperation, Object, RootOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String getRef() {
    return this.obj.getRef();
  }
  
  @Override
  public void setRef(final String value) {
    this.obj.setRef(value);
  }
  
  @Override
  public String getType() {
    return this.obj.getType();
  }
  
  @Override
  public void setType(final String value) {
    this.obj.setType(value);
  }
  
  @Override
  public List<Conveyor> getInC() {
    return this.obj.getInC();
  }
  
  @Override
  public List<Conveyor> getOutC() {
    return this.obj.getOutC();
  }
  
  @Override
  public Part createToken() {
    return ProdSysFactory.eINSTANCE.createPart();
  }
}
