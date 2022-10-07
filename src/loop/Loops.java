package loop;

public class Loops {
    public static void main(String[] args) {
        for (int n = 0; n <= 100; n++) {
            if (n % 5 != 0) {
                continue;
            }
            System.out.println(n + " ");
        }
    }
}
