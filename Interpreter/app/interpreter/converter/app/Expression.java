package interpreter.converter.app;

/**
 * AbstractExpression - Declares an abstract Interpret operation that is common to all nodes in the abstract syntax tree.
 */
public interface Expression {

    String interpret(InterpreterContext interpreterContext);
}
