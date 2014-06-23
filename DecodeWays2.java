public class DecodeWay2{

    int decode(String s){
        if (s == null || s.length() == 0)
            return 0;

        if (s.charAt(0) == '0')
            return 0;

        int[] record = new int[s.length() + 1];
        
        if (s.length() == 1){
            if (s.charAt(0)!= '0'){
                return 1;
            }
        }
        for (int i = 2; i <= s.length(); i++){
            if (s.substring(i-1, i) != '0'){
                record[i] = record[i-1];
            }

            if (s.charAt(i-2) != '0' && Integer.parseInt(s.substring(i-2,i)<=26)){
                record[i] += record[i-2];
            }
            
        }
        return record[s.length()];
    }
}





