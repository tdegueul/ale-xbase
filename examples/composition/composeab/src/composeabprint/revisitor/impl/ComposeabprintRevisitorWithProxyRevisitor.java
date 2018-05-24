package composeabprint.revisitor.impl;

import java.lang.reflect.Method;

import composeabprint.revisitor.ComposeabprintRevisitorWithProxy;
import printsimplea.revisitor.operations.printsimplea.AOperation;
import printsimplea.revisitor.operations.printsimplea.BOperation;
import printsimplea.revisitor.operations.printsimplea.impl.AOperationImpl;
import printsimpleb.revisitor.operations.printsimpleb.B1Operation;
import printsimpleb.revisitor.operations.printsimpleb.impl.B1OperationImpl;
import simplea.A;
import simplea.B;
import simpleb.B1;

public interface ComposeabprintRevisitorWithProxyRevisitor
		extends ComposeabprintRevisitorWithProxy<AOperation, BOperation, B1Operation> {
	default B1OperationImpl simpleb__B1(B1 it) {
		return new B1OperationImpl(it, this);
	}

	default AOperationImpl simplea__A(A it) {
		return new AOperationImpl(it, this);
	}

	default BOperation $(B it) {
		
		
		/// reflect
		B1 b1 = null; //it.callByName("$$$$");
		return new BOperation() {

			@Override
			public void callWithArg(String value) {
				$(b1).receiverWithParam(value);
				
			}

			@Override
			public void call() {
				// TODO Auto-generated method stub

			}
		};
	}
}
