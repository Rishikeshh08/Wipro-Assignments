public class Typecasting {
    public static void main(String[] args) {
        // //implicit - widening - smaller to bigger
        // int a = 5;
        // float b = a;
        // System.out.println(b);
        // char ch = 'A';
        // int ch1 = ch;
        // System.out.println(ch1);
        // double ch3 = ch;
        // System.out.println(ch3);

        // //explicit - narrowing - bigger to smaller
        // float f = 2.4f;
        // int i = (int) f;
        // System.out.println(i);

        float f = 20.5f;
        long l = 4545;
        int i = 4;
        long df = i;
        float ff = l;
        long ll = (long) f;
        System.out.println(ll);
        

        

    }
}
