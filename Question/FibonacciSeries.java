package Question;

public class FibonacciSeries {
    public static void main(String[] args) {
            int a=0;
            int b=1;
        System.out.print(a+" "+b+" ");
        for (int i=1; i<=10; i++){
            int nextTerm = a+b;
            System.out.print(nextTerm+" ");
            a=b;
            b=nextTerm;
        }
    }
}
