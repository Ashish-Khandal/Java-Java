package Java_concept;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*System.out.print("Enter your number:-");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Your number is 'EVEN' ");
        }else{
            System.out.println("Your number is 'ODD' ");
        }
        System.out.println("Thanks! Have you good day.");*/



        /* // Enter 3 numbers from the user & make a function to print their average

        System.out.print("Enter your three numbers :-");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        System.out.println("Average :-"+(number1+number2+number3)/3);*/
        


        /*  // Write a function to print the sum of all odd numbers from 1 to n

        System.out.print("Enter your number :-");
        int n = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i=1; i<=n; i++){
                if(i%2!=0){ 
                    sum1 = sum1 + i;
                }else{
                    sum2 = sum2 + i;
                }
            }
            System.out.println("Sum of odd numbers :-"+sum1);
            System.out.println("Sum of even numbers :-"+sum2);
        System.out.println("Sum of total numbers :-"+(n*(n+1))/2); */


        /*// Write a function which takes in 2 numbers and returns the greater of those two.

        System.out.println("Enter your two numbers :-");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1<num2){
            System.out.println("Your greater number :- "+ num2);
        }else{
            System.out.println("Your greater number :- "+ num1);
        } */



       /* //Write a function that takes in the radius as input and returns the circumference of a circle.

        System.out.println("Enter your circle redius :-");
        int redius = sc.nextInt();
        float circumference = (float) (2*3.14*redius);
        System.out.println("Your circle cirumference = "+  circumference); */


        /*// Write a function that takes in age as input and returns if that person is eligible
        // to vote or not. OOPsWithJava.A person of age > 18 is eligible to vote.

        System.out.println("Enter your age then I am find, you are adult or not adult for vote :- ");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("Sorry! You are not adult for vote.");
        }else{
            System.out.println("Good! You are adult for vote.");
        } */


        /*// Write an infinite loop using do while condition

        do{}while(true); */


          /*  // Write a program to enter the numbers till the user wants and at the end it
           //should display the count of positive, negative and zeros entered.
           
           int positive = 0 , negative = 0 , zeros = 0;
           System.out.print("Press 1 to continue & 0 to stop:- ");
           int input = sc.nextInt();
           while(input == 1) {
           System.out.print("Enter your number :- ");
           int number = sc.nextInt();
           if(number > 0) {
           positive++;
           } else if(number < 0) {
           negative++;
           } else {
           zeros++;
           }
           System.out.println("Press 1 to continue & 0 to stop");
           input = sc.nextInt();
           }
           System.out.println("Positives : "+ positive);
           System.out.println("Negatives : "+ negative);
           System.out.println("Zeros : "+ zeros); */

           

        //    int sub1 = sc.nextInt();
        //    int sub2 = sc.nextInt();
        //    int sub3 = sc.nextInt();
        //    float total = (sub1+sub2+sub3)/3f;
        // //    int subject = sub1<33 && sub2<33 && sub3<33;
        //    if(total>=44f && sub1>=33 && sub2>=33 && sub3>=33){
        //     System.out.println("You are pass and your percentage :- "+total+"%");
        //    }else{
        //     System.out.println("You are fail !");
        //    }


        // int marks = sc.nextInt();
        // switch(marks){
        //     case 1 : System.out.println("m");
        //     break;
        //     case 2 : System.out.println("n");
        //     break;
        //     case 3 : System.out.println("o");
        //     break;
        //     default : System.out.println("Not valid");
        // }
         
        //Total days in switch case.
        System.out.println("Enter your day number(1-7) :-");
        int a = sc.nextInt();
        while (a<7) {

            switch (a) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Fridaty");
                    break;
                case 6:
                    System.out.println("Saturaday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invaid number");
                    a++;
            }
        }

       /* int year = sc.nextInt();
        if(year%4==0){
            System.out.println("This year is a lipe year");
        }else{
            System.out.println("This year is a normal year");
        }  */

        // String web =sc.nextLine();
        // if(web.endsWith(".com")){
        //     System.out.println("This is a commarcal websides");
        // }else if(web.endsWith(".org")){
        //     System.out.println("This is a orgenaizational websides");
        // }else if(web.endsWith(".in")){
        //     System.out.println("This is a indian websides");
        // }else{
        //     System.out.println("Not valid");
        // }


       //print n natural number use for do while loop.
       /* int m = 0;
       int n =sc.nextInt();
       do{
        System.out.println(m);
        m++;
       }while(m<=n); */


       /* // print n odd number use for 'for loop'.
         int n = sc.nextInt();
         for(int i=0; i<=n; i++){
      
        if(i%2!=0){
            System.out.print(i);
        }else{
            System.out.print(" ");
        }
        } */
                        //or
         /* //new method:-
        // System.out.print(2*i+1+" ");*/



        /*
        //print this statemant 

        //  ****
        //  ***
        //  **
        //  *
               //solve
        int n = sc.nextInt();
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        } */

    //   int n=sc.nextInt();
    //   for(int i=10; i>=1; i--){
    //     System.out.println(i*n);
    //   }
          
        /*//use for loops and find for factorial 
          int n =sc.nextInt();
          int m=1;
          for(int i=n; i>0; i--){
            m=m*i;
            // System.out.println(m);  
          }
          System.out.println(m); */

       /*//sum of 8th table 
         int n = 8;
          int sum = 0; 
          for(int i=1; i<11; i++){
            sum = sum + (n*i);
            System.out.print(i*n+"+");
           
          }
          System.out.print("=");
          System.out.println(sum); */

          // print the array for reverse oder
          /*  int n [] = {49,39,24,96,68,57,58,99,28,53};
          for(int i=n.length-1; i>=0; i--){
            System.out.print(n[i]+" ");
          }
          System.out.println();
          System.out.println(n.length); */

        //   int n [] = {49,39,24,96,68,57,58,99,28,53};
        //   System.out.println(n[4]);
        //   for(int i : n ){
        //     System.out.println(i);
        //   }

        //sum of 5 floats value 
        /*float [] f ={12.2f,42.5f,23.65f,675.45f,73.54f};
        float m = 0f;
        for(int i=0; i<f.length; i++){
            m = m + f[i];
            // System.out.println(f[i]);
        }
        // System.out.println(12.2f+42.5f+23.65f+675.45f+73.54f);
        System.out.println(m); */


       //find the value of present or not present an array.
       /*float [] p ={12.2f,42.5f,23.65f,675.45f,73.54f};
        boolean value = false;
        System.out.print("Enter your array number:-");
        float number = sc.nextFloat();
        for(float ele :p){
            if(number==ele){
               value = true;
            }
        }
        if(value){
            System.out.println("The number is present this array.");
        }else{
            System.out.println("The number is not present this array.");
        } */

        //print the average marks for an array?
        /* float [] p ={12.2f,42.5f,23.65f,675.45f,73.54f};
        float sum = 0;
        for(float ele :p){
            sum = sum + ele;
        }
        System.out.println("average marks:-"+sum/p.length); */

        // 
    }
}
