package Java;

import static Java.BinarySearch.generalizedBinarySearch;

public class Div5 {

  private static int div5(int a) {
    return generalizedBinarySearch(0, a, (mid) -> mid * 5 <= a);
  }

  public static void main(String[] args) {
    System.out.println(div5(3) + " should be 0");
    System.out.println(div5(15) + " should be 3");
  }
}