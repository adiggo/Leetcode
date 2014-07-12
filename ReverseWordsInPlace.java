
public class ReverseWordsInPlace{

    public String reverseWords(String s){
        if (s == null || s.length() == 0)
            return null;
        s.trim();
        if (s == null || s.length() == 0)
            return null;
        char[] input = s.toCharArray();
        int length = 0;
        int startIndex = 0;
        while(length < input.length){
            length++;
            
            if (input[length] == ' '){
                reverse(input, startIndex, length);
                startIndex = length+1;
            }
        }
        reverse(input, startIndex, length);
    }

    private static void reverse(char[] input, int startIndex, int endIndex){
        while(startIndex < endIndex){
            char tmp = input[startIndex];
            input[startIndex] = input[endIndex];
            input[endIndex] = tmp;
            startIndex++;
            endIndex--;
        }
    }
}






