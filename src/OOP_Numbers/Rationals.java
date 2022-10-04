package OOP_Numbers;

public class Rationals {
    public static void main(String[] args) {
        RationalNumbers r1, r2;
        r1 = new RationalNumbers();
        r1.setData(2, 5);
        r2 = r1;
        r1.getData();

        r1.setData(3, 7);
        r1.getData();
        r2.getData();

        RationalNumbers r3;
        r2 = new RationalNumbers();
        r2.setData(2, 5);
        r3 = RationalNumbers.Addition(r1, r2);
        r3.getData();
    }
}
