package Java;

public class MySolution {

  private static int smallerHelper(int i, int mid, int[] arr) {
    if (i >= arr.length)
      return 0;
    else if (arr[i] < mid && arr[i] >= 0)
      return 1 + smallerHelper(i + 1, mid, arr);
    else
      return smallerHelper(i + 1, mid, arr);
  }

  public static int countSmaller(int mid, int[] arr) {
    return smallerHelper(0, mid, arr);
  }

  private static int lightFind(int start, int finish, int[] arr) {
    if (start == finish - 1)
      return start;
    var mid = (finish + start) / 2;
    var sm = countSmaller(mid, arr);
    if (sm == mid)
      return lightFind(mid, finish, arr);
    else
      return lightFind(start, mid, arr);
  }

  private static int minMissing(int[] arr) {
    return lightFind(0, arr.length + 1, arr);
  }

  public static void main(String[] args) {
    System.out.println(minMissing(new int[] { 1, 2, 3 }) + " should be 0");
    System.out.println(minMissing(new int[] { 0, 1, 3 }) + " should be 2");
    System.out.println(minMissing(new int[] { 0, 1, 2, 3 }) + " should be 4");
    System.out.println(minMissing(new int[] { -1, 8, 2, 3, 0, -3, 12, 4, 1, 6 }) + " should be 5");
    System.out.println(minMissing(new int[] { 8, 2, 3, 0, 12, 4, 1, 6 }) + " should be 5");
    System.out.println(minMissing(new int[] { 3, 2, 1, 0 }) + " should be 4");
    System.out.println(minMissing(new int[] { 4, 3, 2, 1, 0 }) + " should be 5");
  }

}