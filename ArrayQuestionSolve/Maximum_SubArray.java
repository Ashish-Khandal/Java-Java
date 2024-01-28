package ArrayQuestionSolve;

public class Maximum_SubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(printMaxSubArray(arr));
    }

    public static int printMaxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currantValue = 0;
        for (int i = 0; i < arr.length; i++) {
            currantValue = currantValue + arr[i];
            if (currantValue > maxSum) {
                maxSum = currantValue;
                System.out.println(maxSum);
            }
            if (currantValue < 0) {
                currantValue = 0;
            }
        }
        return maxSum;
    }
}
