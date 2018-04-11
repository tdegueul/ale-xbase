package prodSysBlank.revisitor.operations;

import java.util.List;
import prodSys.Part;

@SuppressWarnings("all")
public interface ConveyorOperation {
  public abstract List<Part> parts();
}
