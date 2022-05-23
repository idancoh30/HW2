/**
 * Represents reverse polish notation as an expression
 */
public class ReversePolishNotationParser extends ExpressionParser {
    /**
     * Converts a string to an expression in reverse polish notation format.
     * @param expString expression provided as a string
     * @return expression in reverse polish notation format
     */
    public Expression parse(String expString) {
        Expression res = new DoubleLiteral(0);
        Expression x;
        Expression y;
        String[] expArray = expString.split(" ");
        String mathOp;
        Stack<Expression> stack = new Stack<>();
        if(expArray.length == 1)
        {
            if (expArray[0].contains(".")) {
                res = new DoubleLiteral(Double.parseDouble(expArray[0]));
                return res;
            } else {
                res = new IntegerLiteral(Integer.parseInt(expArray[0]));
                return res;
            }
        }
        for (int i = 0; i < expArray.length; i++) {
            // in case the expArray[i] is a number - add it to the stack
            if (!expArray[i].equals("*") && !expArray[i].equals("/")
                    && !expArray[i].equals("+") && !expArray[i].equals("-") && !expArray[i].equals("-u")) {
                if(expArray[i].contains("."))
                {
                    stack.push(new DoubleLiteral(Double.parseDouble(expArray[i])));
                }
                else
                {
                    stack.push(new IntegerLiteral(Integer.parseInt(expArray[i])));
                }
            }
            else {
                // in case the expArray[i] is an arithmetic operation - apply it on the relevant numbers from the stack
                mathOp = expArray[i];
                y = stack.pop();
                x = stack.pop();
                switch (mathOp) {
                    case "*":
                        res = new Multiplication(x,y);
                        stack.push(res);
                        break;
                    case "/":
                        res = new Division(x,y);
                        stack.push(res);
                        break;
                    case "+":
                        res = new Addition(x,y);
                        stack.push(res);
                        break;
                    case "-":
                        res = new Subtraction(x,y);
                        stack.push(res);
                         break;
                    case "-u":
                        res = new UnaryMinus(y);
                        stack.push(x);
                        stack.push(res);

                        break;
                }
            }
        }
        return res;
    }
}
