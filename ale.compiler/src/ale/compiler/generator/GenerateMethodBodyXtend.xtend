package ale.compiler.generator

import ale.xtext.ale.AddOperation
import ale.xtext.ale.Block
import ale.xtext.ale.BooleanAndOperation
import ale.xtext.ale.BooleanLiteral
import ale.xtext.ale.BooleanOrOperation
import ale.xtext.ale.BooleanXorOperation
import ale.xtext.ale.CasttoOperation
import ale.xtext.ale.ChainedCall
import ale.xtext.ale.ChainedCallArrow
import ale.xtext.ale.CompareGEOperation
import ale.xtext.ale.CompareGOperation
import ale.xtext.ale.CompareLEOperation
import ale.xtext.ale.CompareLOperation
import ale.xtext.ale.CompareNEOperation
import ale.xtext.ale.ConstructorOperation
import ale.xtext.ale.DebugStatement
import ale.xtext.ale.DivOperation
import ale.xtext.ale.EqualityOperation
import ale.xtext.ale.Expression
import ale.xtext.ale.ForLoop
import ale.xtext.ale.IfStatement
import ale.xtext.ale.ImpliesOperation
import ale.xtext.ale.InstanceofOperation
import ale.xtext.ale.IntLiteral
import ale.xtext.ale.IntRange
import ale.xtext.ale.LetStatement
import ale.xtext.ale.Method
import ale.xtext.ale.MultOperation
import ale.xtext.ale.NegInfixOperation
import ale.xtext.ale.NewSequence
import ale.xtext.ale.NotInfixOperation
import ale.xtext.ale.NullLiteral
import ale.xtext.ale.OADenot
import ale.xtext.ale.OperationCallOperation
import ale.xtext.ale.OrderedSetDecl
import ale.xtext.ale.RealLiteral
import ale.xtext.ale.ReturnStatement
import ale.xtext.ale.SelfRef
import ale.xtext.ale.SequenceDecl
import ale.xtext.ale.StringLiteral
import ale.xtext.ale.SubOperation
import ale.xtext.ale.SuperRef
import ale.xtext.ale.VarAssign
import ale.xtext.ale.VarDeclaration
import ale.xtext.ale.VarRef
import ale.xtext.ale.WhileStatement
import java.util.List
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet
import ale.xtext.ale.Root
import ale.xtext.ale.AleClass
import org.eclipse.emf.ecore.util.EcoreUtil

class GenerateMethodBodyXtend {
	
	extension TypeUtil typeUtil
	extension GraphUtil graphUtil
	private var List<EPackage> ePackages
	private var Root root
	private var AleClass aleClass

	new(ResourceSet resSet) {
		this.typeUtil = new TypeUtil(resSet)
		this.graphUtil = new GraphUtil(resSet)
	}
	
	public def String generate(AleClass aleClass, Method method, List<EPackage> ePackages, Root root) {
		this.aleClass = aleClass
		this.ePackages = ePackages;
		this.root = root;
		method.block.printBlock
	}
	
	private def String printBlock(Block block)
		'''
		«IF block != null»
		«FOR stmt: block.body»
		«stmt.printStatement»
		«ENDFOR»
		«ENDIF»
		'''
		
	def dispatch String printStatement(Expression expression) '''«expression.printExpression»;'''
	
	def dispatch String printStatement(ForLoop forLoop) {
		'''
		for(«forLoop.type.solveStaticType(ePackages)» «forLoop.name»: «forLoop.collection.printExpression») {
			«forLoop.block.printBlock»
		}
		'''
	}
	
	def dispatch String printStatement(IfStatement ifStatement) {
		'''if(«ifStatement.condition.printExpression») {
			«ifStatement.thenBranch.printBlock»
		} «IF ifStatement.elseBranch != null» else {
			«ifStatement.elseBranch.printBlock»
		}
		«ENDIF»'''
	}
	
	def dispatch String printStatement(LetStatement letStatement) {
		'''__TODO__'''
	}
	
	def dispatch String printStatement(ReturnStatement returnStatement) {
		'''return «returnStatement.returned.printExpression»;'''
	}
	
	def dispatch String printStatement(VarDeclaration varAssign) {
		'''«varAssign.type.solveStaticType(ePackages)» «varAssign.name» = «varAssign.value.printExpression»;'''
	}
		
	def dispatch String printStatement(VarAssign varAssign) 
		'''«varAssign.name» = «varAssign.value.printExpression»;'''
	
	
	def dispatch String printStatement(WhileStatement whileStatement) {
		'''
		while(«whileStatement.condition.printExpression») {
			«whileStatement.whileBlock.printBlock»
		}
		'''
	}
	
	def dispatch String printStatement(DebugStatement debugStmt) {
		'''
		System.out.println(«debugStmt.expr.printExpression»);
		'''
	}
	
	
	def dispatch String printExpression(AddOperation addOperation) {
		'''«addOperation.left.printExpression» + «addOperation.right.printExpression»'''
	}
	
	def dispatch String printExpression(BooleanAndOperation booleanAndOperation) 
		'''«booleanAndOperation.left.printExpression» && «booleanAndOperation.right.printExpression»'''
	
	def dispatch String printExpression(BooleanLiteral booleanLit) {
		return booleanLit.value
	}
	
