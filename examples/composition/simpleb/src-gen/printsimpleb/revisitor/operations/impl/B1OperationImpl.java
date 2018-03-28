package printsimpleb.revisitor.operations.impl;

import org.eclipse.xtext.xbase.lib.InputOutput;
import printsimpleb.revisitor.operations.B1Operation;
import simpleb.B1;
import simpleb.revisitor.SimplebRevisitor;

@SuppressWarnings("all")
public class B1OperationImpl implements B1Operation {
  private B1 self;
  
  private SimplebRevisitor<B1Operation> alg;
  
  public B1OperationImpl(final B1 self, final SimplebRevisitor<B1Operation> alg) {
    this.self = self;
    this.alg = alg;
  }
  
  @Override
  public void name() {
    InputOutput.<String>println(this.self.getName());
  }
}
