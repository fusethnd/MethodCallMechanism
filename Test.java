public class Test {
    private int testVal;
    
    public Test() {
        testVal = 0;
    }

    public Test(int val) {
        testVal = val;
    }

    public int getTest() {
        return testVal;
    }   

    public void first(int val) {
        testVal = testVal + val;
        Value v = new Value(testVal + val);
        testVal = val = testVal;
        Value newV = new Value(testVal + v.getVal());
        v = newV;
        System.out.println(v.getVal());
    }

    public void second(Value v,int val) {
        val = 0;
        v.setVal(20);
        testVal = testVal + v.getVal();
        Value newV = new Value();
        newV = v;
        System.out.println(newV.getVal() + testVal);
        System.out.println(val);
    }

}