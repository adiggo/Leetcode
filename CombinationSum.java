public class CombinationSum {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        
        if (candidates==null || candidates.length==0|| target<0){
            return result;
        }
        
        Arrays.sort(candidates);
        
        int start=0;
        ArrayList<Integer> current=new ArrayList<Integer>();
        buildResult(candidates, start, current, target, result);
        
        return result;
    }
    
    private void buildResult(int[] candidates, int start, ArrayList<Integer> current, int target, ArrayList<ArrayList<Integer>> result){
        
        if (target==0){
            ArrayList<Integer> temp=new ArrayList<Integer>(current);
            result.add(temp);
            return;
        }
        
        for (int i=start; i<candidates.length; i++){
            if (target-candidates[i]<0){
                return;
            }
            
            current.add(candidates[i]);
            buildResult(candidates, i,current, target-candidates[i], result );
            current.remove(current.size()-1);
        }
    }
}