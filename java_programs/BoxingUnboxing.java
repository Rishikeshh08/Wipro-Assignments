public class BoxingUnboxing {
    public static void main(String[] args) {
        int a = 5;
        double d = 5.5;

        //boking
        Integer a1 = Integer.valueOf(a);
        Double d1 = Double.valueOf(d);
        System.out.println(a1 + " " + d1);

        //unboxing
        int a2 = a1.intValue();
        double d2 = d1.doubleValue();
        System.out.println(a2 + " " + d2);

    }
}
