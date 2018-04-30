package fullfsmeval.revisitor.operations.impl;

import basicFsmEnv.runtime.Context;
import evalbasicfsm.revisitor.operations.ActionOperation;
import evalbasicfsm.revisitor.operations.GuardOperation;
import evalbasicfsm.revisitor.operations.InitialStateOperation;
import evalbasicfsm.revisitor.operations.MachineOperation;
import evalbasicfsm.revisitor.operations.StateOperation;
import evalbasicfsm.revisitor.operations.TransOperation;
import evalbasicfsm.revisitor.operations.VarDeclOperation;
import evalboolexp.revisitor.operations.AndOperation;
import evalboolexp.revisitor.operations.BinExpOperation;
import evalboolexp.revisitor.operations.ExpOperation;
import evalboolexp.revisitor.operations.FalsOperation;
import evalboolexp.revisitor.operations.LitOperation;
import evalboolexp.revisitor.operations.NotOperation;
import evalboolexp.revisitor.operations.OrOperation;
import evalboolexp.revisitor.operations.TruOperation;
import evalboolexp.revisitor.operations.VarRefOperation;
import evalsimpleal.revisitor.operations.ALVarRefOperation;
import evalsimpleal.revisitor.operations.ArithLitOperation;
import evalsimpleal.revisitor.operations.ArithMinusOperation;
import evalsimpleal.revisitor.operations.ArithOpOperation;
import evalsimpleal.revisitor.operations.ArithOperation;
import evalsimpleal.revisitor.operations.ArithPlusOperation;
import evalsimpleal.revisitor.operations.AssignOperation;
import evalsimpleal.revisitor.operations.BlockOperation;
import evalsimpleal.revisitor.operations.PrintOperation;
import evalsimpleal.revisitor.operations.StmtOperation;
import fullfsmeval.GuardBindExp;
import fullfsmeval.revisitor.FullfsmevalRevisitor;
import fullfsmeval.revisitor.operations.ActionBindBlockOperation;
import fullfsmeval.revisitor.operations.GuardBindExpOperation;

@SuppressWarnings("all")
public class GuardBindExpOperationImpl implements GuardBindExpOperation {
  private GuardBindExp obj;
  
  private FullfsmevalRevisitor<ALVarRefOperation, ActionOperation, ActionBindBlockOperation, AndOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOpOperation, ArithPlusOperation, AssignOperation, BinExpOperation, BlockOperation, ExpOperation, FalsOperation, GuardOperation, GuardBindExpOperation, InitialStateOperation, LitOperation, MachineOperation, NotOperation, OrOperation, PrintOperation, StateOperation, StmtOperation, TransOperation, TruOperation, VarDeclOperation, VarRefOperation> alg;
  
  public GuardBindExpOperationImpl(final GuardBindExp obj, final FullfsmevalRevisitor<ALVarRefOperation, ActionOperation, ActionBindBlockOperation, AndOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOpOperation, ArithPlusOperation, AssignOperation, BinExpOperation, BlockOperation, ExpOperation, FalsOperation, GuardOperation, GuardBindExpOperation, InitialStateOperation, LitOperation, MachineOperation, NotOperation, OrOperation, PrintOperation, StateOperation, StmtOperation, TransOperation, TruOperation, VarDeclOperation, VarRefOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public boolean eval(final Context ctx) {
    fullfsmeval.converters.GuardToExpWithevalToeval convert =  new fullfsmeval.converters.GuardToExpWithevalToeval(ctx);
    
    
    boolExpEnv.runtime.Env nenv = convert.adaptenv();
    convert.setNenv(nenv);
    
    
    boolean res = convert.convertReturn(alg.$(obj.getDelegate()).eval(nenv));
    
    
    return res;
  }
}
