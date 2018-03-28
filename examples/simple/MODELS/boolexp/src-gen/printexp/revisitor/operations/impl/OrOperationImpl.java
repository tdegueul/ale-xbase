package printexp.revisitor.operations.impl;

import boolexp.Or;
import boolexp.revisitor.BoolexpRevisitor;
import printexp.revisitor.operations.AndOperation;
import printexp.revisitor.operations.ExpOperation;
import printexp.revisitor.operations.FalsOperation;
import printexp.revisitor.operations.OrOperation;
import printexp.revisitor.operations.TruOperation;
import printexp.revisitor.operations.impl.ExpOperationImpl;

@SuppressWarnings("all")
public class OrOperationImpl extends ExpOperationImpl implements OrOperation {
  private Or self;
  
  private BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg;
  
  public OrOperationImpl(final Or self, final BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> alg) {
    super(self, alg);
    this.self = self;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    String _print = this.alg.$(this.self.getLhs()).print();
    String _plus = (_print + " || ");
    String _print_1 = this.alg.$(this.self.getRhs()).print();
    return (_plus + _print_1);
  }
}
