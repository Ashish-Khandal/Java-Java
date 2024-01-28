package Recursion;

public class StackHightFind {
    public static int find_Power(int x, int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int power = x;
         power = power * find_Power(x,n-1);
         return power;
    }
    public static void main(String[] args) {
        System.out.println(find_Power(2,5));
    }
}
