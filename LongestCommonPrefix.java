public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = new String();
        if(strs.length > 0)
            prefix = strs[0];
        for(int i = 1; i < strs.length; ++i) {
            // use prefix to compare with strings.
            String s = strs[i];
            int j = 0;
            for(; j < Math.min(prefix.length(), s.length()); ++j) {
                if(prefix.charAt(j) != s.charAt(j)) {
                    break;
                }
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}