/**
 * Represents a sum operation between two operands.
 */
public class Addition extends Expression{
    private Expression firstOp;
    private Expression secondOp;

    /**
     * Constructor. Initializes new addition.
     * @param first - first operand to be summed.
     * @param second - second operand to be summed.
     */
    public Addition(Expression first, Expression second)
    {
        this.firstOp = first;
        this.secondOp = second;
    }

    /**
     * Evaluates addition operation between two operands, or zero if one of them is null.
     * @return addition result.
     */
    public double evaluate()
    {
        if(firstOp != null && secondOp != null)
            return firstOp.evaluate() + secondOp.evaluate();
        return 0;
    }

    /**
     * Converts the Addition operation into a string.
     * @return string representation of Addition in format of "((operand1) + (operand2))".
     */
    public String toString()
    {
        return "("+firstOp+" + "+secondOp+")";
    }
}
