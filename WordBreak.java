public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        //this means if true, o to i-1 string can be divided
        boolean[] t = new boolean[s.length()+1];
        t[0] = true;
        
        for (int i = 0; i < s.length(); i++){
            if (!t[i]) 
                continue;
                
            // if current is divisible, then we can talk about next step
            for (String cur : dict){
                
                int end = i + cur.length();
                if (end > s.length())
                    continue;
                if (t[end])
                    continue;
                // can't use == here, since it  == checks reference
                if (s.substring(i, end).equals(cur)){
                    t[end] = true;
                }
            }
            
            
        }
        return t[s.length()];
    }
}