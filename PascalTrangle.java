/**
 *
 *
 * PascalTriangle provides the method to get the PascalTriangle output arraylist with a input number of rows
 * The basic idea is simple: use iteration to add arraylist into result;
 * For each iteration, it needs to new a ArrayList, and insert 1 into it.If the length
 * is larger than 1, then it also need to insert 1 to the tail of the ArrayList,the middle
 * elements should be inserted with n-1 row element l + element l+1; 
 */

public class PascalTriangle{
    public ArrayList<ArrayList<integer>> generate(int numRows){    
        public ArrayList<ArrayList<Integer>> re = new ArrayList<ArrayList<Integer>>();
        if (numRows == 0)
            return re;

        for (int i = 0; i < numRows; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(1);

            if (i > 0){
                for (int j = 0; j < re.get(i-1).size()-1; j++){
                    temp.add(re.get(i-1).get(j) + res.get(i-1).get(j+1))
                }

                temp.add(1);
            }
            re.add(temp);
        }
        return re;
   }   
}
