public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> results=new ArrayList<String>();
        StringBuilder re=new StringBuilder();
        helper(results,re,n,0,0,0);
        return results;
    }
    public void helper(ArrayList<String> results, StringBuilder re, int n, int left, int right, int step){
        
        if(step==n*2){
            results.add(re.toString());
            return;
        }
        
        if(left<n){
            re.append('(');
            helper(results,re,n,left+1,right,step+1);
            re.deleteCharAt(step);
        }
        
        if(right<left){
            re.append(')');
            helper(results,re,n,left,right+1,step+1);
            re.deleteCharAt(step);
        }
    }
}