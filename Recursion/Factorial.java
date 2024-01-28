package Recursion;

public class Factorial {
    public static int factorialFind(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = n * factorialFind(n - 1);
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorialFind(5));
    }
}
