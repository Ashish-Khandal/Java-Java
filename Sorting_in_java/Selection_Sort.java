package Sorting_in_java;
public class Selection_Sort {
    public static void Abc(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        //? int[] arr  = new int[]{7,8,3,1,2};

        //!  Time complexity = O(n^2) 

        int[] arr  = {7,8,3,1,2,4,6,5};
        //Selection sort
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        Abc(arr);
    }
}
