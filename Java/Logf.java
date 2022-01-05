package Java;

import static Java.Newton.newton;

public class Logf {

  private static float logf(float a) {
    return newton(0.001f, 0, a, (mid) -> Math.pow(10, mid) <= a);
  }

  public static void main(String[] args) {
    System.out.println(logf(10) + " should be 1");
    System.out.println(logf(100) + " should be 2");
    System.out.println(logf(50) + " should be 1.69897000434");
  }
}