class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        long sum = 0;
        while (x > 0) {
            int r = x % 10;
            sum = (sum + r) * 10;
            x /= 10;
            System.out.print(sum + " ");
        }
        sum /= 10;
        return copy == sum;
    }
}

public class LeetcodeTest {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(1000000001));
    }
}
