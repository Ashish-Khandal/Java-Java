package Question;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your armstrong number :-");
        int n = sc.nextInt();
        if(n>9999 || n<0){
            System.out.println("Your range don't 0 to 5000, So please try again.");
            return;
        }
        int sum = 0;
        int arm = n;
        System.out.print("Enter your choice 1,2,3,4 that mean 1 is one digit 2 mean two digit an so on:-");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 : 
            while (n > 0) {
                // int x = n % 10;
                sum = sum + n ;
                n = n / 10;
            }
            if (sum == arm) {
                System.out.print("your number "+arm+" is Armstorng.");
            } else {
                System.out.print("your number "+arm+" is not a Armstorng.");
            }
            break;
            case 2:
                while (n > 0) {
                    int x = n % 10;
                    sum = sum + x * x;
                    n = n / 10;
                }
                if (sum == arm) {
                    System.out.print("your number "+arm+" is Armstorng.");
                } else {
                    System.out.print("your number "+arm+" is not a Armstorng.");
                }
                break;
            case 3:
                while (n > 0) {
                    int x = n % 10;
                    sum = sum + x * x * x;
                    n = n / 10;
                }
                if (sum == arm) {
                    System.out.print("your number "+arm+" is Armstorng.");
                } else {
                    System.out.print("your number "+arm+" is not a Armstorng.");
                }
                break;
            case 4:
                while (n > 0) {
                    int x = n % 10;
                    sum = sum + x * x * x * x;
                    n = n / 10;
                }
                if (sum == arm) {
                    System.out.print("your number "+arm+" is Armstorng.");
                } else {
                    System.out.print("your number "+arm+" is not a Armstorng.");
                }
                break;
                default :
                System.out.println("Invlid number try again.");
                return;
        }
    }
}
