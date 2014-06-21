public class WordLadder2InJune{


    // BFS, hashmap, DFS
    public ArrayList<ArrayList<String>> findLadders(String start, String end, HashSet<String> dict){
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
        if (start == null || end == null)
            return res;
        ArrayList<String> tempArray = new ArrayList<String>();

        if (start.equals(end)){
            tempArray.add(start);
            tempArray.add(end);
            res.add(tempArray);
            return res;
        }

        // store each node's prefix nodes.
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        map.put(start, new ArrayList<String>);
        map.put(end, new ArrayList<String>);

        for (String s : dict){
            map.put(s, new ArrayList<String>);
        }

        Queue<Integer> distance = new LinkedList<Integer>();
        Queue<String> queue = new LinkedList<String>();
        queue.offer(start);
        distance.offer(1);

        while(!queue.isEmpty()){
            
            String curWord = queue.pop();
            if (curWord == end){
                break;
            }

            for (int i = 0; i< curWord.length(); i++){
                char[] curArray = curWord.toCharArray();
                for (char j = 'a'; j <= 'z'; j++){
                    curArray[i] = j;  // in place

                    String newWord = new String(curArray);
                    if (dict.contains(newWord)){
                        queue.add(newWord);
                        distance.add(curDistance+1);
                        map.put(newWord, map.get(newWord).add(curWord));
                        dict.remove(newWord);
                    }
                }
            }
        }
        tempArray.add(end);
        buidPath(start, end, map, tempArray, res);
        return res;
    }

    public void buidPath(String start, String end, HashMap<String, ArrayList<String>> map, ArrayList<String> tempArray, ArrayList<ArrayList<String>> res){

        ArrayList<String> pre = map.get(end);
        if (end.equals(start)){
            ArrayList<String> tempArray2 = new ArrayList<String>(tempArray);
            Collections.reverse(tempArray2);
            res.add(tempArray2);
            return;
        }

        for (String s: pre){
            tempArray.add(s);
            buidPath(start, s, map, tempArray, res);
            tempArray.remove(tempArray.size() - 1);
        }
    }
}







