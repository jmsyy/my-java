package src.baseDemo;

class TestArray {
    public static void main(String[] args) {
       int org = 42;
       TestArray a = new TestArray();
       int y = a.go(org);
       System.out.println(y);
    }    
    int go (int arg) {
        arg = arg * 2;
        return arg;
    }
}
