package composeabprint2.revisitor.operations.composeabprint2.impl;

import composeabprint2.revisitor.Composeabprint2Revisitor;
import composeabprint2.revisitor.operations.composeabprint2.AOperation;
import composeabprint2.revisitor.operations.composeabprint2.B1Operation;
import composeabprint2.revisitor.operations.composeabprint2.BBindB1Operation;
import composeabprint2.revisitor.operations.composeabprint2.BOperation;
import simpleb.B1;

@SuppressWarnings("all")
public class B1OperationImpl extends printsimpleb.revisitor.operations.printsimpleb.impl.B1OperationImpl implements B1Operation {
  private B1 obj;
  
  private Composeabprint2Revisitor<? extends AOperation, ? extends BOperation, ? extends B1Operation, ? extends BBindB1Operation> alg;
  
  public B1OperationImpl(final B1 obj, final Composeabprint2Revisitor<? extends AOperation, ? extends BOperation, ? extends B1Operation, ? extends BBindB1Operation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}
