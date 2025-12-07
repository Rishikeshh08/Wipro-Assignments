public class SuperPractice {
    public static void main(String[] args) {
        Child c = new Child();
        c.displayInfo();
        System.out.println();
        c.displayParentInfo();
    }
}
class Person{
    String name = "Rishi";
    void displayInfo(){
        System.out.println("Parent:- ");
        System.out.println("Name: " + name);
    }
}
class Child extends Person{
    String name = "Atharv";
    int rollNumber = 20;
    void displayInfo(){
        System.out.println("Child:- ");
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollNumber);
    }
    void displayParentInfo(){
        super.displayInfo();
    }
}