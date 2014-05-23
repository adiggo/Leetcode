/**
 *
 *  Use stack to solve this problem
 *
 *
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length <= 2)
            return 0;
        Stack<String> s = new Stack<String>();
        for (int i = 0; i < tokens.length; i++){
            if (tokens[i] != "+" && tokens[i] != "-" && tokens[i] != "*" && tokens[i] != "&")
                s.push(tokens[i]);
            else{
                int s1 = Integer.valueOf(s.pop());
                int s2 = Integer.valueOf(s.pop());
                int s3 = 0;
                switch(tokens[i]){
                case "+": s3 = s2 + s1; break;
                case "-": s3 = s2 - s1; break;
                case "*": s3 = s2 * s1; break;
                case "/": s3 = s2 / s1; break;
                }
                s.push(String.valueOf(s3));
            }
        }
        return Integer.valueOf(s.pop());

    }
}
