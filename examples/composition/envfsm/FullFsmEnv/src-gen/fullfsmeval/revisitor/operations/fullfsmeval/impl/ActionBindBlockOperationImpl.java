package fullfsmeval.revisitor.operations.fullfsmeval.impl;

import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.evalbasicfsm.ActionOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.GuardOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.InitialStateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.MachineOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.StateOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.TransOperation;
import evalbasicfsm.revisitor.operations.evalbasicfsm.VarDeclOperation;
import evalboolexp.revisitor.operations.evalboolexp.AndOperation;
import evalboolexp.revisitor.operations.evalboolexp.BinExpOperation;
import evalboolexp.revisitor.operations.evalboolexp.ExpOperation;
import evalboolexp.revisitor.operations.evalboolexp.FalsOperation;
import evalboolexp.revisitor.operations.evalboolexp.LitOperation;
import evalboolexp.revisitor.operations.evalboolexp.NotOperation;
import evalboolexp.revisitor.operations.evalboolexp.OrOperation;
import evalboolexp.revisitor.operations.evalboolexp.TruOperation;
import evalboolexp.revisitor.operations.evalboolexp.VarRefOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ALVarRefOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithLitOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithMinusOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithOpOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.ArithPlusOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.AssignOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.BlockOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.PrintOperation;
import evalsimpleal.revisitor.operations.evalsimpleal.StmtOperation;
import fullfsmeval.ActionBindBlock;
import fullfsmeval.revisitor.FullfsmevalRevisitor;
import fullfsmeval.revisitor.operations.fullfsmeval.ActionBindBlockOperation;
import fullfsmeval.revisitor.operations.fullfsmeval.GuardBindExpOperation;

@SuppressWarnings("all")
public class ActionBindBlockOperationImpl implements ActionBindBlockOperation {
  private ActionBindBlock obj;
  
  private FullfsmevalRevisitor<ALVarRefOperation, ActionOperation, ActionBindBlockOperation, AndOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOpOperation, ArithPlusOperation, AssignOperation, BinExpOperation, BlockOperation, ExpOperation, FalsOperation, GuardOperation, GuardBindExpOperation, InitialStateOperation, LitOperation, MachineOperation, NotOperation, OrOperation, PrintOperation, StateOperation, StmtOperation, TransOperation, TruOperation, VarDeclOperation, VarRefOperation> alg;
  
  public ActionBindBlockOperationImpl(final ActionBindBlock obj, final FullfsmevalRevisitor<ALVarRefOperation, ActionOperation, ActionBindBlockOperation, AndOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOpOperation, ArithPlusOperation, AssignOperation, BinExpOperation, BlockOperation, ExpOperation, FalsOperation, GuardOperation, GuardBindExpOperation, InitialStateOperation, LitOperation, MachineOperation, NotOperation, OrOperation, PrintOperation, StateOperation, StmtOperation, TransOperation, TruOperation, VarDeclOperation, VarRefOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void run(final Context ctx) {
    fullfsmeval.converters.ActionToBlockWithrunToeval convert =  new fullfsmeval.converters.ActionToBlockWithrunToeval(ctx);
    
    
    simpleALEnv.runtime.Env nenv = convert.adaptenv();
    convert.setNenv(nenv);
    
    
    alg.$(obj.getDelegate()).eval(nenv);
    
    convert.doInverse();
    
  }
}
