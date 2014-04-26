public class ScrambleString{
    public static boolean isScramble(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        if (s1.length()==1 && s2.length() == 1)
            return s1.charAt(0) === s2.charAt(0);

        char[] s1array = s1.toCharArray();
        char[] s2array = s2.toCharArray();
        Arrays.sort(s1array);
        Arrays.sort(s3array);

        if (! new String(s1array).equals(new String(s2array))){
            return false;
        }

        for (int i=1; i<s1.length(); i++){
            String s11 = s1.substring(0, i);
            String s12 = s1.substring(i);
            String s21 = s2.substring(0, i);
            String s22 = s2.substring(i);

            if (isScramble(s11, s21) && isScramble(s21, s12)){
                return true;
            }
            s21 = s2.substring(0, s2.length() - i);
            s22 = s2.substring(s2.length() - i);
            if (isScramble(s11, s22) && isScramble(s12, s21)){
                return true;
            }
        }
        return false;
        }
    }
}
