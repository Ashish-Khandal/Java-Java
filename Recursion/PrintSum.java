package Recursion;

public class PrintSum {
    //    ! Method first.
    public static void printSumNumber(int i, int n, int sum) {
        sum += i;
        if (n == i) {
            System.out.println(sum);
            return;
        }
        printSumNumber(i + 1, n, sum);
    }

    //    ! Method Second.
    public static int sumPrint(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        return sumPrint(n / 10) + n % 10;
    }

    //    ! Method third.
//    ? Ex- { 1 - 2 + 3 - 4 + 5 - 6 ... }
    public static int sumPrint2(int n) {
        if (n == 0) {
            return n;
        }
        if (n % 2 == 0) {
            return sumPrint2(n - 1) - n;
        } else {
            return sumPrint2(n - 1) + n;
        }
    }

    public static void main(String[] args) {
//        printSumNumber(1, 5, 0);
//        System.out.println(sumPrint(5326));
        System.out.println(sumPrint2(5));
    }
}
