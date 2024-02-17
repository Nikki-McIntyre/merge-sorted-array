import java.util.ArrayList;
import java.util.Collections;

class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {

    sortArray(nums1, m, nums2, n);
  }

  public int[] sortArray(int[] nums1, int m, int[] nums2, int n) {
    // create an arraylist to hold all the values
    ArrayList<Integer> sorted = new ArrayList<Integer>();

    // add nums1 and 2 into the arraylist
    for (int i = 0; i < m; i++) {
      sorted.add(nums1[i]);
    }
    for (int i = 0; i < n; i++) {
      sorted.add(nums2[i]);
    }
    // sort it in ascending order
    Collections.sort(sorted);

    // print results
    for (int i = 0; i < sorted.size(); i++) {
      if (i < sorted.size() - 1) {
        System.out.print(sorted.get(i) + ",");
      } else {
        System.out.print(sorted.get(i));
      }
    }
    // make it back into an array to submit
    for (int i = 0; i < sorted.size(); i++) {
      nums1[i] = sorted.get(i);
    }
    return nums1;
  }

}
