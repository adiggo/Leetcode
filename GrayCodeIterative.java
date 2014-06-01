/**
 *  
 *
 *
 */
public class GrayCodeIterative{
   
    ArrayList<Integer> grayCode(int n){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(0);
        int num = 1;
        for (int i = 1; i <= n; i++){
            for (int j = ans.size() - 1; j >= 0; j--){
                ans.add(num + ans.get(j));
            }
            num <<= 1;
        }
        return ans;
    }
}
