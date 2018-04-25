package prodSysTokenHolder.revisitor.operations.impl;

import java.util.List;
import prodSysBlank.revisitor.operations.ConveyorOperation;
import prodSysBlank.revisitor.operations.MachineOperation;
import prodSysBlank.revisitor.operations.RootOperation;
import prodSysTokenHolder.RBindRoot;
import prodSysTokenHolder.revisitor.ProdSysTokenHolderRevisitor;
import prodSysTokenHolder.revisitor.operations.HBindConveyorOperation;
import prodSysTokenHolder.revisitor.operations.PBindMachineOperation;
import prodSysTokenHolder.revisitor.operations.RBindRootOperation;
import tokenHolder.H;
import tokenHolder.P;
import tokenholderexec.revisitor.operations.HOperation;
import tokenholderexec.revisitor.operations.POperation;
import tokenholderexec.revisitor.operations.ROperation;
import tokenholderexec.revisitor.operations.impl.ROperationImpl;

@SuppressWarnings("all")
public class RBindRootOperationImpl extends ROperationImpl implements RBindRootOperation {
  private RBindRoot obj;
  
  private ProdSysTokenHolderRevisitor<ConveyorOperation, HOperation, HBindConveyorOperation, MachineOperation, POperation, PBindMachineOperation, Object, ROperation, RBindRootOperation, RootOperation, Object, Object> alg;
  
  public RBindRootOperationImpl(final RBindRoot obj, final ProdSysTokenHolderRevisitor<ConveyorOperation, HOperation, HBindConveyorOperation, MachineOperation, POperation, PBindMachineOperation, Object, ROperation, RBindRootOperation, RootOperation, Object, Object> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public List<H> getH() {
    prodSysTokenHolder.converters.RToRootWithgetHTogetConveyor convert =  new prodSysTokenHolder.converters.RToRootWithgetHTogetConveyor();
    
    
    
    java.util.List<tokenHolder.H> res = convert.convertReturn(alg.$(obj.getDelegate()).getConveyor());
    
    
    return res;
  }
  
  @Override
  public List<P> getP() {
    prodSysTokenHolder.converters.RToRootWithgetPTogetMachine convert =  new prodSysTokenHolder.converters.RToRootWithgetPTogetMachine();
    
    
    
    java.util.List<tokenHolder.P> res = convert.convertReturn(alg.$(obj.getDelegate()).getMachine());
    
    
    return res;
  }
}
