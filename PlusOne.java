
public class PlusOne{

    int[] plusOne(int[] digits){
        int carry = 1, sum = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = digits.size() -1; i >= 0; i--){
            sum = carry + digit[i];
            carry = sum / 10;
            array.add(sum % 10);
        }
        
        int[] result = new int[digits.length + 1];
        if (carry > 0)
        {
            result[0] = carry;
        }
        for (int i = 0; i < array.size(); i++){
            result[i+1] = array.get(i);
        }

        return result;
    }
}
