/**
 *
 *  lengthOfLongestSubstring---> get the length from a string where no duplicate char happens
 *  And used constant space and linear time
 *
 */

public class LongestSubstringWithoutRepeatingCharacters{

    public int lengthOfLongestSubstring(String s){
        
        boolean[] flag = new boolean[256];

        char[] c = s.toCharArray();
        int i = 0, j = 0; res = 0;

        while(i < c.length){
            if (flag[c[i]] == true){
                res = Math.max(i - j, res);
                // reset flag 
                for (int k = j; k < i; k++){
                    if (c[k] == c[i]){
                        // update j, next length record from here
                        // and we can break the loop here.
                        j = k+1;
                        break;
                    }
                    flag[c[k]] = false;
                }
            }else{
                flag[c[i]] = true;
            }
            i++;
        }
        //confirm the edge case
        res = Math.max(c.length - j, res);
        return res;
    }
}

