public class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int pop = x % 10;  // get last digit
            x /= 10;

            // Check for overflow before multiplying by 10
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;

            rev = rev * 10 + pop;
        }

        return rev;
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverse(123));   // 321
        System.out.println(sol.reverse(-123));  // -321
        System.out.println(sol.reverse(120));   // 21
        System.out.println(sol.reverse(0));     // 0
    }
}
