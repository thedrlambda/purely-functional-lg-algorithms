package Java;

import static Java.BinarySearch.generalizedBinarySearch;

public class IndexOf {

  public static int max(int m, int[] arr) {
    if (m < 0)
      return Integer.MIN_VALUE;
    else
      return Math.max(arr[m], max(m - 1, arr));
  }

  public static boolean contains(int key, int m, int[] arr) {
    if (m < 0)
      return false;
    else
      return arr[m] == key ? true : contains(key, m - 1, arr);
  }

  private static int indexOf(int k, int[] arr) {
    return generalizedBinarySearch(0, arr.length + 1,
        (mid) -> !contains(k, mid, arr)) + 1;
  }

  public static void main(String[] args) {
    System.out.println(indexOf(6, new int[] { 8, 2, 3, 0, 12, 4, 1, 6 }) + " should be 7");
    System.out.println(indexOf(3, new int[] { 8, 2, 3, 0, 12, 4, 1, 6 }) + " should be 2");
    System.out.println(indexOf(12, new int[] { 8, 2, 3, 0, 12, 4, 1, 6 }) + " should be 4");
  }

}