package fahrenheit;

public class CConvert {
    final static int infLimit = -30;
    final static int supLimit = 100;
    final static int increment = 6;

    public static void main(String[] args) {
        CDegree degrees = new CDegree();
        int cDegrees = infLimit;
        float fahrDegrees = 0;

        while (cDegrees <= supLimit) {
            degrees.setDegrees(cDegrees);
            fahrDegrees = degrees.getFahrenheit();
            System.out.println(cDegrees + "C" + "\t" + fahrDegrees + "F");
            cDegrees += increment;
        }
    }
}
