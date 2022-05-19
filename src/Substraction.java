public class Substraction extends Expression {
    private Expression firstOp;
    private Expression secondOp;

    public Substraction(Expression first, Expression second) {
        this.firstOp = first;
        this.secondOp = second;
    }

    @Override
    public double evaluate() {
        return firstOp.evaluate() - secondOp.evaluate();
    }

    @Override
    public String toString() {
        return "((" + firstOp.evaluate() + ")" + " - (" + secondOp.evaluate() + "))";
    }

}