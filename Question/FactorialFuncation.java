package Question;

import java.util.Scanner;

public class FactorialFuncation {
    public static void factorial() {
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your factorial number:- ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid number");
        } else {
            for (int i = n; i >= 1; i--) {
                factorial = factorial * i;
            }
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        factorial();
    }
}
