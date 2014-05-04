/**
 * This class provides method for make decision whether a string is valid palindrom
 *
 * @author Xiaoping Li
 *
 */
public class ValidPalindrom{
  /**
   * there is another method to solve this proble: which takes constant space complexity
   * first check whether the length of string is even or odd, then go to next step.
   */
    public boolean isValud(String s){
   
    // replace other character with "" in regular expression
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // empty or length()==1 true
        if (s.length() < 2)
            return true;
        
        Stack<Character> stack = new Stack<Character>();
        
        int index = 0;
        while(index < len/2){
            stack.push(s.charAt(index));
            index++;
        }
        //jump out of the index
        if (len % 2 == 1)
            index++;
        while (index < len){
            if (stack.empty())
                return false;

            char temp = stack.pop();
            if (s.charAt(index) != temp)
                return false;

            else
                index++;
        }
        return true;
    }
}
