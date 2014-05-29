public ArrayList<Integer> grayB(int N){
        ArrayList<Integer> numResult = new ArrayList<Integer>();
        ArrayList<String> result = new ArrayList<String>();  
        gray(N, “”, result);
            for (String s : result){
                numResult.add(binToDeci(s));
            }
        return numResult;
}

public void gray(int n, String prefix, ArrayList<String> result){

    if (n == 0) result.add(prefix);
        
        
        grayhelper(result, n - 1,prefix + “1”);
            gray(n -1, prefix + “0”, result);
}

public void grayhelper(ArrayList<Integer> result, int n, String prefix ){
        if (n == 0) return result.add(prefix);// condition to back
            grayhelper(result, n-1,prefix + “0”);
            gray(n-1, prefix + “1, result);
}
//convertion
public int binToDeci(String s){
  int decimalValue = Integer.parseInt(s, 2);
      return decimalValue;
}
