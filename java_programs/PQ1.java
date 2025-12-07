public class PQ1 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3, 4);
        Circle c = new Circle(2);
        System.out.println(rec.area());
        double areaOfCircle = c.area();
        System.out.printf("Area of Circle: %.2f", areaOfCircle);
        // String s = String.format("2nd time area of Circle: %.2f", areaOfCircle);
        // System.out.println(s);
    }
}
class Shape{
    public double area(){
        return 0.0;
    }

}
class Rectangle extends Shape{
    
    private double length;
    private double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double area(){
        return (length * breadth);
    }
}
class Circle{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return (Math.PI * Math.pow(radius,2));
    }
}
