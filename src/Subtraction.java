public class Subtraction extends Expression {
    private Expression firstOp;
    private Expression secondOp;

    public Subtraction(Expression first, Expression second) {
        this.firstOp = first;
        this.secondOp = second;
    }

    @Override
    public double evaluate() {
        return firstOp.evaluate() - secondOp.evaluate();
    }

    @Override
    public String toString() {
        return "("+firstOp+" - "+secondOp+")";
    }

}