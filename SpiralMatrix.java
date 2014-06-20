public class SpiralMatrix {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> result=new ArrayList<Integer> ();
        
        if (matrix==null|| matrix.length==0){
            return result;
        }
        
        int beginX=0;
        int endX=matrix[0].length-1;
        
        int beginY=0;
        int endY=matrix.length-1;
        
        while(true){
            for (int col=beginX; col<=endX; col++){
                result.add(matrix[beginY][col]);
            }
            if (++beginY>endY){
                break;
            }
            
            for (int row=beginY; row<=endY; row++){
                result.add(matrix[row][endX]);
            }
            if (--endX<beginX){
                break;
            }
            for (int col=endX; col>=beginX; col--){
                result.add(matrix[endY][col]);
            }
            if (--endY<beginY){
                break;
            }
            for (int row=endY; row>=beginY; row--){
                result.add(matrix[row][beginX]);
            }
            if (++beginX>endX){
                break;
            }
        }
        return result;
    }
}
