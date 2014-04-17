public class Solution {
      public ArrayList<Integer> findSubstring(String S, String[] L) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(L==null || L.length==0) return null; 
        int n = L.length, m = L[0].length(), l=S.length();
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        Map<String,Integer> covered = new HashMap<String,Integer>();
        for(int j=0;j<n;j++){
            if(covered.containsKey(L[j])){
                covered.put(L[j],covered.get(L[j])+1);
            }else{
                covered.put(L[j], 1);
            }
        }
        
        int i=0;
        // if less than n*m, there must be not exist a substring can match the condition
        while(l-i>=n*m){
            //count of String and Integer
            Map<String, Integer> temp = new HashMap<String, Integer>(covered);
            for(int j=0;j<n;j++){
                //get substring from each position
                // i start from 0
                String testStr = S.substring(i+j*m,i+(j+1)*m);
                // remove string[x] if exist in the hashmap
                if(temp.containsKey(testStr)){
                    if(temp.get(testStr)-1==0)
                        temp.remove(testStr);
                    else
                        temp.put(testStr,temp.get(testStr)-1);
                }else
                    // if there is one not met the condition, break, go to next level i
                    break;
            }
            if(temp.size()==0) res.add(i);
            i++;
        }
        return res;    
    }
}