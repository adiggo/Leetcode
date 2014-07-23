/**
 *
 *
 *  This class contains the mehtod to solve word break; 
 *  It will return a boolean type to check whether the words in the dict can form the input word;
 *  Build a boolean array whose length is length+1. 
 *
 *
 */



public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        //this means if true, o to i-1 string can be divided
        boolean[] t = new boolean[s.length()+1];
        t[0] = true;
        
        for (int i = 0; i < s.length(); i++){
            if (t[i] != true) 
                continue;
                
            // if current is divisible, then we can talk about next step
            for (String cur : dict){
                
                int end = i + cur.length();
                //edge case need to be checked here.
                //suppose the string is leetcode, then what you have is leet codes. then its length longer than provided,
                //so it will skip
                if (end > s.length())
                    continue;

                if (t[end] == true)
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
