package Java;

import java.util.function.Function;
import static Java.MySolution.countSmaller;

public class BinarySearch {

  public static <T> int generalizedBinarySearch(
      int min, int max,
      Function<Integer, Boolean> eq) {
    if (min == max - 1)
      return min;
    var mid = (max + min) / 2;
    if (eq.apply(mid))
      return generalizedBinarySearch(mid, max, eq);
    else
      return generalizedBinarySearch(min, mid, eq);
  }

  private static int binarySearch(int[] arr, int e) {
    return generalizedBinarySearch(0, arr.length,
        (mid) -> arr[mid] <= e);
  }

  private static int minMissing(int[] arr) {
    return generalizedBinarySearch(0, arr.length + 1,
        (mid) -> countSmaller(mid, arr) == mid);
  }

  public static void main(String[] args) {
    System.out.println("Min Missing");
    System.out.println(minMissing(new int[] { 1, 2, 3 }) + " should be 0");
    System.out.println(minMissing(new int[] { 0, 1, 3 }) + " should be 2");
    System.out.println(minMissing(new int[] { 0, 1, 2, 3 }) + " should be 4");
    System.out.println(minMissing(new int[] { -1, 8, 2, 3, 0, -3, 12, 4, 1, 6 }) + " should be 5");
    System.out.println(minMissing(new int[] { 8, 2, 3, 0, 12, 4, 1, 6 }) + " should be 5");
    System.out.println(minMissing(new int[] { 3, 2, 1, 0 }) + " should be 4");
    System.out.println(minMissing(new int[] { 4, 3, 2, 1, 0 }) + " should be 5");
    System.out.println("Binary Search");
    System.out.println(binarySearch(new int[] { 1, 3, 6, 7, 8, 12, 15 }, 3) + " should be 1");
    System.out.println(binarySearch(new int[] { 1, 3, 6, 7, 8, 12, 15 }, 15) + " should be 6");
  }

}