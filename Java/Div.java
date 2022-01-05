package Java;

import static Java.BinarySearch.generalizedBinarySearch;

public class Div {

  private static int div(int a, int b) {
    return generalizedBinarySearch(0, a, (mid) -> mid * b <= a);
  }

  public static void main(String[] args) {
    System.out.println(div(3, 5) + " should be 0");
    System.out.println(div(15, 3) + " should be 5");
  }
}