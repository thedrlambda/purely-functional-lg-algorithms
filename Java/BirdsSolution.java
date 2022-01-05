package Java;

import static Java.NaiveSolution.partition;

public class BirdsSolution {

  private static int quickFind(int guess, int len, List xs) {
    if (xs == null)
      return guess;
    var mid = (guess + len) / 2;
    var p = partition(xs, mid);
    var leftLength = List.length(p.left);
    if (leftLength == mid - guess)
      return quickFind(mid, len, p.right);
    else
      return quickFind(guess, mid, p.left);
  }

  private static int minMissing(List xs) {
    return quickFind(0, List.length(xs) + 1, xs);
  }

  public static void main(String[] args) {
    System.out.println(minMissing(List.ofArray(new int[] { 1, 2, 3 })) + " should be 0");
    System.out.println(minMissing(List.ofArray(new int[] { 0, 1, 3 })) + " should be 2");
    System.out.println(minMissing(List.ofArray(new int[] { 0, 1, 2, 3 })) + " should be 4");
    System.out.println(minMissing(List.ofArray(new int[] { 8, 2, 3, 0, 12, 4, 1, 6 })) + " should be 5");
    System.out.println(minMissing(List.ofArray(new int[] { 3, 2, 1, 0 })) + " should be 4");
    System.out.println(minMissing(List.ofArray(new int[] { 4, 3, 2, 1, 0 })) + " should be 5");
  }

}