package idl_exec.revisitor.impl;

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
import idlmm.revisitor.IdlmmRevisitor;
import org.csu.idl.idlmm.ExceptionDef;
import org.csu.idl.idlmm.Field;
import org.csu.idl.idlmm.OperationDef;
import org.csu.idl.idlmm.ParameterDef;
import org.csu.idl.idlmm.PrimitiveDef;

@SuppressWarnings("all")
public interface Idl_execRevisitor extends IdlmmRevisitor<ContainedOperation, ContainerOperation, ExceptionDefOperation, FieldOperation, IDLTypeOperation, NamedElementOperation, OperationDefOperation, ParameterDefOperation, PrimitiveDefOperation, TypedOperation, TypedefDefOperation> {
  @Override
  public default ExceptionDefOperation idlmm__ExceptionDef(final ExceptionDef it) {
    return new idl_exec.revisitor.operations.idl_exec.impl.ExceptionDefOperationImpl(it, this);
  }
  
  @Override
  public default FieldOperation idlmm__Field(final Field it) {
    return new idl_exec.revisitor.operations.idl_exec.impl.FieldOperationImpl(it, this);
  }
  
  @Override
  public default OperationDefOperation idlmm__OperationDef(final OperationDef it) {
    return new idl_exec.revisitor.operations.idl_exec.impl.OperationDefOperationImpl(it, this);
  }
  
  @Override
  public default OperationDefOperation idlmm__Typed_idlmm__OperationDef(final OperationDef it) {
    return new idl_exec.revisitor.operations.idl_exec.impl.OperationDefOperationImpl(it, this);
  }
  
  @Override
  public default ParameterDefOperation idlmm__ParameterDef(final ParameterDef it) {
    return new idl_exec.revisitor.operations.idl_exec.impl.ParameterDefOperationImpl(it, this);
  }
  
  @Override
  public default PrimitiveDefOperation idlmm__PrimitiveDef(final PrimitiveDef it) {
    return new idl_exec.revisitor.operations.idl_exec.impl.PrimitiveDefOperationImpl(it, this);
  }
}
