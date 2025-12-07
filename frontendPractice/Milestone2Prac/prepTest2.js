/*The Student Management System (SMS) provides a streamlined and efficient way to manage student data. The key functionalities of the system include adding, updating, retrieving, and deleting student records. Below is a detailed explanation of each functionality:

Student Structure: id, name, age

1. Add Student

Description: Allows the administrator to add a new student to the system.
Input: The system requires the following details:
ID: A unique identifier for each student.
Name: The full name of the student.
Age: The student's age.
Process: The system validates the input data to ensure that the ID is unique and that all required fields are provided. Once validated, the student is added to the list of students.
Output: Confirmation of successful addition, or an error message if the ID is not unique or data is invalid.
2. Retrieve Student by ID

Description: Allows the administrator to search for and retrieve a student's details using their unique ID.
Input: The unique ID of the student.
Process: The system searches for the student in the list using the provided ID. If found, it retrieves the student's details.
Output: The student's details, including ID, name, and age. If the student is not found, an appropriate message is displayed.
3. Update Student

Description: Enables the administrator to update the details of an existing student.
Input: The unique ID of the student and the updated details (name, age, etc.).
Process: The system first checks if the student exists using the provided ID. If the student exists, the system updates the relevant details with the new data provided.
Output: Confirmation of successful update, or an error message if the student ID is not found.
4. Delete Student

Description: Allows the administrator to remove a student's record from the system.
Input: The unique ID of the student to be deleted.
Process: The system checks if the student exists in the list. If found, the student's record is removed from the list.
Output: Confirmation of successful deletion, or an error message if the student ID is not found.
5. Get All Students

Description: Provides a way to retrieve a list of all students currently in the system.
Input: No specific input is required.
Process: The system retrieves all student records from the list.
Output: A list of all students, including their IDs, names, and ages.
Note: Please update only the “studentManager.js” file.*/

// class Student{
    
//     constructor(id, name, age){
//         this.id = id;
//         this.name = name;
//         this.age = age;
//     }
// }
// class StudentManager{
    
    
//     students = []
//     constructor(){
        
//     }
//     addStudent(student) {
//         students.pust(student);
//     }
  
//     getStudentById(id) {
        
//     }
  
//     updateStudent(id, updatedInfo) {
//     }
  
//     deleteStudent(id) {
//     }
  
//     getAllStudents() {
//     }

// }


// studentManager.js
class Student {
    constructor(id, name , age) {
      //update the constructor
      this.id = id;
      this.name = name;
      this.age = age;
      
    }
  }
  
  class StudentManager {
    // students = [];
    constructor() {
      this.students = [];
    }
  
    addStudent(student) {
      let res = this.students.find(s => s.id === student.id);
      if(res === undefined){
        if(student.name !== ""){
          this.students.push(student);
          console.log("successfull addition")
        }else{
          console.log("Invalid name");
        }
      }
      else{
        console.log("ID is not unique");
      }
      student.push(student)
    }
  
    getStudentById(id) {

      let s = students.find(s => s.id === id);
      if(s){
        console.log(s.id, s.name, s.rollno);
        return s;
      }else{
        console.log("Student not found");
      }
    }
  
    updateStudent(id, updatedInfo) {
      let s = students.find(s => s.id === id);
      if(s){
        s.name = updatedInfo.name;
        s.age = updatedInfo.age;
        console.log("Successful update");
      }
      else{
        console.log("Student Id not found");
      }
    }
  
    deleteStudent(id) {
      let targetInd = -1;
      for(let i = 0; i <= this.students.length -1; i++){
        if(id === this.students[i].id){
          targetInd = i;
        }
      }
      
      if(targetInd != -1){
        let id = this.students[targetInd].id;
        this.students.splice(targetInd, 1);
        console.log("Successfull deletion");
      }else{
        console.log("Student id not found");
      }
    }
  
    getAllStudents() {
      return this.students;
    }
  }
  
  module.exports = { Student, StudentManager };
  