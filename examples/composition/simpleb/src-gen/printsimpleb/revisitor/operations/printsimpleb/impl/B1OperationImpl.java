package printsimpleb.revisitor.operations.printsimpleb.impl;

import org.eclipse.xtext.xbase.lib.InputOutput;
import printsimpleb.revisitor.operations.printsimpleb.B1Operation;
import simpleb.B1;
import simpleb.revisitor.SimplebRevisitor;

@SuppressWarnings("all")
public class B1OperationImpl implements B1Operation {
  private B1 obj;
  
  private SimplebRevisitor<B1Operation> alg;
  
  public B1OperationImpl(final B1 obj, final SimplebRevisitor<B1Operation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void name() {
    InputOutput.<String>println(this.obj.getName());
  }
  
  @Override
  public void name2() {
    String _name = this.obj.getName();
    String _plus = (_name + "2");
    InputOutput.<String>println(_plus);
  }
  
  @Override
  public void receiverWithParam(final String value) {
    InputOutput.<String>println(("Hello " + value));
  }
  
  @Override
  public String toUpper(final String x) {
    return x.toUpperCase();
  }
}
