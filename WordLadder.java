/**
 *
 *  Use BFS to solve this problem.
 *  wordQueue and distanceQueue stores both information.
 *  Treat each word as a node in a graph
 *  So for this problem, set up the two linkedlist is important since it perform the bfs operation.
 *  Abstract this problem as a BFS problem is the easiest way to solve this problem .
 *  The basic reason for using BFS is because we need to find out the shortest path. 
 *
 */

public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
 
        if (dict.size() == 0)  
            return 0; 
 
        LinkedList<String> wordQueue = new LinkedList<String>();
        LinkedList<Integer> distanceQueue = new LinkedList<Integer>();
 
        wordQueue.add(start);
        distanceQueue.add(1);
 
 
        while(!wordQueue.isEmpty()){
            String currWord = wordQueue.pop();
            Integer currDistance = distanceQueue.pop();
 
            if(currWord.equals(end)){
                return currDistance;
            }
            // transform between "a" to "z" 
            for(int i=0; i<currWord.length(); i++){
                char[] currCharArr = currWord.toCharArray();
                for(char c='a'; c<='z'; c++){
                    currCharArr[i] = c;
 
                    String newWord = new String(currCharArr);
                    if(dict.contains(newWord)){
                        wordQueue.add(newWord);
                        distanceQueue.add(currDistance+1);
                        dict.remove(newWord);// need to remove it once we have added it into queue, if not, we will get into endless loop.(circular graph)
                    }
                }
            }
        }
        //denote other case
        return 0;
    }
}
