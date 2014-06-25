/**
 *
 *  Use recursion to solve this problem.
 *
 */


class Solution {
    ArrayList<String> result;
    public ArrayList<String> restoreIpAddresses(String s) {
        result = new ArrayList<String>();
        if (s.length() > 12)
            return result;

        f(4, s);
        return result;
    }

    public ArrayList<String> f(int num, String s) {
        ArrayList<String> list = new ArrayList<String>();
        if (num == 0) {
            if (s.length() == 0)
                list.add("");
            return list;
        }
        for (int i = 1; i <= 3 && i <= s.length(); i++) {
            String firstStr = s.substring(0, i);
            int val = Integer.parseInt(firstStr);
            if (val > 255 || (firstStr.charAt(0) == '0' && i > 1))
                continue;

            for (String str : f(num - 1, s.substring(i))) {
                String newStr = firstStr + "." + str;
                // delete the "." in the end:
                if (num == 4) {
                    newStr = newStr.substring(0, newStr.length() - 1);
                    result.add(newStr);
                }
                list.add(newStr);
            }
        }
        return list;
    }
}
