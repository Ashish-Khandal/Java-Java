package Recursion;

public class StackHight_LogN {
    public static int stack_hight_log_n(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return stack_hight_log_n(x, n / 2) * stack_hight_log_n(x, n / 2);
        } else {
            return stack_hight_log_n(x, n / 2) * stack_hight_log_n(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(stack_hight_log_n(2,5));
    }
}
