package Java;

import static Java.Newton.newton;

public class Sqrtf {

  private static float sqrtf(float a) {
    return newton(0.001f, 0, a, (mid) -> mid * mid <= a);
  }

  public static void main(String[] args) {
    System.out.println(sqrtf(16) + " should be 4");
    System.out.println(sqrtf(25) + " should be 5");
    System.out.println(sqrtf(22) + " should be 4.69041575982");
  }
}