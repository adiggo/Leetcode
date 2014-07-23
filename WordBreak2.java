/**
 *
 *
 *
 *First check whether the dict can string s; 
 *
 *
 */





public class WordBreak2 {
    public ArrayList<String> wordBreak(String s, Set<String> dict) {
        //result hold all the combination 
        ArrayList<String> ret = new ArrayList<String>();
        if (s==null || s.length()==0) return ret;
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for (int i=1; i<=n; i++) {
            if (dict.contains(s.substring(0, i))) {
                dp[i] = true;
                continue;
            }
            for (int j=0; j<i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                }
            }
        }
        if (dp[n] == false) return ret;   // judge whether there are some combination in the dict. 
        StringBuilder cur = new StringBuilder();
        dfs(s, 0, cur, ret, dict);
        return ret;
    }

    public void dfs(String s, int start, StringBuilder cur, ArrayList<String> ret, Set<String> dict)  {
        int n = s.length();
        if (start == n) {
            // remember to new a cur
            // if not, then next time, you change the cur, the content in the array will be changed.
            ret.add(new String(cur));
            return;
        }

        for(int i = start+1; i <= n+1; i++){
            //since the index will not able to be out of the range
            //we don't need to worry about it.

            if (dict.contains(s.substring(start, i))){
                int oldLength = cur.length();
                //add " ", then string
                if (oldLength != 0)
                    cur.append(" ");   
                
                cur.append(s.substring(start, i));
                dfs(s, i, cur, ret, dict);
                // this step is important to get back to previous state.
                cur.delete(oldLength, cur.length());


    }
}
