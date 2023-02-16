public class MyMain {
    public static void main(String[] args) {
        int val = 7;
        Value v = new Value(6);
        Test t = new Test(4);
        t.first(5);
        System.out.println(t.getTest() + v.getVal());
        t.second(v, val);
        System.out.println(t.getTest());
        System.out.println(val);
    }
}