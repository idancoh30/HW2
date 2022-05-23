/**
 * Represents division operation between two operands.
 */
public class Division extends Expression{
    private Expression firstOp;
    private Expression secondOp;

    /**
     * Constructor. Initializes new division.
     * @param first - Dividend operand.
     * @param second - Divisor operand.
     */
    public Division(Expression first, Expression second)
    {
        this.firstOp = first;
        if(second.evaluate() != 0)
            this.secondOp = second;
    }

    /**
     * Evaluates division operation between two operands.
     * @return division result.
     */
    @Override
    public double evaluate() {
        return firstOp.evaluate() / secondOp.evaluate();
    }

    /**
     * Converts the division operation into a string.
     * @return string representation of division in format of "((operand1) / (operand2))".
     */
    @Override
    public String toString()
    {
        return "("+firstOp+" / "+secondOp+")";
    }
}
