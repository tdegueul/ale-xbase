package ale1sem.revisitor.operations.impl;

import ale1.A1;
import ale1.RA1;
import ale1.RA2;
import ale1.revisitor.Ale1Revisitor;
import ale1sem.revisitor.operations.A1Operation;
import ale1sem.revisitor.operations.RA1Operation;
import ale1sem.revisitor.operations.RA2Operation;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class A1OperationImpl implements A1Operation {
  private A1 obj;
  
  private Ale1Revisitor<A1Operation, RA1Operation, RA2Operation> alg;
  
  public A1OperationImpl(final A1 obj, final Ale1Revisitor<A1Operation, RA1Operation, RA2Operation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void a1Print() {
    InputOutput.<String>println("A1");
    final Consumer<RA1> _function = (RA1 it) -> {
      this.alg.$(it).ra1Print();
    };
    this.obj.getRa1().forEach(_function);
    final Consumer<RA2> _function_1 = (RA2 it) -> {
      this.alg.$(it).ra2Print();
    };
    this.obj.getRa2().forEach(_function_1);
  }
}
