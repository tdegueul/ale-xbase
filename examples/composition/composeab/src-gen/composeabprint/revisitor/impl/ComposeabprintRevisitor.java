package composeabprint.revisitor.impl;

import printsimplea.revisitor.operations.AOperation;
import printsimplea.revisitor.operations.BOperation;
import printsimpleb.revisitor.operations.B1Operation;

@SuppressWarnings("all")
public interface ComposeabprintRevisitor extends composeabprint.revisitor.ComposeabprintRevisitor<AOperation, BOperation, B1Operation, Object> {
}
