public class UpcastingDowncasting {
    public static void main(String[] args) {
        Animall ani = new Dogg();
        ani.method1();

        //downcasting
        Dogg d = (Dogg) ani;
        d.method2();
    }
}
class Animall{
    void method1(){
        System.out.println("animal");
    }
}
class Dogg extends Animall{
    void method2(){
        System.out.println("dog");
    }
}
