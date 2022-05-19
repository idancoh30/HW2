public class Addition extends Expression{
    Expression firstOp;
    Expression secondOp;

    public Addition(Expression first, Expression second)
    {
        firstOp = first;
        secondOp = second;
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
