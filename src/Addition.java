public class Addition<N extends Number> extends Expression{
    private N firstOp, secondOp;
    public Addition(N first, N second)
    {
        this.firstOp = first;
        this.secondOp = second;
    }
    @Override
    public double evaluate() {
        return firstOp.doubleValue() + secondOp.doubleValue();
    }

    @Override
    public String toString()
    {
        return "(("+firstOp.doubleValue()+")"+" + ("+secondOp.doubleValue()+"))";
    }
}
