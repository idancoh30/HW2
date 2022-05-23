/**
 * Represents an integer number.
 */
public class IntegerLiteral extends Expression{
    private int value;

    /**
     * Constructor. Initializes a new IntegerLiteral.
     * @param value - the value to be set into IntegerLiteral.
     */
    public IntegerLiteral(int value)
    {
        this.value = value;
    }

    /**
     * Returns the value of IntegerLiteral.
     * @return the value of IntegerLiteral.
     */
    @Override
    public double evaluate() {
        return value;
    }

    /**
     * Converts the IntegerLiteral value into a string.
     * @return string representation of IntegerLiteral in format of "(value)".
     */
    @Override
    public String toString(){
        return "("+value+")";
    }
}
