public class Division<N extends Number> extends Expression{
    private N firstOp, secondOp;
    public Division(N first, N second)
    {
        this.firstOp = first;
        if(second.doubleValue() != 0)
            this.secondOp = second;
    }
    @Override
    public double evaluate() {
        return firstOp.doubleValue() / secondOp.doubleValue();
    }

    @Override
    public String toString()
    {
        return "(("+firstOp.doubleValue()+")"+" / ("+secondOp.doubleValue()+"))";
    }
}
