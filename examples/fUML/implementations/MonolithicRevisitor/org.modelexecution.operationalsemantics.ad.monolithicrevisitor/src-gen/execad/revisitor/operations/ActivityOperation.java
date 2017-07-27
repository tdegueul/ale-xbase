package execad.revisitor.operations;

import activitydiagram.ActivityNode;
import activitydiagram.InitialNode;
import activitydiagram.InputValue;
import java.util.List;

@SuppressWarnings("all")
public interface ActivityOperation {
  public abstract void main(final List<InputValue> inputValues);
  
  public abstract void initialize(final List<InputValue> inputValues);
  
  public abstract void run();
  
  public abstract List<ActivityNode> getEnabledNodes();
  
  public abstract void fireNode(final ActivityNode node);
  
  public abstract void fireInitialNode();
  
  public abstract InitialNode getInitialNode();
  
  public abstract void terminate();
}
