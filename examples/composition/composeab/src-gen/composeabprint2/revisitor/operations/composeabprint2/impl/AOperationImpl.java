package composeabprint2.revisitor.operations.composeabprint2.impl;

import composeabprint2.revisitor.Composeabprint2Revisitor;
import composeabprint2.revisitor.operations.composeabprint2.AOperation;
import composeabprint2.revisitor.operations.composeabprint2.B1Operation;
import composeabprint2.revisitor.operations.composeabprint2.BBindB1Operation;
import composeabprint2.revisitor.operations.composeabprint2.BOperation;
import simplea.A;

@SuppressWarnings("all")
public class AOperationImpl extends printsimplea.revisitor.operations.printsimplea.impl.AOperationImpl implements AOperation {
  private A obj;
  
  private Composeabprint2Revisitor<? extends AOperation, ? extends BOperation, ? extends B1Operation, ? extends BBindB1Operation> alg;
  
  public AOperationImpl(final A obj, final Composeabprint2Revisitor<? extends AOperation, ? extends BOperation, ? extends B1Operation, ? extends BBindB1Operation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
