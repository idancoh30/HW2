public class UnaryMinus <N extends Number> extends Expression {

    private N opr;

    public UnaryMinus(N opr) {
        this.opr = opr;
    }

    @Override
    public double evaluate() {return (-1)*opr.doubleValue();
    }

    @Override
    public String toString() {
        return "(-(" + opr.doubleValue() + "))";
    }

}
