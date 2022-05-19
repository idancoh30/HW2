public class ReversePolishNotationParser extends ExpressionParser {
    public Expression parse(String expString) {
        Expression res = new IntegerLiteral(1);
        Expression x;
        Expression y;
        String[] expArray = expString.split(" ");
        String mathOp;
        Stack<Expression> stack = new Stack<>();
        for (int i = 0; i < expArray.length; i++) {
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
                        res = new Substraction(x,y);
                        stack.push(res);
                         break;
                    case "-u":
                        res = new UnaryMinus(y);
                        stack.push(res);
                        break;
                }
            }
        }
        return res;
    }
}
