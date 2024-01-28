package Recursion;

import java.util.Scanner;

public class GcdFind {
    public static void igcd(int x, int y) {
        int min = Math.min(x, y);
        for (int i = min; i > 0; i--) {
            if (x % i == 0 && y % i == 0) {
                System.out.println(i);
                return;
            }
        }
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        igcd(x, y);
        System.out.println(gcd(x, y));
    }
}
