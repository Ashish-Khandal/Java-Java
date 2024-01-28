package Recursion;

public class Pattren {
    public static void starPrintMethod1(int num1, int end1) {
        starPrintMethod2(1,num1);
        System.out.println();
        if (num1 == end1) {
            return;
        }
        starPrintMethod1(num1 + 1,end1);
    }
    public static void starPrintMethod2(int num2,int end2) {
        System.out.print("* ");
        if (num2==end2){
            return;
        }
        starPrintMethod2(num2+1,end2);
    }

    public static void main(String[] args) {
        starPrintMethod1(1,5);
    }
}
