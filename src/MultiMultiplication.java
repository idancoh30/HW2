public class MultiMultiplication extends Expression{
    private Expression[] operands;

    public MultiMultiplication(Expression... opr)
    {
        operands = opr;
    }

    public double evaluate() {
        double sum = 1;
        for (int i = 0; i < operands.length; i++) {
            sum *= operands[i].evaluate();
        }
        return sum;
    }

    public String toString() {
        String str = "(";
        for (int i = 0; i < operands.length; i++) {
            if(i != operands.length - 1)
                str += operands[i]+" * ";
            else
                str += operands[i];
        }
        str += ")";
        return str;
    }
}
