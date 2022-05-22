public class Addition extends Expression{
    private Expression firstOp;
    private Expression secondOp;

    public Addition(Expression first, Expression second)
    {
        this.firstOp = first;
        this.secondOp = second;
    }

    public double evaluate()
    {
        if(firstOp != null && secondOp != null)
            return firstOp.evaluate() + secondOp.evaluate();
        return 0;
    }

    public String toString()
    {
        return "("+firstOp+" + "+secondOp+")";
    }



}
