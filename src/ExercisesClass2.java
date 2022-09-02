public class ExercisesClass2 {

    /* Class 2
       Exercises
     */

    public static void main(String[] args) {
        float r = calculate(1, 5, 2, 0);
        System.out.println(r);
    }

    public static float calculate(int a, int b, int c, float result) {
        result = (float) ((Math.sqrt(b) - 4 * a * c) / (2 * a));
        return result;
    }

}
