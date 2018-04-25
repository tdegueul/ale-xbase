package tokenholderexec.revisitor.operations.impl;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import tokenHolder.H;
import tokenHolder.P;
import tokenHolder.T;
import tokenHolder.revisitor.TokenHolderRevisitor;
import tokenholderexec.revisitor.operations.HOperation;
import tokenholderexec.revisitor.operations.POperation;
import tokenholderexec.revisitor.operations.ROperation;

@SuppressWarnings("all")
public abstract class POperationImpl implements POperation {
  private P obj;
  
  private TokenHolderRevisitor<HOperation, POperation, ROperation, Object> alg;
  
  public POperationImpl(final P obj, final TokenHolderRevisitor<HOperation, POperation, ROperation, Object> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public List<H> outHolders() {
    return this.obj.getOutHolders();
  }
  
  @Override
  public List<H> inHolders() {
    return this.obj.getInHolders();
  }
  
  @Override
  public boolean enabled() {
    boolean _xblockexpression = false;
    {
      final Function1<H, Boolean> _function = (H it) -> {
        boolean _isEmpty = this.alg.$(it).getTokens().isEmpty();
        return Boolean.valueOf((!_isEmpty));
      };
      final boolean res = IterableExtensions.<H>exists(this.alg.$(this.obj).inHolders(), _function);
      InputOutput.<Boolean>println(Boolean.valueOf(res));
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
  
  @Override
  public boolean fire() {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("fire");
      List<H> _outHolders = this.alg.$(this.obj).outHolders();
      for (final H p : _outHolders) {
        List<T> _tokens = this.alg.$(p).getTokens();
        T _createToken = this.alg.$(this.obj).createToken();
        _tokens.add(_createToken);
      }
      List<H> _inHolders = this.alg.$(this.obj).inHolders();
      for (final H p_1 : _inHolders) {
        double _random = Math.random();
        int _length = ((Object[])Conversions.unwrapArray(p_1.getTokens(), Object.class)).length;
        int _minus = (_length - 1);
        double _multiply = (_random * _minus);
        this.alg.$(p_1).getTokens().remove(((int) _multiply));
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
}
