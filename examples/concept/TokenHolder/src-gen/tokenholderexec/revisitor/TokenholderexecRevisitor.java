package tokenholderexec.revisitor;

import tokenHolder.revisitor.TokenHolderRevisitor;
import tokenholderexec.revisitor.operations.HOperation;
import tokenholderexec.revisitor.operations.POperation;
import tokenholderexec.revisitor.operations.ROperation;

@SuppressWarnings("all")
public interface TokenholderexecRevisitor extends TokenHolderRevisitor<HOperation, POperation, ROperation, Object> {
}
