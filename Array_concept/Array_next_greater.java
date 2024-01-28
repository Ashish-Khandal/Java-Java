package Array_concept;

public class Array_next_greater {
    public static void main(String[] args) {
        //! Next greater element of an element A is the first greater element present on the right side of element A.
        int[] arr = {3, 1, 2, 5, 4};
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    System.out.println(arr[i]+"->"+arr[j]);
                    found = true;
                    break;
                }
            }
            if (found == false) {
                System.out.println(arr[i]+"->-1");
            }
        }
    }
}
