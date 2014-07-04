import java.util.ArrayList;
public class GenerateLowerCaseAndCapitalCase{

    public ArrayList<String> getPermurtarion(String s){
        
        ArrayList<String> result = new ArrayList<String>();
        char[] c = s.toCharArray();
        for (int i = 0, n = (int) Math.pow(2, c.length); i < n; i++) {
            char[] permutation = new char[c.length];
            for (int j = 0; j < c.length; j++){
                permutation[j] = (isBit()i, j) ? Character.toUpperCase(c[j]) : c[j];
            }
            result.add(new String(permutation));
        }
    }
    /**
     * 
     *n denotes the input number, k denotes the digit location.
     *we can judge whether the digit of the input at the location is 0 or 1;
     */
    static boolean isBit(int n , int k){
        return (n >> k & 1) != 0;
    }
}
