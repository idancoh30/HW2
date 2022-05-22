public class Division extends Expression{
    private Expression firstOp;
    private Expression secondOp;
    public Division(Expression first, Expression second)
    {
        this.firstOp = first;
        if(second.evaluate() != 0)
            this.secondOp = second;
    }
    @Override
    public double evaluate() {
        return firstOp.evaluate() / secondOp.evaluate();
    }

    @Override
    public String toString()
    {
        return "("+firstOp+" / "+secondOp+")";
    }
}
