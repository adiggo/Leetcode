/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public int maxPoints(Point[] points) {
        // edge case
        if (points == null || points.length == 0)
            return 0;
        
        HashMap<Double, Integer> map = new HashMap<Double, Integer>();
        int max = 1;
        
        for (int i = 0; i < points.length; i++){
            //clear map in each outer loop
            map.clear();
            //if the number are all same
            map.put((double)Integer.MIN_VALUE, 1);
            int dup = 0;
             // j should start from i+1, so that the run time can be optimized   
            for (int j = i+1; j < points.length; j++){
                //duplicate need to be treated
                if (points[i].x == points[j].x && points[i].y == points[j].y){
                    dup++;
                    continue;}
               // get the key from max or slope
                double key = points[i].x == points[j].x ? Integer.MAX_VALUE : 0.0+(double) (double)(points[j].y-points[i].y)/(double)(points[j].x-points[i].x);
                if (map.containsKey(key))
                    map.put(key, map.get(key)+1);
                else
                    map.put(key, 2);
            }
         
            for (Integer k : map.values()){
                if (k + dup > max)
                    max = k + dup;
            }
            
        }
        
        return max;
        
        
    }
}