public class PermutationRecursion{

    ArrayList<ArrayList<Integer>> permute (int[] num){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        permute(num, 0 , result);
        return result;  // 0 denote the index

    }

    void permute(int[] num, int start, ArrayList<ArrayList<Integer>> result){

        if (start >= num.length){
            ArrayList<Integer> item = convertArrayToList(num);
            result.add(item);
        }

        for (int j = start; j <= num.length - 1; j++){
            swap(num, start, j);
            permute(num, start+1, result);
            swap(num, start, j);
        }
    }

    ArrayList<Integer> convertArrayToList(int[] num){
        ArrayList<Integer> item = new ArrayList<Integer>();
        for (int h = 0; h < num.length; h++){
            item.add(num[h]);
        }
        return item;
    }

    void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
