/**
 * Represents multiplication operation between two operands.
 */
public class Multiplication extends Expression{
    private Expression firstOp;
    private Expression secondOp;

    /**
     * Constructor. Initializes new multiplication.
     * @param first - first operand to be multiplied.
     * @param second - second operand to be multiplied.
     */
    public Multiplication(Expression first, Expression second)
    {
        this.firstOp = first;
        this.secondOp = second;
    }


    /**
     * Evaluates multiplication operation between two operands.
     * @return multiplication result.
     */
    @Override
    public double evaluate() {
        return firstOp.evaluate() * secondOp.evaluate();
    }

    /**
     * Converts the multiplication operation into a string.
     * @return string representation of Multiplication in format of "((operand1) * (operand2))".
     */
    @Override
    public String toString()
    {
        return "("+firstOp+" * "+secondOp+")";
    }
}
