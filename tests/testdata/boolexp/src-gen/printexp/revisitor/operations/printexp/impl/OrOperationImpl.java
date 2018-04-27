package printexp.revisitor.operations.printexp.impl;

import boolexp.Or;
import boolexp.revisitor.BoolexpRevisitor;
import printexp.revisitor.operations.printexp.AndOperation;
import printexp.revisitor.operations.printexp.BinaryExpOperation;
import printexp.revisitor.operations.printexp.ExpOperation;
import printexp.revisitor.operations.printexp.FalsOperation;
import printexp.revisitor.operations.printexp.LitOperation;
import printexp.revisitor.operations.printexp.OrOperation;
import printexp.revisitor.operations.printexp.TruOperation;
import printexp.revisitor.operations.printexp.impl.BinaryExpOperationImpl;

@SuppressWarnings("all")
public class OrOperationImpl extends BinaryExpOperationImpl implements OrOperation {
  private Or obj;
  
  private BoolexpRevisitor<AndOperation, BinaryExpOperation, ExpOperation, FalsOperation, LitOperation, OrOperation, TruOperation> alg;
  
  public OrOperationImpl(final Or obj, final BoolexpRevisitor<AndOperation, BinaryExpOperation, ExpOperation, FalsOperation, LitOperation, OrOperation, TruOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _print = this.alg.$(this.obj.getLhs()).print();
    String _plus = (_print + " || ");
    String _print_1 = this.alg.$(this.obj.getRhs()).print();
    return (_plus + _print_1);
  }
}
