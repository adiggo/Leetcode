/**
 *
 *To avoid using linear space, we need to get its last and first by using getting its highest rank
 *so we use division to get its highest rank.
 *
 *
 *
 */


public class PalindromeNumber{

    public boolean isPalindrome(int x){

        if (x < 0){
            return false;
        }
        int div = 1;
        //get hightest rank
        while(x/div >= 10){
            div *= 10;
        }

        int rem = 0;
        int high = 0;

        while(x > 0){
            rem = x%10;
            high = x/div;

            if (rem != high){
                return false;
            }

            x = x% div/10;
            div = div / 100;
            
        }

        return true;
    }
}


