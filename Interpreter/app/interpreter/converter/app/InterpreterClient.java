package interpreter.converter.app;

public class InterpreterClient {

    private static final String HEXADECIMAL = "Hexadecimal";

    private static final String BINARY = "Binary";

    public InterpreterContext interpreterContext;

    public InterpreterClient(InterpreterContext i) {
        this.interpreterContext = i;
    }

    public String interpret(String str) {
        Expression exp = null;
        //create rules for expressions
        if (str.contains(HEXADECIMAL)) {
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else if (str.contains(BINARY)) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else return str;

        return exp.interpret(interpreterContext);
    }
}
