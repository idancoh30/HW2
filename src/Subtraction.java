/**
 * Represents subtraction operation between two operands.
 */
public class Subtraction extends Expression {
    private Expression firstOp;
    private Expression secondOp;

    /**
     * Constructor. Initializes new subtraction.
     * @param first - minuend operand.
     * @param second - subtrahend operand.
     */
    public Subtraction(Expression first, Expression second) {
        this.firstOp = first;
        this.secondOp = second;
    }

    /**
     * Evaluates subtraction operation between two operands.
     * @return difference between two operands.
     */
    @Override
    public double evaluate() {
        return firstOp.evaluate() - secondOp.evaluate();
    }

    /**
     * Converts the subtraction operation into a string.
     * @return string representation of subtraction in format of "((operand1) - (operand2))".
     */
    @Override
    public String toString() {
        return "("+firstOp+" - "+secondOp+")";
    }

}