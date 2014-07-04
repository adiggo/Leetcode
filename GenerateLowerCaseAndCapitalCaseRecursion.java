import java.util.ArrayList;
public class GenerateLowerCaseAndCapitalCaseRecursion{
    
    public ArrayList<String> getPermutation(String s){
        ArrayList<String> result = new ArrayList<String>();
        if (s == null || s.length() == 0)
            return result;

        char[] c = s.toCharArray();
        dfs(c, result, 0, "");
        return result;
    }

    private static void dfs(char[] c, ArrayList<String> result, int step, String temp){
        
        if (temp.length() == c.length){
            result.add(temp);
            return;
        }
        
        dfs(c, result,step+1, temp+=c[step]);
        
        dfs(c, result, step+1, temp+=Character.toCharArray(c[step]));
    }
}

