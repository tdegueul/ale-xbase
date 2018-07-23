package fullhierarchicalfsmeval.revisitor.impl;

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
import evalboolexp.revisitor.operations.evalboolexp.AndOperation;
import evalboolexp.revisitor.operations.evalboolexp.BinExpOperation;
import evalboolexp.revisitor.operations.evalboolexp.ExpOperation;
import evalboolexp.revisitor.operations.evalboolexp.FalsOperation;
import evalboolexp.revisitor.operations.evalboolexp.LitOperation;
import evalboolexp.revisitor.operations.evalboolexp.NotOperation;
import evalboolexp.revisitor.operations.evalboolexp.OrOperation;
import evalboolexp.revisitor.operations.evalboolexp.TruOperation;
import evalboolexp.revisitor.operations.evalboolexp.VarRefOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.ActionOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.CompositeStateOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.GuardOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.InitialStateOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.MachineOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.RegionOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.StateOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.TransOperation;
import evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.VarDeclOperation;
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
import fullhierarchicalfsmeval.ActionBindBlock;
import fullhierarchicalfsmeval.GuardBindExp;
import fullhierarchicalfsmeval.revisitor.operations.fullhierarchicalfsmeval.ActionBindBlockOperation;
import fullhierarchicalfsmeval.revisitor.operations.fullhierarchicalfsmeval.GuardBindExpOperation;
import hierarchicalFsmEnv.CompositeState;
import hierarchicalFsmEnv.Region;
import simpleALEnv.ALVarRef;
import simpleALEnv.ArithLit;
import simpleALEnv.ArithMinus;
import simpleALEnv.ArithPlus;
import simpleALEnv.Assign;
import simpleALEnv.Block;
import simpleALEnv.Print;

@SuppressWarnings("all")
public interface FullhierarchicalfsmevalRevisitor extends fullhierarchicalfsmeval.revisitor.FullhierarchicalfsmevalRevisitor<ALVarRefOperation, ActionOperation, ActionBindBlockOperation, AndOperation, ArithOperation, ArithLitOperation, ArithMinusOperation, ArithOpOperation, ArithPlusOperation, AssignOperation, BinExpOperation, BlockOperation, CompositeStateOperation, ExpOperation, FalsOperation, GuardOperation, GuardBindExpOperation, InitialStateOperation, LitOperation, MachineOperation, NotOperation, OrOperation, PrintOperation, RegionOperation, StateOperation, StmtOperation, TransOperation, TruOperation, VarDeclOperation, VarRefOperation> {
  @Override
  public default ActionBindBlockOperation fullhierarchicalfsmeval__ActionBindBlock(final ActionBindBlock it) {
    return new fullhierarchicalfsmeval.revisitor.operations.fullhierarchicalfsmeval.impl.ActionBindBlockOperationImpl(it, this);
  }
  
  @Override
  public default GuardBindExpOperation fullhierarchicalfsmeval__GuardBindExp(final GuardBindExp it) {
    return new fullhierarchicalfsmeval.revisitor.operations.fullhierarchicalfsmeval.impl.GuardBindExpOperationImpl(it, this);
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
  public default MachineOperation basicFsmEnv__Machine(final Machine it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.MachineOperationImpl(it, this);
  }
  
  @Override
  public default StateOperation basicFsmEnv__State(final State it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.StateOperationImpl(it, this);
  }
  
  @Override
  public default TransOperation basicFsmEnv__Trans(final Trans it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.TransOperationImpl(it, this);
  }
  
  @Override
  public default InitialStateOperation basicFsmEnv__InitialState(final InitialState it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.InitialStateOperationImpl(it, this);
  }
  
  @Override
  public default VarDeclOperation basicFsmEnv__VarDecl(final VarDecl it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.VarDeclOperationImpl(it, this);
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
  
  @Override
  public default CompositeStateOperation hierarchicalFsmEnv__CompositeState(final CompositeState it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.CompositeStateOperationImpl(it, this);
  }
  
  @Override
  public default RegionOperation hierarchicalFsmEnv__Region(final Region it) {
    return new evalhierarchicalfsm.revisitor.operations.evalhierarchicalfsm.impl.RegionOperationImpl(it, this);
  }
}
