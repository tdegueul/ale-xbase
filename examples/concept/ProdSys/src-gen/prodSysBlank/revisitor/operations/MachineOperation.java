package prodSysBlank.revisitor.operations;

import java.util.List;
import prodSys.Conveyor;
import prodSys.Part;

@SuppressWarnings("all")
public interface MachineOperation {
  public abstract String getRef();
  
  public abstract void setRef(final String value);
  
  public abstract String getType();
  
  public abstract void setType(final String value);
  
  public abstract List<Conveyor> getInC();
  
  public abstract List<Conveyor> getOutC();
  
  public abstract Part createToken();
}
