package guardedfsmprinting.revisitor.operations.guardedfsmprinting;

import printexp.revisitor.operations.printexp.ExpOperation;
import printexp.revisitor.operations.printexp.LitOperation;

@SuppressWarnings("all")
public interface TruOperation extends printexp.revisitor.operations.printexp.TruOperation, LitOperation, guardedfsmprinting.revisitor.operations.guardedfsmprinting.LitOperation, ExpOperation, guardedfsmprinting.revisitor.operations.guardedfsmprinting.ExpOperation {
}
