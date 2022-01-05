package Java;

public class NaiveSolution {

  public static Pair partition(List xs, int pivot) {
    if (xs == null)
      return new Pair(null, null);
    var p = partition(xs.next, pivot);
    if (xs.elem < pivot)
      return new Pair(new List(xs.elem, p.left), p.right);
    else
      return new Pair(p.left, new List(xs.elem, p.right));
  }

  private static List quicksort(List xs) {
    if (xs == null)
      return null;
    var p = partition(xs.next, xs.elem);
    var left = quicksort(p.left);
    var right = quicksort(p.right);
    return List.append(left, new List(xs.elem, right));
  }

  private static int findMissing(int guess, List xs) {
    if (xs == null || xs.elem != guess)
      return guess;
    else
      return findMissing(guess + 1, xs.next);
  }

  private static int minMissing(List xs) {
    return findMissing(0, quicksort(xs));
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