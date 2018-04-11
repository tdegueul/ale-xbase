package prodSysTokenHolder.revisitor.operations.impl;

import java.util.List;
import prodSysBlank.revisitor.operations.ConveyorOperation;
import prodSysBlank.revisitor.operations.MachineOperation;
import prodSysBlank.revisitor.operations.RootOperation;
import prodSysTokenHolder.HBindConveyor;
import prodSysTokenHolder.revisitor.ProdSysTokenHolderRevisitor;
import prodSysTokenHolder.revisitor.operations.HBindConveyorOperation;
import prodSysTokenHolder.revisitor.operations.PBindMachineOperation;
import prodSysTokenHolder.revisitor.operations.RBindRootOperation;
import tokenHolder.T;
import tokenholderexec.revisitor.operations.HOperation;
import tokenholderexec.revisitor.operations.POperation;
import tokenholderexec.revisitor.operations.ROperation;
import tokenholderexec.revisitor.operations.impl.HOperationImpl;

@SuppressWarnings("all")
public class HBindConveyorOperationImpl extends HOperationImpl implements HBindConveyorOperation {
  private HBindConveyor obj;
  
  private ProdSysTokenHolderRevisitor<ConveyorOperation, HOperation, HBindConveyorOperation, MachineOperation, POperation, PBindMachineOperation, Object, ROperation, RBindRootOperation, RootOperation, Object, Object> alg;
  
  public HBindConveyorOperationImpl(final HBindConveyor obj, final ProdSysTokenHolderRevisitor<ConveyorOperation, HOperation, HBindConveyorOperation, MachineOperation, POperation, PBindMachineOperation, Object, ROperation, RBindRootOperation, RootOperation, Object, Object> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public List<T> getTokens() {
    converters.HBindConveyorGetTokensToParts convert =  new converters.HBindConveyorGetTokensToParts();
    
    convert.doInit();
    
    java.util.List<tokenHolder.T> res = convert.convertReturn(alg.$(obj.getDelegate()).parts());
    
    
    return res;
  }
}
