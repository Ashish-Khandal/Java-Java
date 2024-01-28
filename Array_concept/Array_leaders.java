package Array_concept;

public class Array_leaders {
    public static void main(String[] args) {
        /*
         * //! leader element in an array is set to be a leader if it is greater than and
         * //!  equal to all the elements present on its right side in an array.
         * //!  Right most element is always a leader.
         */
        int[] arr = { 3, 2, 5, 4, 1 };
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[i]) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
