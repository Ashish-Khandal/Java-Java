package Java_concept;
import java.util.Scanner;

public class Math_Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number which find power:-");
        int num = sc.nextInt();
        System.out.println("Enter your power number :- ");
        int pow  = sc.nextInt();
        //! this method use and find the power 
        int logic = (int) Math.pow(num,pow);
        System.out.println("Your number power "+num+"^"+pow+":- "+logic);
        System.out.println();
    }
}
