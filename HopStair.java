/**
 *
 *  HopStair step one, two or three.
 *  Howeverit is inefficient, since it does need to duplicate calculation each time.
 *
 */
public class HopStair{
    
   public int count(int n){     
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else
            return count(n-1)+count(n-2)+count(n-3);
   }
}
