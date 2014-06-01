
public class IntegerToRoman2{
    
    public int intToRom(int num){
        char symbol[7] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        StringBuilder roman = new StringBuilder();

        int scale = 1000;
        for (int i = 6; i >= 0; i-=2){
            int digit = num/scale;
            if (digit != 0){
                if (digit <= 3){
                    roman.append(digit, symbol[i]);
                }
                else if (digit == 4){
                    roman.append(1, symbol[i]);
                    roman.append(1, symbol[i+1]);
                }else if (digit == 5){
                    roman.append(1, symbol[i+1]);
                }
                else if (digit <= 8){
                    roman.append(1, symbol[i+1]);
                    roman.append(digit-5, symbol[i]);
                }else if (digit == 9){
                    roman.append(1, symbol[i]);
                    roman.append(1, symbolol[i+2]);
                }
            }
            num = num % scale;
            scale/=10;
        }
        return roman.toString();
    }
}
