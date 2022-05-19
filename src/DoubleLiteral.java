public class DoubleLiteral extends Expression {
    protected double value;
    public DoubleLiteral(){
        value = 0;
    }


    public DoubleLiteral(double value)
    {
        this.value = value;
    }


    @Override
    public double evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return "("+value+")";
    }
}
