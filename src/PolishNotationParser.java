public class PolishNotationParser extends ExpressionParser {
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
        for (int i = expArray.length - 1; i >= 0; i--) {
            if (!expArray[i].equals("*") && !expArray[i].equals("/") &&
                    !expArray[i].equals("+") && !expArray[i].equals("-") && !expArray[i].equals("-u")) {
                if (expArray[i].contains(".")) {
                    stack.push(new DoubleLiteral(Double.parseDouble(expArray[i])));
                } else {
                    stack.push(new IntegerLiteral(Integer.parseInt(expArray[i])));
                }
            } else {
                mathOp = expArray[i];
                y = stack.pop();
                x = stack.pop();
                switch (mathOp) {
                    case "*":
                        res = new Multiplication(y,x);
                        stack.push(res);
                        break;
                    case "/":
                        res = new Division(y,x);
                        stack.push(res);
                        break;
                    case "+":
                        res = new Addition(y,x);
                        stack.push(res);
                        break;
                    case "-":
                        res = new Subtraction(y,x);
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
