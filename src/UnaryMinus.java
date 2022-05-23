/**
 * Represents unary-minus operation on an operand
 */
public class UnaryMinus extends Expression {

    private Expression opr;

    /**
     * Constructor. Initializes new unary-minus.
     * @param opr - operand to unary-minus operator
     */
    public UnaryMinus(Expression opr) {
        this.opr = opr;
    }

    /**
     * Evaluates unary-minus operation on an operand
     * @return the negative of the operand
     */
    @Override
    public double evaluate() {return (-1)*opr.evaluate();
    }

    /**
     * Converts the unary-minus operation into a string.
     * @return string representation of UnaryMinus in format of "(value)"
     */
    @Override
    public String toString() {
        return "(-"+opr+")";
    }

}
