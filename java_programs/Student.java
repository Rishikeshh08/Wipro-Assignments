public class Student {
    public static void main(String[] args){
        Students s = new Students();
        System.out.println(s.getMarks());
        s.setMarks(5);
        System.out.println(s.getMarks());
    }
}
class Students{
    private int marks = 10;
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
}