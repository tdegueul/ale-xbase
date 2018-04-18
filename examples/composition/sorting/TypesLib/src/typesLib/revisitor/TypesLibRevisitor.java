package typesLib.revisitor;

public interface TypesLibRevisitor<TypesLib__IntWrapperT> {
	TypesLib__IntWrapperT intWrapper(final typesLib.IntWrapper it);

	default TypesLib__IntWrapperT $(final typesLib.IntWrapper it) {
		return intWrapper(it);
	}
}
