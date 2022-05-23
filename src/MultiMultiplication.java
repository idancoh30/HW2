/**
 * Represents multiplication operation between multiple operands.
 */
public class MultiMultiplication extends Expression{
    private Expression[] operands;

    /**
     * Constructor. Initializes new multi-multiplication
     * @param opr - operands to be multiplication.
     */
    public MultiMultiplication(Expression... opr)
    {
        if(opr.length > 1)
            operands = opr;
    }

    /**
     * Evaluates multiplication operation between multiple operands.
     * @return multiplication result.
     */
    public double evaluate() {
        double sum = 1;
        for (int i = 0; i < operands.length; i++) {
            sum *= operands[i].evaluate();
        }
        return sum;
    }

    /**
     * Converts the multi-multiplication operation into a string.
     * @return string representation of MultiMultiplication in format of "((operand1) * (operand2).... * (operandN))".
     */
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
