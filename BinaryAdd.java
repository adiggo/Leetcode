import java.util.*;
public class BinaryAdd {

    public static void main(String[] args){
        String out = addBinary("1", "1");
        System.out.printf(out);
    }
    public static String addBinary(String a, String b) {
        // apply "^"
        // be careful of edge case
        int la = a.length();
        int lb = b.length();
        int max_length = Math.max(la, lb);
        int helper = 0;
        int tempHelper = 0;
        
        ArrayList<Integer> t = new ArrayList<Integer>();
        
        StringBuilder s = new StringBuilder();
        int i = max_length-1;
        while(i >= 0){
             int num_b = getNumber(i-(max_length-lb), b);
             int num_a = getNumber(i-(max_length-la), a);
            String out =  String.valueOf(num_b);
             System.out.printf(out);
            int temp = helper ^ num_b;
          //  System.out.println(temp);
            int newNum = temp ^ num_a;
            t.add(newNum);
            if ((num_a == 1 && num_b == 1) || ((num_a ==1 || num_b ==1) && helper == 1))
                helper = 1;
            else 
                helper = 0;
            i--;
        }
        if (helper == 1){
            t.add(helper);
        }
        for (int j = t.size()-1; j >= 0; j--){
            s.append(t.get(j));
        }
        return s.toString();
    }
    
    private static int getNumber (int i ,String s){
        if (i >= 0){
            return (int) (s.charAt(i)-'0');
        }
        else
            return 0;
    }
    
}