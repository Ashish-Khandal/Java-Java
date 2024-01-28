package Array_concept;

public class Array_mejority {
    public static void main(String[] args) {
        //! Majority element in an array is a maximum number time
        int[] arr = {3, 2, 1, 5, 1, 1, 3};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                System.out.println(arr[i]);
                break;
            }
        }
        if (count < arr.length / 2) {
            System.out.println("Not majority element.");
        }
    }
}
