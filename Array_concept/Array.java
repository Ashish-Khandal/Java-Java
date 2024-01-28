package Array_concept;

public class Array {
    public static void main(String[] args) {
        int sum = 0;
        //! first method
//?        int[] arr = new int[5];
//?         arr[0] = 10;
//?         arr[0] = 20;
//?         arr[1] = 30;
//?         arr[2] = 40;
//?         arr[3] = 50;

        //! Second method
//?        int[] arr = new int[]{10,20,30,40,50};

        //! third method

        int[] arr = {10,20,30,40,50};
        for(int i=0; i<arr.length; i++){
             sum += arr[i];
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Sum of array:- "+ sum);
    }
}