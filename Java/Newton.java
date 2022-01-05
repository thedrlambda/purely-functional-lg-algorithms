package Java;

import java.util.function.Function;

public class Newton {

  public static <T> float newton(
      float precision, float start, float finish,
      Function<Float, Boolean> eq) {
    if (Math.abs(start - finish) <= precision)
      return start;
    else {
      var mid = (finish + start) / 2;
      if (eq.apply(mid))
        return newton(precision, mid, finish, eq);
      else
        return newton(precision, start, mid, eq);
    }
  }

}