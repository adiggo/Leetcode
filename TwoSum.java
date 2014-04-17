public int twoSum(int[] a){
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int[] result = new int[2];
    for (int i= 0; i<a.length; i++){
        if (map.containsKey(a[i])){
            int index = map.get(a[i]);
            // if there are different combinations
            // then we can build a arraylist in the condition
            // then assign the index to it.
            result[0] = index;
            result[1] = i;
            break;
        }else{
            map.put(target-a[i], i);
        }
    }
    return result;
}


