package Pattern;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Que.1=> print the pattern
        /*    *****
         *****
         *****
         *****
         */
        //solve
     /* int n = 4;
        int m = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Que.2=> print the pattern
        /*
         *****
         *   *
         *   *
         *****
         */
        //solve
        /*int n = 4;
        int m = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        //Que.3=> print the pattern 
        /*
         *
         **
         ***
         ****
           */
        //solve
        /*int n = 4;
        for(int i=1; i<=n; i++){
            //inner loop for spaces 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Que.4=> print the pattern
        /*  1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */
        //solve
       /* int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        //Que.5=> print the pattern
        /* 12345
           1234
           123
           12
           1
          */
        //solve
         /* int n = 5;
          for(int i=n; i>=1; i--){
              for(int j=1; j<=i; j++){
                  System.out.print(j+" ");
             }
            System.out.println();
          } */
        //or
          /*int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        //Que.6=> print the pattern
          /*  1
              2  3
              4  5  6 
              7  8  9  10
              11 12 13 14 15
            */
          /*int n = 5;
          int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }*/


        //Que.7=> print the pattern
        /*   1
             0 1
             1 0 1
             0 1 0 1 
             1 0 1 0 1
         */
        //solve
        /* int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }*/
        //Que.8=> print the pattern
        /*
         *      *
         **    **
         ***  ***
         ********
         ********
         ***  ***
         **    **
         *      *

         */
        //solve
          /*int n = 4;
          for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int logic = 2*(n-i);
            for(int j=logic; j>=1; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
          }
          System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int logic = 2*(n-i);
            for(int j=logic; j>=1; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
          }
          System.out.println();
        }*/

        //Que.9=> print the pattern 
        /*
         *****
         *****
         *****
         *****

         */
        //solve
        /*int n = 5;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Que.10=> print the pattern
        /*  
               1
              2 2
             3 3 3
            4 4 4 4
           5 5 5 5 5

         */
        //solve
        /*int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=0; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/

        //Que.11=> print the pattern
        /*    1
             212
            32123
           4321234
          543212345   
         */
        //solve
        /*int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        //Que.12=> print the pattern 
        /*
         *
         ***
         *****
         *******
         *******
         *****
         ***
         *
         */
        //solve
        /*int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=0; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){  //logic = 2*(n-i)+1;
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=n-i; j>=0; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Que.13=> print the pattern
        /*
        1
        22
        333
        4444
        55555
        */
        //solve
        /*int n = 5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }*/

        //Que.14=> print the pattern
        /*
        11111
        2222
        333
        44
        5
        */
        //solve
        /*
          int n = 5;
       for (int i=1;i<=n;i++){
           for(int j=n;j>=i;j--){
               System.out.print(i);
           }
            System.out.println();
        } */

        //Que.15=> print the pattern
        /*
        1
        3 3
        5 5 5
        7 7 7 7
        9 9 9 9 9
        */
        //solve
        /*int n = 5;
        for (int i=1;i<=n;i++){
            int logic = 2*i-1;
            for(int j=1;j<=logic;j++){
                System.out.print(logic);
            }
            System.out.println();
        }*/

        //Que.15=> print the pattern
         /*
        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1
        */
        //solve
        /*int n = 5;
        for (int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }*/

        //Que.16=> print the pattern
        /*
        1
        3 2
        6 5 4
        10 9 8 7
        */
        /*int n = 4;
        int num = 0;
        for (int i=1;i<=n;i++){
            //  int logic = 2*i-1;
            num+=i;
            int sum =num;
           for(int j=i;j>=1;j--){
               System.out.print(sum+" ");
               sum--;
           }
           System.out.println();
        }*/

        //Que.17=> print the pattern
         /*
                1 
              1 2 
            1 2 3 
          1 2 3 4 
        1 2 3 4 5
        */
        //solve
        /*int n = 4;
        int num = 0;
        for (int i=1;i<=n;i++){
           for(int j=n;j>i;j--){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
            System.out.print(j);
           }
           System.out.println();
        }*/

        //Que.18=> print the pattern
          /*
          ! Pascal’s triangle
        1 
        1 1 
        1 2 1 
        1 3 3 1 
        1 4 6 4 1
        1 5 10 10 5 1
        1 6 15 20 15 6 1
        1 7 21 35 35 21 7 1
        */
        //solve
        /*int n = 7;
        for (int i=0;i<=n;i++){
          int num = 1;
           for(int j=0;j<=i;j++){
               System.out.print(num+" ");
               num = num * (i-j)/(j+1);
           }
           System.out.println();
        }*/

        //Que.19=> print the pattern
        /*
        1 2 3 4 5 
        2 2 3 4 5
        3 3 3 4 5
        4 4 4 4 5
        5 5 5 5 5
        */
        //solve
        /*int n = 5;
        for (int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
            System.out.print(Math.max(i, j) + " ");
           }
           System.out.println();
        }*/
        //or
        // solve
    /*int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == j) {
          System.out.print(i + " ");
        } else if (i < j) {
          System.out.print(j + " ");
        } else {
          System.out.print(i + " ");
        }
      }
      System.out.println();
    }*/

        //Que.20=> print the pattern
        /*
        1 
        2 4 
        3 6 9 
        4 8 12 16 
        5 10 15 20 25 
        6 12 18 24 30 36 
        7 14 21 28 35 42 49 
        8 16 24 32 40 48 56 64
        */
        //solve
        /*int n = 8;
        for (int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            System.out.print(i*j+" ");
           }
           System.out.println();
        }*/

        //Que.21=> print the pattern
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        //solve
        /*int n = 5;
        for (int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            System.out.print(" ");
           }
           for(int j=n; j>=i; j--){
            System.out.print("*"+" ");
           }
           System.out.println();
        }*/

        //Que.22=> print the pattern
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         */
        //solve
       /*  int n = 7;
        for (int i=1;i<=n;i++){
           for(int j=n;j>=i;j--){
            System.out.print(" ");
           }
           for(int j=1; j<=i; j++){
            System.out.print("*"+" ");
           }
           System.out.println();
        }*/

        //Que.23=> print the pattern
        /*
         ****************
         *******__*******
         ******____******
         *****______*****
         ****________****
         ***__________***
         **____________**
         *______________*
         */
        //solve
        /*int n = 8;
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
        }*/

        //Que.24=> print the pattern
        /*
         1
        2 2
       3   3
      4444444
         */

       /* int n = 4;
        for(int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i+1;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                if (j==1 || i == n || j==(2*i-1)){
                    System.out.print(i);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        //Que.25=> print the pattern
        /*
         1
        1 1
       1 2 1
      1 3 3 1
     1 4 6 4 1
     */

      /*  int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.print("\n");
        }*/

        //Que.26=> print the pattern

            /*
      5 4 3 2 1 2 3 4 5
        4 3 2 1 2 3 4
          3 2 1 2 3
            2 1 2
              1
              */
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= n - i + 1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
