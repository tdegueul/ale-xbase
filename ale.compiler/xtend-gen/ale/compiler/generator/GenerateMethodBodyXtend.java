package ale.compiler.generator;

import ale.compiler.generator.Graph;
import ale.compiler.generator.GraphUtil;
import ale.compiler.generator.TypeUtil;
import ale.xtext.ale.AddOperation;
import ale.xtext.ale.AleClass;
import ale.xtext.ale.Block;
import ale.xtext.ale.BooleanAndOperation;
import ale.xtext.ale.BooleanLiteral;
import ale.xtext.ale.BooleanOrOperation;
import ale.xtext.ale.BooleanXorOperation;
import ale.xtext.ale.ChainedCall;
import ale.xtext.ale.ChainedCallArrow;
import ale.xtext.ale.CompareGEOperation;
import ale.xtext.ale.CompareGOperation;
import ale.xtext.ale.CompareLEOperation;
import ale.xtext.ale.CompareLOperation;
import ale.xtext.ale.CompareNEOperation;
import ale.xtext.ale.ConstructorOperation;
import ale.xtext.ale.DebugStatement;
import ale.xtext.ale.DivOperation;
import ale.xtext.ale.EqualityOperation;
import ale.xtext.ale.Expression;
import ale.xtext.ale.ForLoop;
import ale.xtext.ale.IfStatement;
import ale.xtext.ale.ImpliesOperation;
import ale.xtext.ale.IntLiteral;
import ale.xtext.ale.IntRange;
import ale.xtext.ale.LetStatement;
import ale.xtext.ale.Method;
import ale.xtext.ale.MultOperation;
import ale.xtext.ale.NegInfixOperation;
import ale.xtext.ale.NewSequence;
import ale.xtext.ale.NotInfixOperation;
import ale.xtext.ale.NullLiteral;
import ale.xtext.ale.OADenot;
import ale.xtext.ale.OperationCallOperation;
import ale.xtext.ale.OrderedSetDecl;
import ale.xtext.ale.ParamCall;
import ale.xtext.ale.RealLiteral;
import ale.xtext.ale.ReturnStatement;
import ale.xtext.ale.Root;
import ale.xtext.ale.SelfRef;
import ale.xtext.ale.SequenceDecl;
import ale.xtext.ale.Statement;
import ale.xtext.ale.StringLiteral;
import ale.xtext.ale.SubOperation;
import ale.xtext.ale.SuperRef;
import ale.xtext.ale.Type;
import ale.xtext.ale.VarAssign;
import ale.xtext.ale.VarDeclaration;
import ale.xtext.ale.VarRef;
import ale.xtext.ale.WhileStatement;
import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateMethodBodyXtend {
  @Extension
  private TypeUtil typeUtil;
  
  @Extension
  private GraphUtil graphUtil;
  
  private List<EPackage> ePackages;
  
  private Root root;
  
  private AleClass aleClass;
  
  public GenerateMethodBodyXtend(final ResourceSet resSet) {
    TypeUtil _typeUtil = new TypeUtil(resSet);
    this.typeUtil = _typeUtil;
    GraphUtil _graphUtil = new GraphUtil(resSet);
    this.graphUtil = _graphUtil;
  }
  
  public String generate(final AleClass aleClass, final Method method, final List<EPackage> ePackages, final Root root) {
    this.aleClass = aleClass;
    this.ePackages = ePackages;
    this.root = root;
    Block _block = method.getBlock();
    return this.printBlock(_block);
  }
  
  private String printBlock(final Block block) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Statement> _body = null;
      if (block!=null) {
        _body=block.getBody();
      }
      for(final Statement stmt : _body) {
        String _printStatement = this.printStatement(stmt);
        _builder.append(_printStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected String _printStatement(final Expression expression) {
    StringConcatenation _builder = new StringConcatenation();
    String _printExpression = this.printExpression(expression);
    _builder.append(_printExpression, "");
    _builder.append(";");
    return _builder.toString();
  }
  
  protected String _printStatement(final ForLoop forLoop) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for (");
    Type _type = forLoop.getType();
    String _solveStaticType = this.typeUtil.solveStaticType(_type, this.ePackages);
    _builder.append(_solveStaticType, "");
    _builder.append(" ");
    String _name = forLoop.getName();
    _builder.append(_name, "");
    _builder.append(": ");
    Expression _collection = forLoop.getCollection();
    String _printExpression = this.printExpression(_collection);
    _builder.append(_printExpression, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Block _block = forLoop.getBlock();
    String _printBlock = this.printBlock(_block);
    _builder.append(_printBlock, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _printStatement(final IfStatement ifStatement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (");
    Expression _condition = ifStatement.getCondition();
    String _printExpression = this.printExpression(_condition);
    _builder.append(_printExpression, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Block _thenBranch = ifStatement.getThenBranch();
    String _printBlock = this.printBlock(_thenBranch);
    _builder.append(_printBlock, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("} ");
    {
      Block _elseBranch = ifStatement.getElseBranch();
      boolean _tripleNotEquals = (_elseBranch != null);
      if (_tripleNotEquals) {
        _builder.append(" else {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        Block _elseBranch_1 = ifStatement.getElseBranch();
        String _printBlock_1 = this.printBlock(_elseBranch_1);
        _builder.append(_printBlock_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("} ");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _printStatement(final LetStatement letStatement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("__TODO__");
    return _builder.toString();
  }
  
  protected String _printStatement(final ReturnStatement returnStatement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("return ");
    Expression _returned = returnStatement.getReturned();
    String _printExpression = this.printExpression(_returned);
    _builder.append(_printExpression, "");
    _builder.append(";");
    return _builder.toString();
  }
  
  protected String _printStatement(final VarDeclaration varAssign) {
    StringConcatenation _builder = new StringConcatenation();
    Type _type = varAssign.getType();
    String _solveStaticType = this.typeUtil.solveStaticType(_type, this.ePackages);
    _builder.append(_solveStaticType, "");
    _builder.append(" ");
    String _name = varAssign.getName();
    _builder.append(_name, "");
    _builder.append(" = ");
    Expression _value = varAssign.getValue();
    String _printExpression = this.printExpression(_value);
    _builder.append(_printExpression, "");
    _builder.append(";");
    return _builder.toString();
  }
  
  protected String _printStatement(final VarAssign varAssign) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = varAssign.getName();
    _builder.append(_name, "");
    _builder.append(" = ");
    Expression _value = varAssign.getValue();
    String _printExpression = this.printExpression(_value);
    _builder.append(_printExpression, "");
    _builder.append(";");
    return _builder.toString();
  }
  
  protected String _printStatement(final WhileStatement whileStatement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("while (");
    Expression _condition = whileStatement.getCondition();
    String _printExpression = this.printExpression(_condition);
    _builder.append(_printExpression, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Block _whileBlock = whileStatement.getWhileBlock();
    String _printBlock = this.printBlock(_whileBlock);
    _builder.append(_printBlock, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _printStatement(final DebugStatement debugStmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(");
    Expression _expr = debugStmt.getExpr();
    String _printExpression = this.printExpression(_expr);
    _builder.append(_printExpression, "");
    _builder.append(");");
    return _builder.toString();
  }
  
  protected String _printExpression(final AddOperation addOperation) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = addOperation.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(" + ");
    Expression _right = addOperation.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final BooleanAndOperation booleanAndOperation) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = booleanAndOperation.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(" && ");
    Expression _right = booleanAndOperation.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final BooleanLiteral booleanLit) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = booleanLit.getValue();
    _builder.append(_value, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final BooleanOrOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = exp.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(" || ");
    Expression _right = exp.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final BooleanXorOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = exp.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(" ^ ");
    Expression _right = exp.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final ChainedCall exp) {
    if ((((exp.getLeft() instanceof OADenot) && (((OADenot) exp.getLeft()).getExp() instanceof SuperRef)) && (exp.getRight() instanceof OperationCallOperation))) {
      Expression _right = exp.getRight();
      final OperationCallOperation oco = ((OperationCallOperation) _right);
      List<Method> _methodsRec = this.graphUtil.methodsRec(this.aleClass, false);
      final Function1<Method, Boolean> _function = (Method it) -> {
        return Boolean.valueOf((Objects.equal(oco.getName(), it.getName()) && (oco.getParameters().size() == it.getParams().size())));
      };
      Iterable<Method> _filter = IterableExtensions.<Method>filter(_methodsRec, _function);
      final Method method = IterableExtensions.<Method>head(_filter);
      EObject _rootContainer = EcoreUtil.getRootContainer(method);
      final Root localRoot = ((Root) _rootContainer);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("this.");
      String _name = localRoot.getName();
      _builder.append(_name, "");
      _builder.append("delegate.");
      Expression _right_1 = exp.getRight();
      String _printExpression = this.printExpression(_right_1);
      _builder.append(_printExpression, "");
      return _builder.toString();
    } else {
      if (((exp.getLeft() instanceof SuperRef) && (exp.getRight() instanceof OperationCallOperation))) {
        Expression _right_2 = exp.getRight();
        final OperationCallOperation oco_1 = ((OperationCallOperation) _right_2);
        List<Method> _methodsRec_1 = this.graphUtil.methodsRec(this.aleClass, false);
        final Function1<Method, Boolean> _function_1 = (Method it) -> {
          return Boolean.valueOf((Objects.equal(oco_1.getName(), it.getName()) && (oco_1.getParameters().size() == it.getParams().size())));
        };
        Iterable<Method> _filter_1 = IterableExtensions.<Method>filter(_methodsRec_1, _function_1);
        final Method method_1 = IterableExtensions.<Method>head(_filter_1);
        if ((method_1 == null)) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("No method ");
          String _name_1 = oco_1.getName();
          _builder_1.append(_name_1, "");
          _builder_1.append(" with ");
          EList<ParamCall> _parameters = oco_1.getParameters();
          int _size = _parameters.size();
          _builder_1.append(_size, "");
          _builder_1.append(" parameters for class ");
          String _name_2 = this.aleClass.getName();
          _builder_1.append(_name_2, "");
          InputOutput.<String>println(_builder_1.toString());
        }
        EObject _rootContainer_1 = EcoreUtil.getRootContainer(method_1);
        final Root localRoot_1 = ((Root) _rootContainer_1);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("this.");
        String _name_3 = localRoot_1.getName();
        _builder_2.append(_name_3, "");
        _builder_2.append("delegate.");
        Expression _right_3 = exp.getRight();
        String _printExpression_1 = this.printExpression(_right_3);
        _builder_2.append(_printExpression_1, "");
        return _builder_2.toString();
      } else {
        StringConcatenation _builder_3 = new StringConcatenation();
        Expression _left = exp.getLeft();
        String _printExpression_2 = this.printExpression(_left);
        _builder_3.append(_printExpression_2, "");
        _builder_3.append(".");
        Expression _right_4 = exp.getRight();
        String _printExpression_3 = this.printExpression(_right_4);
        _builder_3.append(_printExpression_3, "");
        return _builder_3.toString();
      }
    }
  }
  
  protected String _printExpression(final ChainedCallArrow exp) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = exp.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(".");
    Expression _right = exp.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final CompareGEOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = exp.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(" >= ");
    Expression _right = exp.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final CompareGOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = exp.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(" > ");
    Expression _right = exp.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final CompareLEOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = exp.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(" <= ");
    Expression _right = exp.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final CompareLOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = exp.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(" < ");
    Expression _right = exp.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final CompareNEOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = exp.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(" != ");
    Expression _right = exp.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final DivOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = exp.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(" / ");
    Expression _right = exp.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final EqualityOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java.util.Objects.equals(");
    Expression _left = exp.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(", ");
    Expression _right = exp.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _printExpression(final ImpliesOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("!");
    Expression _left = exp.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(" || ");
    Expression _right = exp.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final IntLiteral exp) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = exp.getValue();
    _builder.append(_value, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final IntRange exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("__TODO IntRange__");
    return _builder.toString();
  }
  
  protected String _printExpression(final MultOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = exp.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(" * ");
    Expression _right = exp.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final NegInfixOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-");
    Expression _expression = exp.getExpression();
    String _printExpression = this.printExpression(_expression);
    _builder.append(_printExpression, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final NotInfixOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("!");
    Expression _expression = exp.getExpression();
    String _printExpression = this.printExpression(_expression);
    _builder.append(_printExpression, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final NullLiteral exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("null");
    return _builder.toString();
  }
  
  protected String _printExpression(final OperationCallOperation exp) {
    EObject _eContainer = exp.eContainer();
    if ((_eContainer instanceof ChainedCallArrow)) {
      String _switchResult = null;
      String _name = exp.getName();
      switch (_name) {
        case "select":
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("stream().filter(");
          EList<ParamCall> _parameters = exp.getParameters();
          ParamCall _head = IterableExtensions.<ParamCall>head(_parameters);
          String _lambda = _head.getLambda();
          _builder.append(_lambda, "");
          _builder.append(" -> ");
          EList<ParamCall> _parameters_1 = exp.getParameters();
          ParamCall _head_1 = IterableExtensions.<ParamCall>head(_parameters_1);
          Expression _expression = _head_1.getExpression();
          String _printExpression = this.printExpression(_expression);
          _builder.append(_printExpression, "");
          _builder.append(").collect(new EListCollector<>())");
          _switchResult = _builder.toString();
          break;
        case "reject":
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("stream().filter(");
          EList<ParamCall> _parameters_2 = exp.getParameters();
          ParamCall _head_2 = IterableExtensions.<ParamCall>head(_parameters_2);
          String _lambda_1 = _head_2.getLambda();
          _builder_1.append(_lambda_1, "");
          _builder_1.append(" -> !(");
          EList<ParamCall> _parameters_3 = exp.getParameters();
          ParamCall _head_3 = IterableExtensions.<ParamCall>head(_parameters_3);
          Expression _expression_1 = _head_3.getExpression();
          String _printExpression_1 = this.printExpression(_expression_1);
          _builder_1.append(_printExpression_1, "");
          _builder_1.append(")).collect(new EListCollector<>())");
          _switchResult = _builder_1.toString();
          break;
        case "collect":
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("stream().map(");
          EList<ParamCall> _parameters_4 = exp.getParameters();
          ParamCall _head_4 = IterableExtensions.<ParamCall>head(_parameters_4);
          String _lambda_2 = _head_4.getLambda();
          _builder_2.append(_lambda_2, "");
          _builder_2.append(" -> ");
          EList<ParamCall> _parameters_5 = exp.getParameters();
          ParamCall _head_5 = IterableExtensions.<ParamCall>head(_parameters_5);
          Expression _expression_2 = _head_5.getExpression();
          String _printExpression_2 = this.printExpression(_expression_2);
          _builder_2.append(_printExpression_2, "");
          _builder_2.append(").collect(new EListCollector<>())");
          _switchResult = _builder_2.toString();
          break;
        case "any":
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("stream().filter(");
          EList<ParamCall> _parameters_6 = exp.getParameters();
          ParamCall _head_6 = IterableExtensions.<ParamCall>head(_parameters_6);
          String _lambda_3 = _head_6.getLambda();
          _builder_3.append(_lambda_3, "");
          _builder_3.append(" -> ");
          EList<ParamCall> _parameters_7 = exp.getParameters();
          ParamCall _head_7 = IterableExtensions.<ParamCall>head(_parameters_7);
          Expression _expression_3 = _head_7.getExpression();
          String _printExpression_3 = this.printExpression(_expression_3);
          _builder_3.append(_printExpression_3, "");
          _builder_3.append(").findAny().orElse(null)");
          _switchResult = _builder_3.toString();
          break;
        case "exists":
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("stream().stream().findAny().map(");
          EList<ParamCall> _parameters_8 = exp.getParameters();
          ParamCall _head_8 = IterableExtensions.<ParamCall>head(_parameters_8);
          String _lambda_4 = _head_8.getLambda();
          _builder_4.append(_lambda_4, "");
          _builder_4.append(" -> ");
          EList<ParamCall> _parameters_9 = exp.getParameters();
          ParamCall _head_9 = IterableExtensions.<ParamCall>head(_parameters_9);
          Expression _expression_4 = _head_9.getExpression();
          String _printExpression_4 = this.printExpression(_expression_4);
          _builder_4.append(_printExpression_4, "");
          _builder_4.append(").orElse(false)");
          _switchResult = _builder_4.toString();
          break;
        case "forAll":
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("stream().stream().allMatch(");
          EList<ParamCall> _parameters_10 = exp.getParameters();
          ParamCall _head_10 = IterableExtensions.<ParamCall>head(_parameters_10);
          String _lambda_5 = _head_10.getLambda();
          _builder_5.append(_lambda_5, "");
          _builder_5.append(" -> ");
          EList<ParamCall> _parameters_11 = exp.getParameters();
          ParamCall _head_11 = IterableExtensions.<ParamCall>head(_parameters_11);
          Expression _expression_5 = _head_11.getExpression();
          String _printExpression_5 = this.printExpression(_expression_5);
          _builder_5.append(_printExpression_5, "");
          _builder_5.append(")");
          _switchResult = _builder_5.toString();
          break;
        case "isUnique":
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("__TODO__");
          _switchResult = _builder_6.toString();
          break;
        case "one":
          StringConcatenation _builder_7 = new StringConcatenation();
          _builder_7.append("__TODO__");
          _switchResult = _builder_7.toString();
          break;
        case "sortedBy":
          StringConcatenation _builder_8 = new StringConcatenation();
          _builder_8.append("__TODO__");
          _switchResult = _builder_8.toString();
          break;
        case "closure":
          StringConcatenation _builder_9 = new StringConcatenation();
          _builder_9.append("__TODO__");
          _switchResult = _builder_9.toString();
          break;
      }
      return _switchResult;
    } else {
      String _name_1 = exp.getName();
      boolean _equals = Objects.equal(_name_1, "println");
      if (_equals) {
        exp.setName("System.out.println");
      }
      StringConcatenation _builder_10 = new StringConcatenation();
      String _name_2 = exp.getName();
      _builder_10.append(_name_2, "");
      _builder_10.append("(");
      {
        EList<ParamCall> _parameters_12 = exp.getParameters();
        boolean _hasElements = false;
        for(final ParamCall param : _parameters_12) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder_10.appendImmediate(",", "");
          }
          {
            String _lambda_6 = param.getLambda();
            boolean _tripleNotEquals = (_lambda_6 != null);
            if (_tripleNotEquals) {
              String _lambda_7 = param.getLambda();
              _builder_10.append(_lambda_7, "");
              _builder_10.append(" -> ");
            }
          }
          Expression _expression_6 = param.getExpression();
          String _printExpression_6 = this.printExpression(_expression_6);
          _builder_10.append(_printExpression_6, "");
        }
      }
      _builder_10.append(")");
      return _builder_10.toString();
    }
  }
  
  protected String _printExpression(final OrderedSetDecl exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("__TODO OrderSetDecl__");
    return _builder.toString();
  }
  
  protected String _printExpression(final RealLiteral exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = exp.getValue();
    _builder.append(_value, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final OADenot exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("alg.$(");
    Expression _exp = exp.getExp();
    String _printExpression = this.printExpression(_exp);
    _builder.append(_printExpression, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _printExpression(final SelfRef exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("self");
    return _builder.toString();
  }
  
  protected String _printExpression(final SequenceDecl exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("__TODO SequenceDECL__");
    return _builder.toString();
  }
  
  protected String _printExpression(final StringLiteral exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _value = exp.getValue();
    _builder.append(_value, "");
    _builder.append("\"");
    return _builder.toString();
  }
  
  protected String _printExpression(final SubOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = exp.getLeft();
    String _printExpression = this.printExpression(_left);
    _builder.append(_printExpression, "");
    _builder.append(" - ");
    Expression _right = exp.getRight();
    String _printExpression_1 = this.printExpression(_right);
    _builder.append(_printExpression_1, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final SuperRef exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("__TODO call super__");
    return _builder.toString();
  }
  
  protected String _printExpression(final VarRef exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = exp.getValue();
    _builder.append(_value, "");
    return _builder.toString();
  }
  
  protected String _printExpression(final NewSequence exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new org.eclipse.emf.common.util.BasicEList<>();");
    return _builder.toString();
  }
  
  protected String _printExpression(final ConstructorOperation exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _packageName = this.getPackageName(exp, this.ePackages);
    _builder.append(_packageName, "");
    _builder.append("Factory.eINSTANCE.create");
    String _name = exp.getName();
    _builder.append(_name, "");
    _builder.append("()");
    return _builder.toString();
  }
  
  public String getPackageName(final ConstructorOperation co, final List<EPackage> ePackages) {
    final Graph<EClass> graph = this.graphUtil.buildGraph(ePackages);
    final Function1<Graph.GraphNode, Boolean> _function = (Graph.GraphNode it) -> {
      String _name = it.elem.getName();
      String _name_1 = co.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    Iterable<Graph.GraphNode> _filter = IterableExtensions.<Graph.GraphNode>filter(graph.nodes, _function);
    Graph.GraphNode _head = IterableExtensions.<Graph.GraphNode>head(_filter);
    EPackage _ePackage = _head.elem.getEPackage();
    String packageName = _ePackage.getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(packageName, "");
    _builder.append(".");
    String _firstUpper = StringExtensions.toFirstUpper(packageName);
    _builder.append(_firstUpper, "");
    return _builder.toString();
  }
  
  public String printStatement(final Statement debugStmt) {
    if (debugStmt instanceof DebugStatement) {
      return _printStatement((DebugStatement)debugStmt);
    } else if (debugStmt instanceof Expression) {
      return _printStatement((Expression)debugStmt);
    } else if (debugStmt instanceof ForLoop) {
      return _printStatement((ForLoop)debugStmt);
    } else if (debugStmt instanceof IfStatement) {
      return _printStatement((IfStatement)debugStmt);
    } else if (debugStmt instanceof LetStatement) {
      return _printStatement((LetStatement)debugStmt);
    } else if (debugStmt instanceof ReturnStatement) {
      return _printStatement((ReturnStatement)debugStmt);
    } else if (debugStmt instanceof VarAssign) {
      return _printStatement((VarAssign)debugStmt);
    } else if (debugStmt instanceof VarDeclaration) {
      return _printStatement((VarDeclaration)debugStmt);
    } else if (debugStmt instanceof WhileStatement) {
      return _printStatement((WhileStatement)debugStmt);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(debugStmt).toString());
    }
  }
  
  public String printExpression(final Expression addOperation) {
    if (addOperation instanceof AddOperation) {
      return _printExpression((AddOperation)addOperation);
    } else if (addOperation instanceof BooleanAndOperation) {
      return _printExpression((BooleanAndOperation)addOperation);
    } else if (addOperation instanceof BooleanLiteral) {
      return _printExpression((BooleanLiteral)addOperation);
    } else if (addOperation instanceof BooleanOrOperation) {
      return _printExpression((BooleanOrOperation)addOperation);
    } else if (addOperation instanceof BooleanXorOperation) {
      return _printExpression((BooleanXorOperation)addOperation);
    } else if (addOperation instanceof ChainedCall) {
      return _printExpression((ChainedCall)addOperation);
    } else if (addOperation instanceof ChainedCallArrow) {
      return _printExpression((ChainedCallArrow)addOperation);
    } else if (addOperation instanceof CompareGEOperation) {
      return _printExpression((CompareGEOperation)addOperation);
    } else if (addOperation instanceof CompareGOperation) {
      return _printExpression((CompareGOperation)addOperation);
    } else if (addOperation instanceof CompareLEOperation) {
      return _printExpression((CompareLEOperation)addOperation);
    } else if (addOperation instanceof CompareLOperation) {
      return _printExpression((CompareLOperation)addOperation);
    } else if (addOperation instanceof CompareNEOperation) {
      return _printExpression((CompareNEOperation)addOperation);
    } else if (addOperation instanceof ConstructorOperation) {
      return _printExpression((ConstructorOperation)addOperation);
    } else if (addOperation instanceof DivOperation) {
      return _printExpression((DivOperation)addOperation);
    } else if (addOperation instanceof EqualityOperation) {
      return _printExpression((EqualityOperation)addOperation);
    } else if (addOperation instanceof ImpliesOperation) {
      return _printExpression((ImpliesOperation)addOperation);
    } else if (addOperation instanceof IntLiteral) {
      return _printExpression((IntLiteral)addOperation);
    } else if (addOperation instanceof IntRange) {
      return _printExpression((IntRange)addOperation);
    } else if (addOperation instanceof MultOperation) {
      return _printExpression((MultOperation)addOperation);
    } else if (addOperation instanceof NegInfixOperation) {
      return _printExpression((NegInfixOperation)addOperation);
    } else if (addOperation instanceof NewSequence) {
      return _printExpression((NewSequence)addOperation);
    } else if (addOperation instanceof NotInfixOperation) {
      return _printExpression((NotInfixOperation)addOperation);
    } else if (addOperation instanceof NullLiteral) {
      return _printExpression((NullLiteral)addOperation);
    } else if (addOperation instanceof OADenot) {
      return _printExpression((OADenot)addOperation);
    } else if (addOperation instanceof OperationCallOperation) {
      return _printExpression((OperationCallOperation)addOperation);
    } else if (addOperation instanceof OrderedSetDecl) {
      return _printExpression((OrderedSetDecl)addOperation);
    } else if (addOperation instanceof RealLiteral) {
      return _printExpression((RealLiteral)addOperation);
    } else if (addOperation instanceof SelfRef) {
      return _printExpression((SelfRef)addOperation);
    } else if (addOperation instanceof SequenceDecl) {
      return _printExpression((SequenceDecl)addOperation);
    } else if (addOperation instanceof StringLiteral) {
      return _printExpression((StringLiteral)addOperation);
    } else if (addOperation instanceof SubOperation) {
      return _printExpression((SubOperation)addOperation);
    } else if (addOperation instanceof SuperRef) {
      return _printExpression((SuperRef)addOperation);
    } else if (addOperation instanceof VarRef) {
      return _printExpression((VarRef)addOperation);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(addOperation).toString());
    }
  }
}
