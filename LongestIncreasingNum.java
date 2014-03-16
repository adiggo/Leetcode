 package algorithm.programming.dynamic;
 
import java.util.ArrayList;
import java.util.List;
 
public class LongestIncreasingSubsequence {
 
  public Integer[] LIS(Integer[] A) {
    int[] m = new int[A.length];
    //Arrays.fill(m, 1);//not important here
    for (int x = A.length - 2; x >= 0; x--) {
      for (int y = A.length - 1; y > x; y--) {
        if (A[x] < A[y] && m[x] <= m[y]) {
          m[x]++;//or use m[x] = m[y] + 1;
        }
      }
    }
    int max = m[0];
    for (int i = 1; i < m.length; i++) {
      if (max < m[i]) {
        max = m[i];
      }
    }
    List<Integer> result = new ArrayList<Integer>();
    for (int i = 0; i < m.length; i++) {
      if (m[i] == max) {
        result.add(A[i]);
        max--;
      }
    }
    return result.toArray(new Integer[0]);
  }
}