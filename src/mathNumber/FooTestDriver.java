
public class FooTestDriver {
  Integer i = 4;
  int j = 5;
  
  public static void main(String[] args) {
    FooTestDriver f3 = new FooTestDriver();
    f3.go();
  }

  public void go () {
    j = i;
    System.out.println(j);
    System.out.println(i);
    String str = String.format("i am %,6.2f you %,.2f ni hao", 42.000, 20000.0000);
    System.out.println(str);
    System.out.println(String.format("当前时间%tc", new Date()));
  }
}
