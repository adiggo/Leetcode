import java.util.*;
public class GenerateRandomZeroOne{
    ArrayList<String> result = new ArrayList<String>();
    public static ArrayList<String> generate(String s){
     
        if (s==null || s.length()==0){
            return result;
        }
        char[] c = s.toCharArray();
            
        dfs(c, result, 0);
        System.out.println(result.size());
        return result;
    }

    private static void dfs(char[] c, result, int step){
        //edge condition
        if (step == c.length){
            String output = new String(c);
            result.add(output);
            System.out.println("check");
        }

        if (c[step] == '?'){
            c[step] = '0';
            dfs(c, result, step+1);
            c[step] = '1';
            dfs(c, result, step +1);
        }
    }
    public static void main(String[] args){
        ArrayList<String> output = new ArrayList<String>();
        output = generate("1?");
        System.out.printf(output.get(0));

    }
}
