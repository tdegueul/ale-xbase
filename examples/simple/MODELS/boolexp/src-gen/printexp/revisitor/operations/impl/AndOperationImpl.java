package printexp.revisitor.operations.impl;

import boolexp.And;
import boolexp.revisitor.BoolexpRevisitor;
import printexp.revisitor.operations.AndOperation;
import printexp.revisitor.operations.ExpOperation;
import printexp.revisitor.operations.FalsOperation;
import printexp.revisitor.operations.OrOperation;
import printexp.revisitor.operations.TruOperation;
import printexp.revisitor.operations.impl.ExpOperationImpl;

@SuppressWarnings("all")
public class AndOperationImpl extends ExpOperationImpl implements AndOperation {
  private And obj;
  
  private BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg;
  
  public AndOperationImpl(final And obj, final BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _print = this.alg.$(this.obj.getLhs()).print();
    String _plus = (_print + " && ");
    String _print_1 = this.alg.$(this.obj.getRhs()).print();
    return (_plus + _print_1);
  }
}
