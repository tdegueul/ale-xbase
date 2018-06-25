package composeabprint2.revisitor.operations.composeabprint2.impl;

import composeabprint2.BBindB1;
import composeabprint2.revisitor.Composeabprint2Revisitor;
import composeabprint2.revisitor.operations.composeabprint2.AOperation;
import composeabprint2.revisitor.operations.composeabprint2.B1Operation;
import composeabprint2.revisitor.operations.composeabprint2.BBindB1Operation;
import composeabprint2.revisitor.operations.composeabprint2.BOperation;

@SuppressWarnings("all")
public abstract class BBindB1OperationImpl implements BBindB1Operation {
  private BBindB1 obj;
  
  private Composeabprint2Revisitor<? extends AOperation, ? extends BOperation, ? extends B1Operation, ? extends BBindB1Operation> alg;
  
  public BBindB1OperationImpl(final BBindB1 obj, final Composeabprint2Revisitor<? extends AOperation, ? extends BOperation, ? extends B1Operation, ? extends BBindB1Operation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void call() {
    this.alg.$(this.obj.getDelegate()).name();
  }
  
  @Override
  public void callWithArg(final String value) {
    this.alg.$(this.obj.getDelegate()).receiverWithParam(value);
  }
}
