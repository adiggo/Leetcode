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
