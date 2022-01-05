package Java;

import static Java.BinarySearch.generalizedBinarySearch;

public class Sqrti {

  private static int sqrti(int a) {
    return generalizedBinarySearch(0, a, (mid) -> mid * mid <= a);
  }

  public static void main(String[] args) {
    System.out.println(sqrti(16) + " should be 4");
    System.out.println(sqrti(25) + " should be 5");
    System.out.println(sqrti(22) + " should be 4");
  }
}