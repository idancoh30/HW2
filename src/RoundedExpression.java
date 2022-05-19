public class RoundedExpression <N extends Number> extends Expression  {
        private N opr;
        private int roundInt;

        public RoundedExpression(N opr, int roundInt ) {
            this.opr = opr;
            this.roundInt = roundInt;
        }

        @Override
        public double evaluate() {
            return Math.floor((opr.doubleValue())*(Math.pow(10,roundInt)))/(Math.pow(10,roundInt));
        }

        // 1.234,1 -> round(1.234*10^1)/10 -> round(12.34)/10 -> 12/10 -> 1.2

        @Override
        public String toString() {
            return "(" + opr.doubleValue() + ")";
        }
    }
