package fullfsmeval.revisitor.impl;

import basicFsmEnv.InitialState;
import basicFsmEnv.Machine;
import basicFsmEnv.State;
import basicFsmEnv.Trans;
import basicFsmEnv.VarDecl;
import boolExpEnv.And;
import boolExpEnv.Fals;
import boolExpEnv.Not;
import boolExpEnv.Or;
import boolExpEnv.Tru;
import boolExpEnv.VarRef;
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
import fullfsmeval.ActionBindBlock;
import fullfsmeval.GuardBindExp;
import fullfsmeval.revisitor.operations.ActionBindBlockOperation;
import fullfsmeval.revisitor.operations.GuardBindExpOperation;
import simpleALEnv.ALVarRef;
import simpleALEnv.ArithLit;
import simpleALEnv.ArithMinus;
import simpleALEnv.ArithPlus;
import simpleALEnv.Assign;
import simpleALEnv.Block;
import simpleALEnv.Print;

@SuppressWarnings("all")
public interface FullfsmevalRevisitor extends fullfsmeval.revisitor.FullfsmevalRevisitor<ALVarRefOperation, ActionOperation, ActionBindBlockOperation, AndOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOperation, ArithPlusOperation, AssignOperation, ExpOperation, BlockOperation, ExpOperation, FalsOperation, GuardOperation, GuardBindExpOperation, StateOperation, ExpOperation, MachineOperation, NotOperation, OrOperation, PrintOperation, StateOperation, StmtOperation, TransOperation, TruOperation, VarDeclOperation, VarRefOperation> {
  @Override
  public default ALVarRefOperation aLVarRef(final ALVarRef it) {
    return new evalsimpleal.revisitor.operations.impl.ALVarRefOperationImpl(it, this);
  }
  
  @Override
  public default ActionBindBlockOperation actionBindBlock(final ActionBindBlock it) {
    return new fullfsmeval.revisitor.operations.impl.ActionBindBlockOperationImpl(it, this);
  }
  
  @Override
  public default AndOperation and(final And it) {
    return new evalboolexp.revisitor.operations.impl.AndOperationImpl(it, this);
  }
  
  @Override
  public default ArithLitOperation arithLit(final ArithLit it) {
    return new evalsimpleal.revisitor.operations.impl.ArithLitOperationImpl(it, this);
  }
  
  @Override
  public default ArithMinusOperation arithMinus(final ArithMinus it) {
    return new evalsimpleal.revisitor.operations.impl.ArithMinusOperationImpl(it, this);
  }
  
  @Override
  public default ArithPlusOperation arithPlus(final ArithPlus it) {
    return new evalsimpleal.revisitor.operations.impl.ArithPlusOperationImpl(it, this);
  }
  
  @Override
  public default AssignOperation assign(final Assign it) {
    return new evalsimpleal.revisitor.operations.impl.AssignOperationImpl(it, this);
  }
  
  @Override
  public default BlockOperation block(final Block it) {
    return new evalsimpleal.revisitor.operations.impl.BlockOperationImpl(it, this);
  }
  
  @Override
  public default FalsOperation fals(final Fals it) {
    return new evalboolexp.revisitor.operations.impl.FalsOperationImpl(it, this);
  }
  
  @Override
  public default GuardBindExpOperation guardBindExp(final GuardBindExp it) {
    return new fullfsmeval.revisitor.operations.impl.GuardBindExpOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation initialState(final InitialState it) {
    return new evalbasicfsm.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation machine(final Machine it) {
    return new evalbasicfsm.revisitor.operations.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default NotOperation not(final Not it) {
    return new evalboolexp.revisitor.operations.impl.NotOperationImpl(it, this);
  }
  
  @Override
  public default OrOperation or(final Or it) {
    return new evalboolexp.revisitor.operations.impl.OrOperationImpl(it, this);
  }
  
  @Override
  public default PrintOperation print(final Print it) {
    return new evalsimpleal.revisitor.operations.impl.PrintOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation state(final State it) {
    return new evalbasicfsm.revisitor.operations.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransOperation trans(final Trans it) {
    return new evalbasicfsm.revisitor.operations.impl.TransOperationImpl(it, this);
  }
  
  @Override
  public default TruOperation tru(final Tru it) {
    return new evalboolexp.revisitor.operations.impl.TruOperationImpl(it, this);
  }
  
  @Override
  public default VarDeclOperation varDecl(final VarDecl it) {
    return new evalbasicfsm.revisitor.operations.impl.VarDeclOperationImpl(it, this);
  }
  
  @Override
  public default VarRefOperation varRef(final VarRef it) {
    return new evalboolexp.revisitor.operations.impl.VarRefOperationImpl(it, this);
  }
}
