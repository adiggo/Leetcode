public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
      ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
      if (num.length == 0)
         return res;
      Arrays.sort(num);
      ArrayList<Integer> r = new ArrayList<Integer>();
      dfs(num, target, res, r, 0);
      return res;
        
    }
    
    void dfs(int[] num, int target, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> r, int st){
        
        if (target < 0){
            return;
        }else{
            if (target == 0){
                ArrayList<Integer> temp = new ArrayList<Integer>(r);
                res.add(temp);
            }else{
                int pre = -1;
                for (int i = st; i<num.length; i++){
                    if (num[i] != pre){
                        r.add(num[i]);
                        dfs(num, target-num[i], res, r, i+1);
                        pre = num[i];
                        r.remove(r.size()-1);
                    }
                }
            }
        }
        
    }
    
}
