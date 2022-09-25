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
}
