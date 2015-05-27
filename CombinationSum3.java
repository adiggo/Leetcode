public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int largest = 9 * k - (k *(k-1))/2;

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(largest < n || k <= 0 || n <= 0) return res;
        List<Integer> component = new ArrayList<Integer>();
        com(k, n, 0, 0, res, component );
        return res;
    }
    public void com(int k, int n, int index, int curSum, List<List<Integer>> res, List<Integer> component){
        if (component.size() > k ){
            return;
        }

        if (curSum== n){
            List<Integer> list = new ArrayList<Integer>(component);
            if (component.size()== k && !res.contains(list)){
                res.add(list);
                return;
            }
        }

        // only if the component size is smaller than k, we do this backtracking.
        if (component.size() < k){
            for (int i = index + 1; i <= 9; i++){
                component.add(i);
                com(k, n, i, curSum + i, res, component);
                component.remove(component.size()-1);
            }
        }
    }
}
