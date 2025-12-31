class Solution {
    public String longestCommonPrefix(String[] strs) {
        // edge case
        if (strs == null || strs.length == 0) {
            return "";
        }

        // take first string as prefix
        String prefix = strs[0];

        // compare with remaining strings
        for (int i = 1; i < strs.length; i++) {
            // reduce prefix until it matches
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
