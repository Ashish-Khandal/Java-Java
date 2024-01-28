/*
import java.lang.Math;
public class Pattern_test {
    public static void main(String[] args) {
      //Que.2=> print the pattern
        */
/*
 ****************
 *******__*******
 ******____******
 *****______*****
 ****________****
 ***__________***
 **____________**
 *______________*
 *//*

        //solve
        int n = 8;
        for (int i=1;i<=n;i++){
           for(int j=n;j>=i;j--){
            System.out.print("*");
           }
           for(int j=1; j<=2*i-2; j++){
            System.out.print("_");
           }
           for(int j=n;j>=i;j--){
            System.out.print("*");
           }
           System.out.println();
        }
    }
}
*/
public class Pattern_test {
    public static void main(String[] args) {
        int x=0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if(x==0){
                    System.out.print("1 ");
                    x=1;
                }else {
                    System.out.print("0 ");
                    x=0;
                }
            }
        System.out.println();
        }
    }
}
