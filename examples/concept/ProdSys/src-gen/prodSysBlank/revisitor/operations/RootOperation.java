package prodSysBlank.revisitor.operations;

import java.util.List;
import prodSys.Conveyor;
import prodSys.Machine;

@SuppressWarnings("all")
public interface RootOperation {
  public abstract List<Machine> getMachine();
  
  public abstract List<Conveyor> getConveyor();
}
