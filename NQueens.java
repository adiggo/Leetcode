public class Solution {
    public ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> res = new ArrayList<String[]>();
        int[] loc = new int[n];
        dfs(res,loc,0,n);
        return res;
    }
    
    public void dfs(ArrayList<String[]> res, int[] loc, int cur, int n){
        if (step == n)
            print(res, loc, n)
        else{
            for(int i = 0; i < n;i++){
                loc[cur] = i;
                if (isValid(loc, cur))
                    dfs(res,loc,cur+1,n);
            }
        }
    }
    
    public boolean isValid(String[] loc, int cur){
        for (int i = 0; i < cur; i++){
            if (loc[i] == loc[cur] || Math.abs(loc[i] - loc[cur]) 
            == Math.abs(cur - i)){
                return false;
            }
        }
        return true;
    }
    
    public void print(ArrayList<String[]> res, int[] loc, int n){
        String[] ans = new String[n];
        for(int i=0;i<n;i++){
            String row = new String();
            for(int j=0;j<n;j++){
                if(j==loc[i]) row += "Q";
                else row += ".";
            }
            ans[i] = row;
        }
        res.add(ans);
    }
}
