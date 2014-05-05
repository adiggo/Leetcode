public class Solution {
    int countNumber = 0;
     int recordNumber = 0;
        
        int countIllegal = 0;
        int countpp = 0;
    public int atoi(String str) {
        // be careful of space
        // - and +
        if (str==null ){
            return 0;
        }
        if (str==""){
            return 0;
        }else{
        
        char[] array = str.toCharArray();
        
        StringBuilder s = new StringBuilder();
        
       
        
        for (int i=0; i<str.length(); i++){
            
            if (array[i]<='9' && array[i]>='0' ){
                
                if (countpp>1){
                    return 0;
                }
                countNumber++;
                s.append(array[i]);        
            }
            
            if( (array[i] >'9' || array[i]<'0')){
                if (countNumber!=0){
                    break;
                }else if(array[i]!=' ' && array[i]!='+' && array[i]!='-'){
                    countIllegal++;
                    return 0;
                }else if (array[i]==' '){
                    if (countpp >0)
                        return 0;
                }
                
                else if (array[i]=='+' || array[i]=='-'){
                    if (countpp == 0 && array[i]!='+')
                        s.append(array[i]);
                    countpp++;
                }
                    
            }
        }
        
        if (countNumber==0){
            return 0;
        }
        Long val=Long.parseLong(s.toString());
        if (val > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if (val<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(s.toString());
        }
    }
}