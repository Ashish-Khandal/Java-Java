package Question;

import java.util.Scanner;

public class ArmstrongNumber {
    public static int digitCount(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Armstrong:- ");
        int n = sc.nextInt();
        int count = digitCount(n);
        int sum = 0, newSum = n;
        while (n > 0) {
            int x = n % 10;
            sum += Math.pow(x, count);
            n /= 10;
        }
        if (sum == newSum) {
            System.out.print("Your number " + newSum + " is a Armstrong number.");
        } else {
            System.out.print("Your number " + newSum + " is not Armstrong number.");
        }
    }
}
