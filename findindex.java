class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        // loop until remaining length is enough to match needle
        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            // check characters one by one
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // matched full needle
            if (j == m) {
                return i;
            }
        }

        // not found
        return -1;
    }
}
