package fullfsmeval.revisitor.operations.impl;

import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.ActionOperation;
import evalbasicfsm.revisitor.operations.GuardOperation;
import evalbasicfsm.revisitor.operations.MachineOperation;
import evalbasicfsm.revisitor.operations.StateOperation;
import evalbasicfsm.revisitor.operations.TransOperation;
import evalbasicfsm.revisitor.operations.VarDeclOperation;
import evalboolexp.revisitor.operations.AndOperation;
import evalboolexp.revisitor.operations.ExpOperation;
import evalboolexp.revisitor.operations.FalsOperation;
import evalboolexp.revisitor.operations.NotOperation;
import evalboolexp.revisitor.operations.OrOperation;
import evalboolexp.revisitor.operations.TruOperation;
import evalboolexp.revisitor.operations.VarRefOperation;
import evalsimpleal.revisitor.operations.ALVarRefOperation;
import evalsimpleal.revisitor.operations.ArithLitOperation;
import evalsimpleal.revisitor.operations.ArithMinusOperation;
import evalsimpleal.revisitor.operations.ArithOperation;
import evalsimpleal.revisitor.operations.ArithPlusOperation;
import evalsimpleal.revisitor.operations.AssignOperation;
import evalsimpleal.revisitor.operations.BlockOperation;
import evalsimpleal.revisitor.operations.PrintOperation;
import evalsimpleal.revisitor.operations.StmtOperation;
import fullfsmeval.ActionBind;
import fullfsmeval.revisitor.FullfsmevalRevisitor;
import fullfsmeval.revisitor.operations.ActionBindOperation;
import fullfsmeval.revisitor.operations.GuardBindOperation;

@SuppressWarnings("all")
public class ActionBindOperationImpl implements ActionBindOperation {
  private ActionBind obj;
  
  private FullfsmevalRevisitor<ALVarRefOperation, ActionOperation, ActionBindOperation, AndOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOperation, ArithPlusOperation, AssignOperation, ExpOperation, BlockOperation, ExpOperation, FalsOperation, GuardOperation, GuardBindOperation, StateOperation, ExpOperation, MachineOperation, NotOperation, OrOperation, PrintOperation, StateOperation, StmtOperation, TransOperation, TruOperation, VarDeclOperation, VarRefOperation> alg;
  
  public ActionBindOperationImpl(final ActionBind obj, final FullfsmevalRevisitor<ALVarRefOperation, ActionOperation, ActionBindOperation, AndOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOperation, ArithPlusOperation, AssignOperation, ExpOperation, BlockOperation, ExpOperation, FalsOperation, GuardOperation, GuardBindOperation, StateOperation, ExpOperation, MachineOperation, NotOperation, OrOperation, PrintOperation, StateOperation, StmtOperation, TransOperation, TruOperation, VarDeclOperation, VarRefOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void run(final Context ctx) {
    converters.ConvertFromActionToBlockEnv convert =  new converters.ConvertFromActionToBlockEnv();
    convert.setInputctx(ctx);
    
    alg.$(obj.getDelegate()).eval(convert.conversionctx());
    
    convert.doInverse(convert.conversionctx());
    
  }
}
