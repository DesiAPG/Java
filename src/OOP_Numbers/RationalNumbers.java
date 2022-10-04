package OOP_Numbers;

public class RationalNumbers {
    private int numerator;
    private int denominator;

    public void setData(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            denominator = 1;
        }
        this.denominator = denominator;
    }

    public void getData() {
        System.out.println(numerator + "/" + denominator);
    }

    public static RationalNumbers Addition(RationalNumbers a, RationalNumbers b) {
        RationalNumbers r = new RationalNumbers();
        int num = a.numerator * b.denominator + a.denominator * b.numerator;
        int den = a.denominator * b.denominator;
        r.setData(num, den);
        return r;
    }
}
