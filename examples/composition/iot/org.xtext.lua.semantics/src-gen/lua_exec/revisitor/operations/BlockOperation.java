package lua_exec.revisitor.operations;

import lua_exec.revisitor.operations.ChunkOperation;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface BlockOperation extends ChunkOperation {
  public abstract void execute(final Environment c);
}
