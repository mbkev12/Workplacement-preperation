package inlinefunctions;

public class Inline_Example {

    public static final class Tax {

        private int Taxa = 0;

        private int Taxb = 0;

        public int getTaxA() {
            return Taxa;
        }

        public void setTaxA(int Taxa) {
            this.Taxa = Taxa;
        }

        public int getTaxB() {
            return Taxb;
        }

        public void setTaxB(int Taxb) {
            this.Taxb = Taxb;
        }

        @Override
        public String toString() {
            return String.format("%s[Taxa=%d, Taxb=%d]", getClass().getSimpleName(), Taxa, Taxb);
        }
    }

    public static void main(String[] args) {

        final Tax NotInlinedPoints = new Tax ();
        NotInlinedPoints.setTaxA( NotInlinedPoints.getTaxA() + 200);
        NotInlinedPoints.setTaxB( NotInlinedPoints.getTaxA() * 60/20);

        final Tax InlinedPoints = new Tax();
        InlinedPoints.Taxa = InlinedPoints.Taxa + 2;
        InlinedPoints.Taxb = InlinedPoints.Taxa * 6/2;

        System.out.println("Your Tax credits A + B  "+NotInlinedPoints);
        System.out.println("Your Tax Rate A + B  "+InlinedPoints);
    }
}