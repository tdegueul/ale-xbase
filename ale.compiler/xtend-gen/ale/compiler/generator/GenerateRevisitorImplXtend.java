package ale.compiler.generator;

import ale.xtext.ale.Root;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GenerateRevisitorImplXtend {
  public String generate(final Root root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = root.getName();
    _builder.append(_name, "");
    _builder.append(".algebra.impl;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
}
