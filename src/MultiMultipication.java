public class MultiMultipication<N extends Number> extends Expression{
    private N[] operands;

    public MultiMultipication(N... opr)
    {
        operands = opr;
    }

    public double evaluate() {
        double sum = 0;
        for (int i = 0; i < operands.length; i++) {
            sum *= operands[i].doubleValue();
        }
        return sum;
    }

    public String toString() {
        String str = "(";
        for (int i = 0; i < operands.length; i++) {
            if(i != operands.length - 1)
                str += "("+operands[i].doubleValue()+") * ";
            else
                str += "("+operands[i].doubleValue()+")";
        }
        str += ")";
        return str;
    }
}
