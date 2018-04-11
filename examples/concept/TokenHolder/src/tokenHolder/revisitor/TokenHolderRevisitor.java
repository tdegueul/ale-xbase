package tokenHolder.revisitor;

public interface TokenHolderRevisitor<TokenHolder__HT, TokenHolder__PT, TokenHolder__RT, TokenHolder__TT> {

	TokenHolder__HT $(final tokenHolder.H it);
	default TokenHolder__PT $(final tokenHolder.P it) {
		return null;
	}
	default TokenHolder__RT $(final tokenHolder.R it) {
		return null;
	}
	TokenHolder__TT $(final tokenHolder.T it);
}