	def dispatch String printExpression(BooleanOrOperation exp) '''«exp.left.printExpression» || «exp.right.printExpression»'''
	def dispatch String printExpression(BooleanXorOperation exp) '''«exp.left.printExpression» ^ «exp.right.printExpression»'''
	def dispatch String printExpression(ChainedCall exp) {
		if(exp.left instanceof SuperRef && exp.right instanceof OperationCallOperation) {
			val oco = exp.right as OperationCallOperation
			val method = aleClass.methodsRec(false).filter[oco.name == it.name && oco.parameters.size == it.params.size].head
			val localRoot = EcoreUtil.getRootContainer(method) as Root
//			if(localRoot == root) {
//				'''this.«exp.right.printExpression»'''
//			} else {
			'''this.«localRoot.name»delegate.«exp.right.printExpression»'''
				
//			}
		} else {
			'''«exp.left.printExpression».«exp.right.printExpression»'''
		}
	}
	def dispatch String printExpression(ChainedCallArrow exp) '''«exp.left.printExpression».«exp.right.printExpression»'''
	def dispatch String printExpression(CompareGEOperation exp) '''«exp.left.printExpression» >= «exp.right.printExpression»'''
	def dispatch String printExpression(CompareGOperation exp) '''«exp.left.printExpression» > «exp.right.printExpression»'''
	
	def dispatch String printExpression(InstanceofOperation exp) '''«exp.left.printExpression» instanceof «exp.right.printExpression»'''
	def dispatch String printExpression(CasttoOperation exp) '''((«exp.right.printExpression»)«exp.left.printExpression»)'''
	
	def dispatch String printExpression(CompareLEOperation exp) '''«exp.left.printExpression» <= «exp.right.printExpression»'''
	def dispatch String printExpression(CompareLOperation exp) '''«exp.left.printExpression» < «exp.right.printExpression»'''
	def dispatch String printExpression(CompareNEOperation exp) '''«exp.left.printExpression» != «exp.right.printExpression»'''
	def dispatch String printExpression(DivOperation exp) '''«exp.left.printExpression» / «exp.right.printExpression»'''
	def dispatch String printExpression(EqualityOperation exp) '''java.util.Objects.equals(«exp.left.printExpression», «exp.right.printExpression»)'''
	def dispatch String printExpression(ImpliesOperation exp) '''!«exp.left.printExpression» || «exp.right.printExpression»'''
	def dispatch String printExpression(IntLiteral exp) '''«exp.value»'''
	def dispatch String printExpression(IntRange exp) '''__TODO IntRange__'''
	def dispatch String printExpression(MultOperation exp) '''«exp.left.printExpression» * «exp.right.printExpression»'''
	def dispatch String printExpression(NegInfixOperation exp) '''-«exp.expression.printExpression»'''
	def dispatch String printExpression(NotInfixOperation exp) '''!«exp.expression.printExpression»'''
	def dispatch String printExpression(NullLiteral exp) '''null'''
	def dispatch String printExpression(OperationCallOperation exp) {
		if(exp.eContainer instanceof ChainedCallArrow) {
			return switch(exp.name) {
				case 'select': '''stream().filter(«exp.parameters.head.lambda» -> «exp.parameters.head.expression.printExpression»).collect(new EListCollector<>())'''
				case  'reject': '''stream().filter(«exp.parameters.head.lambda» -> !(«exp.parameters.head.expression.printExpression»)).collect(new EListCollector<>())'''
				case 'collect': '''stream().map(«exp.parameters.head.lambda» -> «exp.parameters.head.expression.printExpression»).collect(new EListCollector<>())'''
				case  'any': '''stream().filter(«exp.parameters.head.lambda» -> «exp.parameters.head.expression.printExpression»).findAny().orElse(null)''' 
				case 'exists' : '''stream().stream().findAny().map(«exp.parameters.head.lambda» -> «exp.parameters.head.expression.printExpression»).orElse(false)'''
				case  'forAll': '''stream().stream().allMatch(«exp.parameters.head.lambda» -> «exp.parameters.head.expression.printExpression»)'''
				case 'isUnique' : '''__TODO__'''
				case 'one' : '''__TODO__'''
				case 'sortedBy': '''__TODO__''' 
				case  'closure':'''__TODO__'''
			}
		} else {
			if(exp.name == 'println') exp.name='System.out.println';
			'''«exp.name»(«FOR param: exp.parameters SEPARATOR ',' »«IF param.lambda!= null»«param.lambda» -> «ENDIF»«param.expression.printExpression»«ENDFOR»)''' // TODO deal with lambdas !
		}
	}
	def dispatch String printExpression(OrderedSetDecl exp) '''__TODO OrderSetDecl__'''
	def dispatch String printExpression(RealLiteral exp) '''«exp.value»'''
	def dispatch String printExpression(OADenot exp) '''alg.$(«exp.exp.printExpression»)'''
	def dispatch String printExpression(SelfRef exp) '''self'''
	def dispatch String printExpression(SequenceDecl exp) '''__TODO SequenceDECL__'''
	def dispatch String printExpression(StringLiteral exp) {
		'''"«exp.value»"'''
	}
	def dispatch String printExpression(SubOperation exp) '''«exp.left.printExpression» - «exp.right.printExpression»'''
	def dispatch String printExpression(SuperRef exp) {
		// TODO: scan parents (so we have to know the context) and call the delegate to the first found class with the lookef for method 
		// so cannot be done without the called methods 
		'''__TODO call super__'''
	} // TODO: has to resolve where to call!!
	def dispatch String printExpression(VarRef exp) '''«exp.value»'''
	def dispatch String printExpression(NewSequence exp) '''new org.eclipse.emf.common.util.BasicEList<>();'''
	def dispatch String printExpression(ConstructorOperation exp) '''«exp.name.getAleClass(root)»Factory.eINSTANCE.create«exp.name»()'''
	
}