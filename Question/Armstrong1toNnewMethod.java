package Question;

import java.util.Scanner;

public class Armstrong1toNnewMethod {
    public static int digitCount(int i) {
        int count = 0;
        while (i > 0) {
            i /= 10;
            count++;
        }
        return count;
    }

    public static boolean checkNum(int i) {
        int check = i, sum = 0;
        int count = digitCount(i);
        while (i > 0) {
            int x = i % 10;
            sum += Math.pow(x, count);
            i /= 10;
        }
        if (sum == check) {
            return true;
        }
        return false;
    }

    public static void printArmNumber(int n) {
        for (int i = 1; i <= n; i++) {
            if (checkNum(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number range:- ");
        int n = sc.nextInt();
        printArmNumber(n);
    }
}
