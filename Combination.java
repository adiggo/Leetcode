// this problem best solved by recursion. 
// for example, if solving use iterative, 
// then we can figure out we should make a 
// k length list which contains integers. 


public class Combination{

    // use recursiont to solve this problem
    // use iterative method also can solve this problem. 

    List<List<Integer>> combine(int n, int k){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> solution = new ArrayList<Integer>();
        combineHelper(n, k, 1, solution, result);
        return result;
    }


    void combineHelper(int n, int k, int step, List<Integer> solution, List<List<Integer>> result){
        if (solution.size() == k){
            result.add(new ArrayList<Integer>(solution));
            return;
        }

        for (int i = step; i <= n; i++){
            solution.add(i);
            combineHelper(n, k, step+1, solution, result);
            solution.remove();

        }
    }
}

