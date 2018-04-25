package activitydiagram_exec.revisitor.operations.impl;

import activitydiagram.Activity;
import activitydiagram.ActivityNode;
import activitydiagram.BooleanValue;
import activitydiagram.InitialNode;
import activitydiagram.InputValue;
import activitydiagram.IntegerValue;
import activitydiagram.Value;
import activitydiagram.Variable;
import activitydiagram_exec.revisitor.operations.ActionOperation;
import activitydiagram_exec.revisitor.operations.ActivityEdgeOperation;
import activitydiagram_exec.revisitor.operations.ActivityFinalNodeOperation;
import activitydiagram_exec.revisitor.operations.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.ActivityOperation;
import activitydiagram_exec.revisitor.operations.BooleanBinaryExpressionOperation;
import activitydiagram_exec.revisitor.operations.BooleanExpressionOperation;
import activitydiagram_exec.revisitor.operations.BooleanUnaryExpressionOperation;
import activitydiagram_exec.revisitor.operations.BooleanValueOperation;
import activitydiagram_exec.revisitor.operations.BooleanVariableOperation;
import activitydiagram_exec.revisitor.operations.ContextOperation;
import activitydiagram_exec.revisitor.operations.ControlFlowOperation;
import activitydiagram_exec.revisitor.operations.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.ControlTokenOperation;
import activitydiagram_exec.revisitor.operations.DecisionNodeOperation;
import activitydiagram_exec.revisitor.operations.ExecutableNodeOperation;
import activitydiagram_exec.revisitor.operations.ExpressionOperation;
import activitydiagram_exec.revisitor.operations.FinalNodeOperation;
import activitydiagram_exec.revisitor.operations.ForkNodeOperation;
import activitydiagram_exec.revisitor.operations.ForkedTokenOperation;
import activitydiagram_exec.revisitor.operations.InitialNodeOperation;
import activitydiagram_exec.revisitor.operations.InputOperation;
import activitydiagram_exec.revisitor.operations.InputValueOperation;
import activitydiagram_exec.revisitor.operations.IntegerCalculationExpressionOperation;
import activitydiagram_exec.revisitor.operations.IntegerComparisonExpressionOperation;
import activitydiagram_exec.revisitor.operations.IntegerExpressionOperation;
import activitydiagram_exec.revisitor.operations.IntegerValueOperation;
import activitydiagram_exec.revisitor.operations.IntegerVariableOperation;
import activitydiagram_exec.revisitor.operations.JoinNodeOperation;
import activitydiagram_exec.revisitor.operations.MergeNodeOperation;
import activitydiagram_exec.revisitor.operations.NamedElementOperation;
import activitydiagram_exec.revisitor.operations.OfferOperation;
import activitydiagram_exec.revisitor.operations.OpaqueActionOperation;
import activitydiagram_exec.revisitor.operations.TokenOperation;
import activitydiagram_exec.revisitor.operations.TraceOperation;
import activitydiagram_exec.revisitor.operations.ValueOperation;
import activitydiagram_exec.revisitor.operations.VariableOperation;
import activitydiagram_exec.revisitor.operations.impl.NamedElementOperationImpl;
import activitydiagramruntime.ActivitydiagramruntimeFactory;
import activitydiagramruntime.Context;
import activitydiagramruntime.Trace;
import activitydiagramruntime.revisitor.ActivitydiagramruntimeRevisitor;
import com.google.common.collect.Iterables;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ActivityOperationImpl extends NamedElementOperationImpl implements ActivityOperation {
  private Activity obj;
  
  private ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg;
  
  public ActivityOperationImpl(final Activity obj, final ActivitydiagramruntimeRevisitor<ActionOperation, ActivityOperation, ActivityEdgeOperation, ActivityFinalNodeOperation, ActivityNodeOperation, BooleanBinaryExpressionOperation, BooleanExpressionOperation, BooleanUnaryExpressionOperation, BooleanValueOperation, BooleanVariableOperation, ContextOperation, ControlFlowOperation, ControlNodeOperation, ControlTokenOperation, DecisionNodeOperation, ExecutableNodeOperation, ExpressionOperation, FinalNodeOperation, ForkNodeOperation, ForkedTokenOperation, InitialNodeOperation, InputOperation, InputValueOperation, IntegerCalculationExpressionOperation, IntegerComparisonExpressionOperation, IntegerExpressionOperation, IntegerValueOperation, IntegerVariableOperation, JoinNodeOperation, MergeNodeOperation, NamedElementOperation, OfferOperation, OpaqueActionOperation, TokenOperation, TraceOperation, ValueOperation, VariableOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public Trace trace() {
    return IterableExtensions.<Trace>head(Iterables.<Trace>filter(this.obj.eCrossReferences(), Trace.class));
  }
  
  @Override
  public void main(final List<InputValue> value) {
    Context c = ActivitydiagramruntimeFactory.eINSTANCE.createContext();
    EList<InputValue> _inputValues = c.getInputValues();
    Iterables.<InputValue>addAll(_inputValues, value);
    c.setActivity(this.obj);
    final Trace trace = ActivitydiagramruntimeFactory.eINSTANCE.createTrace();
    c.setOutput(trace);
    if (value!=null) {
      final Consumer<InputValue> _function = (InputValue v) -> {
        v.getVariable().setCurrentValue(v.getValue());
      };
      value.forEach(_function);
    }
    final Consumer<ActivityNode> _function_1 = (ActivityNode n) -> {
      n.setRunning(true);
    };
    this.obj.getNodes().forEach(_function_1);
    this.alg.$(this.obj).execute(c);
  }
  
  @Override
  public void execute(final Context c) {
    final Consumer<Variable> _function = (Variable v) -> {
      this.alg.$(v).init(c);
    };
    this.obj.getLocals().forEach(_function);
    final Function1<ActivityNode, Boolean> _function_1 = (ActivityNode node) -> {
      return Boolean.valueOf((node instanceof InitialNode));
    };
    this.alg.$(((ActivityNode[])Conversions.unwrapArray(IterableExtensions.<ActivityNode>filter(this.obj.getNodes(), _function_1), ActivityNode.class))[0]).execute(c);
    final Function1<ActivityNode, Boolean> _function_2 = (ActivityNode node) -> {
      return Boolean.valueOf(this.alg.$(node).hasOffers());
    };
    Iterable<ActivityNode> list = IterableExtensions.<ActivityNode>filter(this.obj.getNodes(), _function_2);
    while (((list != null) && (IterableExtensions.size(list) > 0))) {
      {
        final Iterable<ActivityNode> _converted_list = (Iterable<ActivityNode>)list;
        this.alg.$(((ActivityNode[])Conversions.unwrapArray(_converted_list, ActivityNode.class))[0]).execute(c);
        final Function1<ActivityNode, Boolean> _function_3 = (ActivityNode node) -> {
          return Boolean.valueOf(this.alg.$(node).hasOffers());
        };
        list = IterableExtensions.<ActivityNode>filter(this.obj.getNodes(), _function_3);
      }
    }
  }
  
  @Override
  public void reset(final Context c) {
    c.setOutput(null);
  }
  
  @Override
  public void writeToFile(final Context c) {
    String text = this.alg.$(this.obj).printTrace(c);
    try {
      String _name = this.obj.getName();
      String _plus = ("trace/" + _name);
      String _plus_1 = (_plus + ".txt");
      File _file = new File(_plus_1);
      FileOutputStream _fileOutputStream = new FileOutputStream(_file);
      OutputStreamWriter _outputStreamWriter = new OutputStreamWriter(_fileOutputStream);
      BufferedWriter writer = new BufferedWriter(_outputStreamWriter);
      writer.write(text);
      writer.close();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Override
  public String printTrace(final Context c) {
    final StringBuffer text = new StringBuffer();
    final Consumer<ActivityNode> _function = (ActivityNode n) -> {
      text.append(n.getName());
      text.append(System.getProperty("line.separator"));
    };
    c.getOutput().getExecutedNodes().forEach(_function);
    final Consumer<Variable> _function_1 = (Variable v) -> {
      text.append(this.alg.$(v).print());
      text.append(System.getProperty("line.separator"));
    };
    this.obj.getLocals().forEach(_function_1);
    return text.toString();
  }
  
  @Override
  public int getIntegerVariableValue(final String variableName) {
    Value currentValue = this.alg.$(this.obj).getVariableValue(variableName);
    if ((currentValue instanceof IntegerValue)) {
      return ((IntegerValue)currentValue).getValue();
    }
    return (-1);
  }
  
  @Override
  public boolean getBooleanVariableValue(final String variableName) {
    Value currentValue = this.alg.$(this.obj).getVariableValue(variableName);
    if ((currentValue instanceof BooleanValue)) {
      return ((BooleanValue)currentValue).isValue();
    }
    return false;
  }
  
  @Override
  public Value getVariableValue(final String variableName) {
    Variable variable = this.alg.$(this.obj).getVariable(variableName);
    Value currentValue = variable.getCurrentValue();
    return currentValue;
  }
  
  @Override
  public Variable getVariable(final String variableName) {
    ArrayList<Variable> allVariables = CollectionLiterals.<Variable>newArrayList();
    allVariables.addAll(this.obj.getLocals());
    allVariables.addAll(this.obj.getInputs());
    for (final Variable var1 : allVariables) {
      boolean _equals = var1.getName().equals(variableName);
      if (_equals) {
        return var1;
      }
    }
    return null;
  }
  
  @Override
  public void writeTrace(final Context c) {
    this.alg.$(this.obj).writeToFile(c);
    this.alg.$(this.obj).reset(c);
  }
}
