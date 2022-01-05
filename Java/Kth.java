package Java;

import static Java.BinarySearch.generalizedBinarySearch;
import static Java.MySolution.countSmaller;

public class Kth {

  private static int kth(int[] arr, int k) {
    return generalizedBinarySearch(0, arr.length + 1,
        (mid) -> countSmaller(mid, arr) <= k);
  }

  public static void main(String[] args) {
    System.out.println(kth(new int[] { 8, 2, 3, 0, 12, 4, 1, 6 }, 6) + " should be 8");
  }

}