
public class Foo {
  static int  x = 0;
  public Foo() {
    int max = Math.max(11, 45);
    System.out.println(max);
    x+=1;
  }
  public static void go() {
    System.out.print(x);
  }
}

