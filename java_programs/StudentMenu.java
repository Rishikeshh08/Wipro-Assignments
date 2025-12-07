
// one remaining thing - didnt use getters setters
//2 check modyfy name o\p

import java.util.*;

// 1. Add ## done
// 2. display ## done
// 3. display one ## done
// 4. delete (move each element up)
// 5. Modify (make nested menu in which you should ask what needs to be modifies )
// 6. sort as per the Marks

class Student {
    public String name;
    public int rollNo;
    public double marks;
    //Getters and Setters for name, rollNo, marks.
    private String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    protected int getRollNo() {
        return rollNo;
    }
    private void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    private double getMarks() {
        return marks;
    }
    private void setMarks(double marks) {
        this.marks = marks;
    }
    // Default Constructor
    Student() {
        System.out.println("Default Constructor Called");
    }
    // Parameterized Constructor
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.setMarks(marks);
    }
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
class StudentMenu {
   
    void menu() {
        System.out.println("Menu");
        System.out.println("1. Add Student");
        System.out.println("2. Display All Student");
        System.out.println("3. Display one Student");
        System.out.println("4. Delete one Student");
        System.out.println("5. Modify any field");
        System.out.println("6. Sort as per marks");
        System.out.println("0. Exit");
    }

    public static int searchStudents(Student[] students, int reqRollno){
        //searching
        int target = -1;
        int j = 0;
        while(j <= students.length-1 && students[j] != null){
            int currentRollno = students[j].rollNo;
            if(currentRollno == reqRollno){
                target = j;
                break;
            }
            j++;
        }
        return target;
    }

    public static void main(String[] args) {
        StudentMenu obj = new StudentMenu();
        // int studentArraySize = 10;
        Student [] students =new Student[5]; 
         Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            obj.menu();
            System.out.print("Enter your choice: ");   
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    for(int i=0;i<students.length;i++){
                        if(students[i]==null){
                            System.out.print("Enter Name: ");                  
                            String name = sc.next();
                            System.out.print("Enter Roll No: ");
                            int rollNo = sc.nextInt();
                            System.out.print("Enter Marks: ");                  
                            double marks = sc.nextDouble();
                            students[i]= new Student(name,rollNo,marks);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Student Details:");
                    for(Student s : students){
                        if(s!=null){
                            s.displayInfo();
                            System.out.println("-----");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRollNo = sc.nextInt();
                    boolean found = false;
                    for(Student s : students){
                        if(s!=null && s.getRollNo() == searchRollNo){
                            s.displayInfo();
                            found = true;
                            break;
                        }
                    }
                    break;
                
                case 4:
                    //delete - ask roll no - search rollno - delete arr ele
                    System.out.print("Enter the rollno: ");
                    int requiredRollno = sc.nextInt();
                    //searching
                    int targetIndex = searchStudents(students, requiredRollno);
                    if(targetIndex == -1){
                        System.out.println("This roll no is not present");
                        break;
                    }
                    //deletion
                    while(targetIndex <= students.length-2 && students[targetIndex+1] != null){
                        students[targetIndex] = students[targetIndex+1];
                        targetIndex++;
                    }
                    students[targetIndex] = null;
                    System.out.println("Deleted Successfully");
                    break;

                case 5: 
                    // modify - ask rollno - 
                    System.out.print("Enter rollno: ");
                    int reqRollno = sc.nextInt();
                    int target = searchStudents(students, reqRollno);
                    if(target == -1){
                        System.out.println("This roll no is not present");
                        break;
                    }

                    //inner menu
                    System.out.print("Which field you need to modify\n1. Name\n2. Rollno\n3. Marks\nEnter your choice: ");
                    int ch = sc.nextInt();
                    switch(ch){
                        case 1:
                            //name - ask name - modify
                            sc.nextLine();
                            System.out.print("Enter new Name: ");
                            String newName = sc.nextLine();
                            students[target].name = newName;
                            System.out.println("Name Updated Successfully");
                            break;
                        case 2: 
                            System.out.print("Enter new RollNo: ");
                            int newRollNo = sc.nextInt();
                            students[target].rollNo = newRollNo;
                            System.out.println("RollNo Updated Successfully");
                            break;
                        case 3:
                            System.out.print("Enter new Marks: ");
                            double newMarks = sc.nextDouble();
                            students[target].marks = newMarks;
                            System.out.println("Marks Updated Successfully");
                            break;
                        default: 
                            System.out.println("Invalid choice");

                    }
                    break;
                    
                case 6:
                    //sort as per marks - selection sort
                    //marks - students[i].marks
                    for(int x = 0; x <= students.length - 2; x++){
                        double min = students[x].marks;
                        int minIndex = x;
                        for(int y = x+1; y <= students.length - 1; y++){
                            if(min > students[y].marks){
                                min = students[y].marks;
                                minIndex = y;
                            }
                        }
                        //swap - x and minIndex
                        Student temp = students[x];
                        students[x] = students[minIndex];
                        students[minIndex] = temp;
                    }
                    System.out.println("Sorted Successfully in accending order of marks");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
    }while (choice != 0);
        sc.close();
    }
}

