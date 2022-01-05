package Java;

import java.util.Arrays;

public class List {
  final int elem;
  final List next;

  public List(int elem, List next) {
    this.elem = elem;
    this.next = next;
  }

  public static List append(List left, List right) {
    if (left == null)
      return right;
    else
      return new List(left.elem, append(left.next, right));
  }

  public static int length(List xs) {
    if (xs == null)
      return 0;
    else
      return 1 + length(xs.next);
  }

  public static List ofArray(int[] xs) {
    List c = null;
    for (int i = xs.length - 1; i >= 0; i--) {
      c = new List(xs[i], c);
    }
    return c;
  }

  public static int[] toArray(List xs) {
    var arr = new int[length(xs)];
    int c = 0;
    for (List n = xs; n != null; n = n.next)
      arr[c++] = n.elem;
    return arr;
  }

  public static void printList(List xs) {
    System.out.println(Arrays.toString(toArray(xs)));
  }
}