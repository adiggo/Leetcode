/**
 *
 *
 *
 *  This class contains four method, basically it mainly be made up of two method, quickselect and partition;
 *  So quickselect, is drop unuseful data; Partition is used to get the right index of the ordered array.
 *
 *
 */





public class QuickSelect{

    public int quickselect(int[] G, int k){
        return quickselect(G, 0, G.length-1, k-1); //true index in the array
    }

    public int quickselect(int[] G, int first, int last, int k){
        if (first <= last){
            int pivot = partition(G, first, last);

            if (pivot == k){
                return G[k];
            }

            if (pivot > k){
                return quickselect(G, first, pivot-1, k); // if pivot is over k, then drop the unuseful side
            }
            //this is when pivot < k
            return quickselect(G, pivot+1, last, k);
        }
        return Integer.MIN_VALUE;
    }

    private int partition(int[] G, int first, int last){
        int pivot = first + new Random.nextInt(last - first + 1);
        swap (G, last, pivot);

        for (int i = first; i < last; i ++){
            if (G[i] > G[last]){
                swap(G, i ,first);
                first++;
            }
        }
        //first is the number of element that is larger than
        swap(G, first, last);
        return first;
    }
    private void swap (int[] G, int x, int y){
        int tmo = G[x];
        G[x] = G[y];
        G[y] = tmp;
    }
}
