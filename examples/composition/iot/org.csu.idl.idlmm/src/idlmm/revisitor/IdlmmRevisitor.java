package idlmm.revisitor;

public interface IdlmmRevisitor<Idlmm__ContainedT extends Idlmm__NamedElementT, Idlmm__ContainerT extends Idlmm__ContainedT, Idlmm__ExceptionDefT extends Idlmm__ContainedT, Idlmm__FieldIT, Idlmm__IDLTypeT, Idlmm__IdlStmtT, Idlmm__NamedElementT, Idlmm__OperationDefT extends Idlmm__ContainedT, Idlmm__ParameterDefT, Idlmm__PrimitiveDefT extends Idlmm__IDLTypeT> {
	Idlmm__ExceptionDefT idlmm__ExceptionDef(final idlmm.ExceptionDef it);
	Idlmm__FieldIT idlmm__FieldI(final idlmm.FieldI it);
	Idlmm__OperationDefT idlmm__OperationDef(final idlmm.OperationDef it);
	Idlmm__ParameterDefT idlmm__ParameterDef(final idlmm.ParameterDef it);
	Idlmm__PrimitiveDefT idlmm__PrimitiveDef(final idlmm.PrimitiveDef it);

	default Idlmm__ContainedT $(final idlmm.Contained it) {
		if (it.getClass() == idlmm.impl.ExceptionDefImpl.class)
			return idlmm__ExceptionDef((idlmm.ExceptionDef) it);
		if (it.getClass() == idlmm.impl.OperationDefImpl.class)
			return idlmm__OperationDef((idlmm.OperationDef) it);
		return null;
	}
	default Idlmm__ContainerT $(final idlmm.Container it) {
		return null;
	}
	default Idlmm__ExceptionDefT $(final idlmm.ExceptionDef it) {
		return idlmm__ExceptionDef(it);
	}
	default Idlmm__FieldIT $(final idlmm.FieldI it) {
		return idlmm__FieldI(it);
	}
	default Idlmm__IDLTypeT $(final idlmm.IDLType it) {
		if (it.getClass() == idlmm.impl.PrimitiveDefImpl.class)
			return idlmm__PrimitiveDef((idlmm.PrimitiveDef) it);
		return null;
	}
	Idlmm__IdlStmtT $(final idlmm.IdlStmt it);
	default Idlmm__NamedElementT $(final idlmm.NamedElement it) {
		if (it.getClass() == idlmm.impl.ExceptionDefImpl.class)
			return idlmm__ExceptionDef((idlmm.ExceptionDef) it);
		if (it.getClass() == idlmm.impl.OperationDefImpl.class)
			return idlmm__OperationDef((idlmm.OperationDef) it);
		return null;
	}
	default Idlmm__OperationDefT $(final idlmm.OperationDef it) {
		return idlmm__OperationDef(it);
	}
	default Idlmm__ParameterDefT $(final idlmm.ParameterDef it) {
		return idlmm__ParameterDef(it);
	}
	default Idlmm__PrimitiveDefT $(final idlmm.PrimitiveDef it) {
		return idlmm__PrimitiveDef(it);
	}
}
