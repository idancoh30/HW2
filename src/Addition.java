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
        return firstOp.evaluate() + secondOp.evaluate();
    }

    public String toString()
    {
        return "(("+firstOp.evaluate()+")"+" + ("+secondOp.evaluate()+"))";
    }



}
