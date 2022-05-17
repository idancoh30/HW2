public class IntegerLiteral extends Expression{
    protected int value;
    public IntegerLiteral(int value)
    {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

    @Override
    public String toString(){
        return "("+value+")";
    }
}
