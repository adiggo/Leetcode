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
 
        if (points == null || points.length == 0)
            return 0;
        int max = 1; //record the value of max slope
        HashMap<Double, Integer> map = new HashMap<Double, Integer>();
        
        for (int i = 0; i < points.length; i++){
            int dup = 0;
            map.clear();
            map.put((double)Integer.MIN_VALUE, 1);
            int x = points[i].x;
            int y = points[i].y;
            for (int j = i+1; j < points.length; j++){
                double slope;
                if (points[j].x != x || points[j].y != y){
                    slope = getSlope(x, points[j].x, y, points[j].y);
                    if (map.containsKey(slope)){
                        map.put(slope, map.get(slope) + 1);
                    }else{
                        map.put(slope, 2);
                    }
                }
                else{
                    dup++;
                }
            }
            
            for (Integer k : map.values()){
                if (k + dup > max)
                    max = k+dup;
            }
        }
        return max;
        
    }
    
    public double getSlope(int x1, int x2, int y1, int y2){
        double slope = 0.0;
        if (x1 != x2)
            slope = 0.0 + (double)(y2 - y1) / (double)(x2 - x1);  // to solve 0.0 != -0.0 
        else if (y1 != y2)
            slope = (double)Integer.MAX_VALUE;
        return slope;
    }
}