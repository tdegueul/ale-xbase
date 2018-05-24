package composeabprint.revisitor;

import composeabprint.BBindB1;
import composeabprint.revisitor.operations.composeabprint.BBindB1Operation;
import printsimplea.revisitor.operations.printsimplea.AOperation;
import printsimplea.revisitor.operations.printsimplea.BOperation;
import printsimpleb.revisitor.operations.printsimpleb.B1Operation;
import simplea.A;
import simpleb.B1;

@SuppressWarnings("all")
public interface ComposeabprintRevisitorWithProxy<Simplea__AT, Simplea__BT, Simpleb__B1T> extends
		simplea.revisitor.SimpleaRevisitor<Simplea__AT, Simplea__BT>, simpleb.revisitor.SimplebRevisitor<Simpleb__B1T> {
}
