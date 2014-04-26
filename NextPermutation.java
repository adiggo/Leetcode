public class Solution {
    public void nextPermutation(int[] num) {
      int k = -1;
      for(int i = 0; i < num.length-1; i++){
        if(num[i] < num[i+1]) k = Math.max(k,i);
      }
      if(k == -1){
        reverse(num,0,num.length-1); // last permutation
      } else{
        int l = 0;
        for(int i = 0; i < num.length; i++){
          if(num[i] > num[k]) l = Math.max(l, i);
        }
        swap(num, k, l);
        reverse(num, k+1, num.length-1);
      }
    
    }
    
    // reverse the subarray num[a..b] of num
    private void reverse(int[] num, int a, int b){
      int mid = (a+b)/2;
      for(int i = a; i <= mid; i++){
        swap(num, i, a+b-i);
      }
    }
    
    private void swap(int[] num, int a, int b){
      int tmp = num[a];
      num[a] = num[b];
      num[b] = tmp;
    }
}