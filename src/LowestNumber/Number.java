package LowestNumber;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        float a, b, c, lNumber = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("a: ");
        a = read.nextFloat();
        System.out.println("b: ");
        b = read.nextFloat();
        System.out.println("c: ");
        c = read.nextFloat();

        if (a < b) {
            if (a < c) {
                lNumber = a;
            } else if (c < b) {
                lNumber = c;
            }
        } else if (c > b) {
            lNumber = b;
        }
        System.out.println("The lowest number is :" + lNumber);
    }
}
