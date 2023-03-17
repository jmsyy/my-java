package src.date;

import java.util.Calendar;
import static java.lang.System.out;

class StaticSuper {
  static {
    out.println(" super static block");
  }

  StaticSuper() {
    out.println(" super constructor ");
  }
}

public class ComplexStaticSuper extends StaticSuper {
  static int rand;

  static {
    rand = (int) (Math.random() * 6);
    out.println("static block" + rand);
  }

  ComplexStaticSuper() {
    out.println("constructor");
  }

  public static void main(String[] args) {
    out.println(" in  main");
    ComplexStaticSuper c = new ComplexStaticSuper();
    // Calendar time = Calendar.getInstance();
    // out.println(String.format("当前时间%tc", time));
  }
  
}

