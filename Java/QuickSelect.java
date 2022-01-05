package Java;

import static Java.NaiveSolution.partition;

import java.util.function.BiFunction;

public class QuickSelect {

  public static int partitionBinarySearch(
      int min, int max, List xs,
      BiFunction<Integer, List, Boolean> eq) {
    if (min == max - 1)
      return min;
    var mid = (max + min) / 2;
    var p = partition(xs, mid);
    if (eq.apply(mid, p.left))
      return partitionBinarySearch(mid, max, p.right, eq);
    else
      return partitionBinarySearch(min, mid, p.left, eq);
  }

  private static int quickSelect(int k, List xs) {
    return partitionBinarySearch(0, List.length(xs) + 1, xs,
        (mid, left) -> List.length(left) <= k);
  }

  public static void main(String[] args) {
    System.out.println(quickSelect(6, List.ofArray(new int[] { 8, 2, 3, 0, 12, 4, 1, 6 })) + " should be 8");
  }

}