
class Test {
    String name;

    public Test() {
        System.out.println("from test constructor");
    }

    protected void show() {
        System.out.println("from show");
    }
}

class Sample {
    public static void main(String args[]) {
        Test t1 = new Test();
        t1.show();
    }
}
