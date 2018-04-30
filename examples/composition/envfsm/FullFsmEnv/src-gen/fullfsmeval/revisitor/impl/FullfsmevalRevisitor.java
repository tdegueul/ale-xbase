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
import fullfsmeval.GuardBindExp;
import fullfsmeval.revisitor.operations.fullfsmeval.ActionBindBlockOperation;
import fullfsmeval.revisitor.operations.fullfsmeval.GuardBindExpOperation;
import simpleALEnv.ALVarRef;
import simpleALEnv.ArithLit;
import simpleALEnv.ArithMinus;
import simpleALEnv.ArithPlus;
import simpleALEnv.Assign;
import simpleALEnv.Block;
import simpleALEnv.Print;

@SuppressWarnings("all")
public interface FullfsmevalRevisitor extends fullfsmeval.revisitor.FullfsmevalRevisitor<ALVarRefOperation, ActionOperation, ActionBindBlockOperation, AndOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOpOperation, ArithPlusOperation, AssignOperation, BinExpOperation, BlockOperation, ExpOperation, FalsOperation, GuardOperation, GuardBindExpOperation, InitialStateOperation, LitOperation, MachineOperation, NotOperation, OrOperation, PrintOperation, StateOperation, StmtOperation, TransOperation, TruOperation, VarDeclOperation, VarRefOperation> {
  @Override
  public default ActionBindBlockOperation fullfsmeval__ActionBindBlock(final ActionBindBlock it) {
    return new fullfsmeval.revisitor.operations.fullfsmeval.impl.ActionBindBlockOperationImpl(it, this);
  }
  
  @Override
  public default GuardBindExpOperation fullfsmeval__GuardBindExp(final GuardBindExp it) {
    return new fullfsmeval.revisitor.operations.fullfsmeval.impl.GuardBindExpOperationImpl(it, this);
  }
  
  @Override
  public default MachineOperation basicFsmEnv__Machine(final Machine it) {
    return new evalbasicfsm.revisitor.operations.evalbasicfsm.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation basicFsmEnv__State(final State it) {
    return new evalbasicfsm.revisitor.operations.evalbasicfsm.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransOperation basicFsmEnv__Trans(final Trans it) {
    return new evalbasicfsm.revisitor.operations.evalbasicfsm.impl.TransOperationImpl(it, this);
  }
  
  @Override
  public default InitialStateOperation basicFsmEnv__InitialState(final InitialState it) {
    return new evalbasicfsm.revisitor.operations.evalbasicfsm.impl.InitialStateOperationImpl(it, this);
  }
  
  @Override
  public default VarDeclOperation basicFsmEnv__VarDecl(final VarDecl it) {
    return new evalbasicfsm.revisitor.operations.evalbasicfsm.impl.VarDeclOperationImpl(it, this);
  }
  
  @Override
  public default TruOperation boolExpEnv__Tru(final Tru it) {
    return new evalboolexp.revisitor.operations.evalboolexp.impl.TruOperationImpl(it, this);
  }
  
  @Override
  public default FalsOperation boolExpEnv__Fals(final Fals it) {
    return new evalboolexp.revisitor.operations.evalboolexp.impl.FalsOperationImpl(it, this);
  }
  
  @Override
  public default NotOperation boolExpEnv__Not(final Not it) {
    return new evalboolexp.revisitor.operations.evalboolexp.impl.NotOperationImpl(it, this);
  }
  
  @Override
  public default AndOperation boolExpEnv__And(final And it) {
    return new evalboolexp.revisitor.operations.evalboolexp.impl.AndOperationImpl(it, this);
  }
  
  @Override
  public default OrOperation boolExpEnv__Or(final Or it) {
    return new evalboolexp.revisitor.operations.evalboolexp.impl.OrOperationImpl(it, this);
  }
  
  @Override
  public default VarRefOperation boolExpEnv__VarRef(final VarRef it) {
    return new evalboolexp.revisitor.operations.evalboolexp.impl.VarRefOperationImpl(it, this);
  }
  
  @Override
  public default BlockOperation simpleALEnv__Block(final Block it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.BlockOperationImpl(it, this);
  }
  
  @Override
  public default ALVarRefOperation simpleALEnv__ALVarRef(final ALVarRef it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.ALVarRefOperationImpl(it, this);
  }
  
  @Override
  public default ArithLitOperation simpleALEnv__ArithLit(final ArithLit it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.ArithLitOperationImpl(it, this);
  }
  
  @Override
  public default ArithPlusOperation simpleALEnv__ArithPlus(final ArithPlus it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.ArithPlusOperationImpl(it, this);
  }
  
  @Override
  public default ArithMinusOperation simpleALEnv__ArithMinus(final ArithMinus it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.ArithMinusOperationImpl(it, this);
  }
  
  @Override
  public default PrintOperation simpleALEnv__Print(final Print it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.PrintOperationImpl(it, this);
  }
  
  @Override
  public default AssignOperation simpleALEnv__Assign(final Assign it) {
    return new evalsimpleal.revisitor.operations.evalsimpleal.impl.AssignOperationImpl(it, this);
  }
}
