// use a bruteforce method is a good way to solve this problem. 
// since we need to list out all the result. 

public class WordBreak2BruteForce{

    public ArrayList<String> wordBreak (String s, Set<String> dict){
        ArrayList<String> res = new ArrayList<String>();
        if (s == null || s.length() == 0)
            return res;
        helper(s, dict, 0 , "", res);
        return res;
    }

    private void helper(String s, Set<String> dic, int start, String item, ArrayList<String> res){
        if (start >= s.length())
        {
            res.add(item);
            return;
        }

        StringBuilder str = new StringBuilder();
        for (int i = start; i < s.length(); i++)
        {
            str.append(s.charAt(i));    // str is a item that used for judging whether part or whole of string is in the dict. 
            if (dict.contains(str.toString()))
            {
                String newItem = item.length() > 0?(item + " "+str.toString()):str.toString(); //---> this condition is important, since if dict contains the whole
                helper(s, dict, i+1, newItem, res);
            }
        }
    }
}

