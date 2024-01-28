package Recursion;

public class Tower_Of_Hanoi {
    public static void sour_help_des(int n, String src, String helper, String destination) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
            return;
        }
        sour_help_des(n-1,src, destination,helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
        sour_help_des(n-1,helper,src,destination);
    }

    public static void main(String[] args) {
        sour_help_des(3,"Source","Helper","Destination");
    }
}
