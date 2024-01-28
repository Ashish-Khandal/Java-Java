package Recursion;

public class NumberCount {
    public static int numCount(int n) {
        int count = 1;
        if (n >= 0 && n <= 9) {
            return count;
        }
        count += numCount(n / 10);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numCount(5644245));
    }
}
