public class UnaryMinus extends Expression {

    private Expression opr;

    public UnaryMinus(Expression opr) {
        this.opr = opr;
    }

    @Override
    public double evaluate() {return (-1)*opr.evaluate();
    }

    @Override
    public String toString() {
        return "(-"+opr+")";
    }

}
