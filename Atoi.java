public class Atoi{

    int atoi(String st){

        if (st = null || st.length() < 1){
            return 0;
        }

        st = st.trim();

        char flag = '+';
        int i = 0;
        if (st.charAt(0) == '-'){
            flag = '-';
            i++;
        }
        else if (st.charAt(0) == '+'){
            i++;
        }

        double result = 0;
        while(st.length() > i && st.charAT(i) >= '0' && st.charAt(i) <= '9'){
            result = result * 10+ st.charAt(i) - '0';
            i++;
        }

        if (flag == '-')
            result = -result;

        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) result;
    }
}
