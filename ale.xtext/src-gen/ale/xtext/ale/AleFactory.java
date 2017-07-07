/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.ale;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ale.xtext.ale.AlePackage
 * @generated
 */
public interface AleFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AleFactory eINSTANCE = ale.xtext.ale.impl.AleFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Root</em>'.
   * @generated
   */
  Root createRoot();

  /**
   * Returns a new object of class '<em>Import Ale</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Ale</em>'.
   * @generated
   */
  ImportAle createImportAle();

  /**
   * Returns a new object of class '<em>Import Ecore</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Ecore</em>'.
   * @generated
   */
  ImportEcore createImportEcore();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  AleClass createAleClass();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Concrete Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concrete Method</em>'.
   * @generated
   */
  ConcreteMethod createConcreteMethod();

  /**
   * Returns a new object of class '<em>Abstract Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Method</em>'.
   * @generated
   */
  AbstractMethod createAbstractMethod();

  /**
   * Returns a new object of class '<em>Def Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Method</em>'.
   * @generated
   */
  DefMethod createDefMethod();

  /**
   * Returns a new object of class '<em>Override Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Override Method</em>'.
   * @generated
   */
  OverrideMethod createOverrideMethod();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol</em>'.
   * @generated
   */
  Symbol createSymbol();

  /**
   * Returns a new object of class '<em>Param Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param Call</em>'.
   * @generated
   */
  ParamCall createParamCall();

  /**
   * Returns a new object of class '<em>Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param</em>'.
   * @generated
   */
  Param createParam();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Literal Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Type</em>'.
   * @generated
   */
  LiteralType createLiteralType();

  /**
   * Returns a new object of class '<em>Debug Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Debug Statement</em>'.
   * @generated
   */
  DebugStatement createDebugStatement();

  /**
   * Returns a new object of class '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Statement</em>'.
   * @generated
   */
  ReturnStatement createReturnStatement();

  /**
   * Returns a new object of class '<em>Let Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Let Statement</em>'.
   * @generated
   */
  LetStatement createLetStatement();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Statement</em>'.
   * @generated
   */
  WhileStatement createWhileStatement();

  /**
   * Returns a new object of class '<em>For Loop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Loop</em>'.
   * @generated
   */
  ForLoop createForLoop();

  /**
   * Returns a new object of class '<em>Var Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Declaration</em>'.
   * @generated
   */
  VarDeclaration createVarDeclaration();

  /**
   * Returns a new object of class '<em>Var Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Assign</em>'.
   * @generated
   */
  VarAssign createVarAssign();

  /**
   * Returns a new object of class '<em>Implies Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implies Operation</em>'.
   * @generated
   */
  ImpliesOperation createImpliesOperation();

  /**
   * Returns a new object of class '<em>Boolean Or Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Or Operation</em>'.
   * @generated
   */
  BooleanOrOperation createBooleanOrOperation();

  /**
   * Returns a new object of class '<em>Boolean And Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean And Operation</em>'.
   * @generated
   */
  BooleanAndOperation createBooleanAndOperation();

  /**
   * Returns a new object of class '<em>Boolean Xor Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Xor Operation</em>'.
   * @generated
   */
  BooleanXorOperation createBooleanXorOperation();

  /**
   * Returns a new object of class '<em>Compare LE Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compare LE Operation</em>'.
   * @generated
   */
  CompareLEOperation createCompareLEOperation();

  /**
   * Returns a new object of class '<em>Compare GE Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compare GE Operation</em>'.
   * @generated
   */
  CompareGEOperation createCompareGEOperation();

  /**
   * Returns a new object of class '<em>Compare NE Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compare NE Operation</em>'.
   * @generated
   */
  CompareNEOperation createCompareNEOperation();

  /**
   * Returns a new object of class '<em>Compare LOperation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compare LOperation</em>'.
   * @generated
   */
  CompareLOperation createCompareLOperation();

  /**
   * Returns a new object of class '<em>Compare GOperation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compare GOperation</em>'.
   * @generated
   */
  CompareGOperation createCompareGOperation();

  /**
   * Returns a new object of class '<em>Equality Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality Operation</em>'.
   * @generated
   */
  EqualityOperation createEqualityOperation();

  /**
   * Returns a new object of class '<em>Mult Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mult Operation</em>'.
   * @generated
   */
  MultOperation createMultOperation();

  /**
   * Returns a new object of class '<em>Div Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div Operation</em>'.
   * @generated
   */
  DivOperation createDivOperation();

  /**
   * Returns a new object of class '<em>Add Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Operation</em>'.
   * @generated
   */
  AddOperation createAddOperation();

  /**
   * Returns a new object of class '<em>Sub Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Operation</em>'.
   * @generated
   */
  SubOperation createSubOperation();

  /**
   * Returns a new object of class '<em>Chained Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chained Call</em>'.
   * @generated
   */
  ChainedCall createChainedCall();

  /**
   * Returns a new object of class '<em>Chained Call Arrow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chained Call Arrow</em>'.
   * @generated
   */
  ChainedCallArrow createChainedCallArrow();

  /**
   * Returns a new object of class '<em>Not Infix Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Infix Operation</em>'.
   * @generated
   */
  NotInfixOperation createNotInfixOperation();

  /**
   * Returns a new object of class '<em>Neg Infix Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neg Infix Operation</em>'.
   * @generated
   */
  NegInfixOperation createNegInfixOperation();

  /**
   * Returns a new object of class '<em>New Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Sequence</em>'.
   * @generated
   */
  NewSequence createNewSequence();

  /**
   * Returns a new object of class '<em>Constructor Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor Operation</em>'.
   * @generated
   */
  ConstructorOperation createConstructorOperation();

  /**
   * Returns a new object of class '<em>Operation Call Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Call Operation</em>'.
   * @generated
   */
  OperationCallOperation createOperationCallOperation();

  /**
   * Returns a new object of class '<em>OA Denot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OA Denot</em>'.
   * @generated
   */
  OADenot createOADenot();

  /**
   * Returns a new object of class '<em>Self Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Self Ref</em>'.
   * @generated
   */
  SelfRef createSelfRef();

  /**
   * Returns a new object of class '<em>Super Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Super Ref</em>'.
   * @generated
   */
  SuperRef createSuperRef();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Literal</em>'.
   * @generated
   */
  RealLiteral createRealLiteral();

  /**
   * Returns a new object of class '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal</em>'.
   * @generated
   */
  BooleanLiteral createBooleanLiteral();

  /**
   * Returns a new object of class '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal</em>'.
   * @generated
   */
  NullLiteral createNullLiteral();

  /**
   * Returns a new object of class '<em>Int Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Range</em>'.
   * @generated
   */
  IntRange createIntRange();

  /**
   * Returns a new object of class '<em>Sequence Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Decl</em>'.
   * @generated
   */
  SequenceDecl createSequenceDecl();

  /**
   * Returns a new object of class '<em>Ordered Set Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ordered Set Decl</em>'.
   * @generated
   */
  OrderedSetDecl createOrderedSetDecl();

  /**
   * Returns a new object of class '<em>Var Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Ref</em>'.
   * @generated
   */
  VarRef createVarRef();

  /**
   * Returns a new object of class '<em>Out Of Scope Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Out Of Scope Type</em>'.
   * @generated
   */
  OutOfScopeType createOutOfScopeType();

  /**
   * Returns a new object of class '<em>Sequence Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Type</em>'.
   * @generated
   */
  SequenceType createSequenceType();

  /**
   * Returns a new object of class '<em>Ordered Set Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ordered Set Type</em>'.
   * @generated
   */
  OrderedSetType createOrderedSetType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AlePackage getAlePackage();

} //AleFactory
