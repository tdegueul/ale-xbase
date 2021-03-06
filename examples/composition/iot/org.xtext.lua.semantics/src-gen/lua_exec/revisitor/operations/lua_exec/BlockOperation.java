package lua_exec.revisitor.operations.lua_exec;

import lua_exec.revisitor.operations.lua_exec.ChunkOperation;
import org.xtext.lua.semantics.model.Environment;

@SuppressWarnings("all")
public interface BlockOperation extends ChunkOperation {
  public abstract void execute(final Environment c);
}
