public class Solution {
    public String reverseWords(String s) {
        // for a input string s
        if (s == ""){
            return s;
        }
        
        // to delete the leading and trailing space
        s = s.trim();
        StringBuilder re = new StringBuilder();
        // and since the space is returned just one space between each word
        // so we need to have some condition check on space
        
        // can be applied with stacks with the property: first in last out.
        Stack<String> stack = new Stack<String>();
        // need to know every first element end with space and the last element start from space.
        
        // j is a recorder.
        int j = 0;
        int k =0;
        int i;
        for (i=0; i<s.length(); i++){
            
            if (s.charAt(i)==' '){
                if (k>=1){
                    stack.push(s.substring(i-k,i));  
                }
                k=0;
                ++j;
                if (j==1){
                    stack.push(" ");
                }
                
            }else{
                j=0;
                ++k;
            }
            
        }
        stack.push(s.substring(i-k,i));
        
        while(!stack.isEmpty()){
            re.append(stack.pop());
        }
        
        return re.toString();
        
    }
}