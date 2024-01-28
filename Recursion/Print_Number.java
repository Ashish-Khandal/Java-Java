package Recursion;

public class Print_Number {
    void recursionMethod(int n){
        if(n>0){
        System.out.println(n);
        recursionMethod(n-1);
        }
    }
    public static void  main(String[] args) {
        Print_Number pn = new Print_Number();
        pn.recursionMethod(5);
    }
}
                /*!************       or       ***************/
/*public class Print_Number {
    public static void recursionMethod(int n){
        if(n>0){
        System.out.println(n);
        recursionMethod(n-1);
        }
    }
    public static void main(String[] args) {
        recursionMethod(5);
    }
}*/
