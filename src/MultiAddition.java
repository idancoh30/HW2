/**
 * Represents addition operation between multiple operands.
 */
public class MultiAddition extends Expression {
    private Expression[] operands;

    /**
     * Constructor. Initializes new multi-addition
     * @param opr - operands to be summed.
     */
    public MultiAddition(Expression... opr) {
        if(opr.length > 1)
            operands=opr;
    }

    /**
     * Evaluates addition operation between multiple operands.
     * @return addition result.
     */
    public double evaluate() {
        double sum = 0;
        for (int i = 0; i < operands.length; i++) {
            sum += operands[i].evaluate();
        }
        return sum;
    }

    /**
     * Converts the multiplication operation into a string.
     * @return string representation of MultiAddition in format of "((operand1) + (operand2).... + (operandN))".
     */
    public String toString() {
        String str = "(";
        for (int i = 0; i < operands.length; i++) {
            if(i != operands.length - 1)
                str += operands[i]+" + ";
            else
                str += operands[i];
        }
        str += ")";
        return str;
    }

}
