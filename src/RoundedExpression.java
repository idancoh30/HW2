/**
 *  Represents rounding operation on an object.
 */
public class RoundedExpression extends Expression  {
        private Expression opr;
        private int roundInt;

    /**
     * Constructor. Initializes new rounded object.
     * @param opr - operand to be rounded.
     * @param roundInt - number of decimal places to round by.
     */
    public RoundedExpression(Expression opr, int roundInt ) {
            this.opr = opr;
            this.roundInt = roundInt;
        }

    /**
     * Evaluates rounding operation by given amount of decimal places.
     * @return rounded result.
     */
    @Override
        public double evaluate() {
            return Math.round((opr.evaluate())*(Math.pow(10,roundInt)))/(Math.pow(10,roundInt));
        }

    /**
     * Converts the Round operation into a string.
     * @return string representation of Round in format of "(value)"
     */
    @Override
        public String toString() {
            return opr.toString();
        }
    }
