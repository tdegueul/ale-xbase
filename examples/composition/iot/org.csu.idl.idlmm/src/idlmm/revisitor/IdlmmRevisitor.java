package idlmm.revisitor;

import org.csu.idl.idlmm.FieldI;

public interface IdlmmRevisitor<Idlmm__ContainedT extends Idlmm__NamedElementT, Idlmm__ContainerT extends Idlmm__ContainedT, Idlmm__ExceptionDefT extends Idlmm__ContainedT, Idlmm__FieldIT extends Idlmm__TypedT, Idlmm__IDLTypeT, Idlmm__NamedElementT, Idlmm__OperationDefT, Idlmm__OperationDefT_AS_Idlmm__ContainedT extends Idlmm__ContainedT, Idlmm__OperationDefT_AS_Idlmm__TypedT extends Idlmm__TypedT, Idlmm__ParameterDefT extends Idlmm__TypedT, Idlmm__PrimitiveDefT extends Idlmm__IDLTypeT, Idlmm__TypedT, Idlmm__TypedefDefT, Idlmm__TypedefDefT_AS_Idlmm__IDLTypeT extends Idlmm__IDLTypeT, Idlmm__TypedefDefT_AS_Idlmm__ContainedT extends Idlmm__ContainedT> {
	Idlmm__ExceptionDefT idlmm__ExceptionDef(final org.csu.idl.idlmm.ExceptionDef it);
	Idlmm__FieldIT idlmm__FieldI(final FieldI it);
	Idlmm__OperationDefT idlmm__OperationDef(final org.csu.idl.idlmm.OperationDef it);
	Idlmm__OperationDefT_AS_Idlmm__ContainedT idlmm__OperationDef__as__idlmm__Contained(final org.csu.idl.idlmm.OperationDef it);
	Idlmm__OperationDefT_AS_Idlmm__TypedT idlmm__OperationDef__as__idlmm__Typed(final org.csu.idl.idlmm.OperationDef it);
	Idlmm__ParameterDefT idlmm__ParameterDef(final org.csu.idl.idlmm.ParameterDef it);
	Idlmm__PrimitiveDefT idlmm__PrimitiveDef(final org.csu.idl.idlmm.PrimitiveDef it);

	default Idlmm__ContainedT $(final org.csu.idl.idlmm.Contained it) {
		if (it.getClass() == org.csu.idl.idlmm.impl.ExceptionDefImpl.class)
			return idlmm__ExceptionDef((org.csu.idl.idlmm.ExceptionDef) it);
		if (it.getClass() == org.csu.idl.idlmm.impl.OperationDefImpl.class)
			return idlmm__OperationDef__as__idlmm__Contained((org.csu.idl.idlmm.OperationDef) it);
		return null;
	}
	default Idlmm__ContainerT $(final org.csu.idl.idlmm.Container it) {
		return null;
	}
	default Idlmm__ExceptionDefT $(final org.csu.idl.idlmm.ExceptionDef it) {
		return idlmm__ExceptionDef(it);
	}
	default Idlmm__FieldIT $(final FieldI it) {
		return idlmm__FieldI(it);
	}
	default Idlmm__IDLTypeT $(final org.csu.idl.idlmm.IDLType it) {
		if (it.getClass() == org.csu.idl.idlmm.impl.PrimitiveDefImpl.class)
			return idlmm__PrimitiveDef((org.csu.idl.idlmm.PrimitiveDef) it);
		return null;
	}
	default Idlmm__NamedElementT $(final org.csu.idl.idlmm.NamedElement it) {
		if (it.getClass() == org.csu.idl.idlmm.impl.ExceptionDefImpl.class)
			return idlmm__ExceptionDef((org.csu.idl.idlmm.ExceptionDef) it);
		if (it.getClass() == org.csu.idl.idlmm.impl.OperationDefImpl.class)
			return idlmm__OperationDef__as__idlmm__Contained((org.csu.idl.idlmm.OperationDef) it);
		return null;
	}
	default Idlmm__OperationDefT $(final org.csu.idl.idlmm.OperationDef it) {
		return idlmm__OperationDef(it);
	}
	default Idlmm__ParameterDefT $(final org.csu.idl.idlmm.ParameterDef it) {
		return idlmm__ParameterDef(it);
	}
	default Idlmm__PrimitiveDefT $(final org.csu.idl.idlmm.PrimitiveDef it) {
		return idlmm__PrimitiveDef(it);
	}
	default Idlmm__TypedT $(final org.csu.idl.idlmm.Typed it) {
		if (it.getClass() == FieldI.class)
			return idlmm__FieldI((FieldI) it);
		if (it.getClass() == org.csu.idl.idlmm.impl.OperationDefImpl.class)
			return idlmm__OperationDef__as__idlmm__Typed((org.csu.idl.idlmm.OperationDef) it);
		if (it.getClass() == org.csu.idl.idlmm.impl.ParameterDefImpl.class)
			return idlmm__ParameterDef((org.csu.idl.idlmm.ParameterDef) it);
		return null;
	}
	default Idlmm__TypedefDefT $(final org.csu.idl.idlmm.TypedefDef it) {
		return null;
	}
}
