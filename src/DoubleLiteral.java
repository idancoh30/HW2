/**
 * Represents a double number.
 */
public class DoubleLiteral extends Expression {
    private double value;

    /**
     * Constructor. Initializes a new IntegerLiteral.
     * @param value - the value to be set into DoubleLiteral.
     */
    public DoubleLiteral(double value) {
        this.value = value;
    }

    /**
     * Returns the value of DoubleLiteral.
     * @return the value of DoubleLiteral.
     */
    @Override
    public double evaluate() {
        return value;
    }

    /**
     * Converts the DoubleLiteral value into a string.
     * @return string representation of DoubleLiteral in format of "(value)".
     */
    @Override
    public String toString() {
        return "(" + value + ")";
    }
}
