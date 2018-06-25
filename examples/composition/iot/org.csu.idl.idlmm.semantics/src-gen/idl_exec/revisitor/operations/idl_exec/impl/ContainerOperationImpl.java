package idl_exec.revisitor.operations.idl_exec.impl;

import idl_exec.revisitor.operations.idl_exec.ContainedOperation;
import idl_exec.revisitor.operations.idl_exec.ContainerOperation;
import idl_exec.revisitor.operations.idl_exec.ExceptionDefOperation;
import idl_exec.revisitor.operations.idl_exec.FieldOperation;
import idl_exec.revisitor.operations.idl_exec.IDLTypeOperation;
import idl_exec.revisitor.operations.idl_exec.NamedElementOperation;
import idl_exec.revisitor.operations.idl_exec.OperationDefOperation;
import idl_exec.revisitor.operations.idl_exec.ParameterDefOperation;
import idl_exec.revisitor.operations.idl_exec.PrimitiveDefOperation;
import idl_exec.revisitor.operations.idl_exec.TypedOperation;
import idl_exec.revisitor.operations.idl_exec.TypedefDefOperation;
import idl_exec.revisitor.operations.idl_exec.impl.ContainedOperationImpl;
import idlmm.revisitor.IdlmmRevisitor;
import org.csu.idl.idlmm.Container;

@SuppressWarnings("all")
public class ContainerOperationImpl extends ContainedOperationImpl implements ContainerOperation {
  private Container obj;
  
  private IdlmmRevisitor<? extends ContainedOperation, ? extends ContainerOperation, ? extends ExceptionDefOperation, ? extends FieldOperation, ? extends IDLTypeOperation, ? extends NamedElementOperation, ? extends OperationDefOperation, ? extends ParameterDefOperation, ? extends PrimitiveDefOperation, ? extends TypedOperation, ? extends TypedefDefOperation> alg;
  
  public ContainerOperationImpl(final Container obj, final IdlmmRevisitor<? extends ContainedOperation, ? extends ContainerOperation, ? extends ExceptionDefOperation, ? extends FieldOperation, ? extends IDLTypeOperation, ? extends NamedElementOperation, ? extends OperationDefOperation, ? extends ParameterDefOperation, ? extends PrimitiveDefOperation, ? extends TypedOperation, ? extends TypedefDefOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
