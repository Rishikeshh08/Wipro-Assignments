/* 
add = arr.push(ele); arr.some(s => s.id ==== id) - true if exist or false 
getById = arr.find(e => e.id === id) - return obj or undefined
delete = arr.findIndex(s => s.id === id) - return index if found or -1
        arr.splice(index, 1);  - .splice(index, delete count , eles to be added)
update = arr.findIndex(),  
*/

class Student{
    constructor(id, name , age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class StudentManager{
    constructor(){
        this.students =[];
    }
    add(id, name, age){
        let res = this.students.some(s => s.id === id);
        if(res){
            return "Id already exists"
        }else{
            let student = new Student(id, name, age);
            this.students.push(student);
            return "Added"
        }
        
    }
    getById(id){
        return this.students.find(s => s.id === id) || null;
    }
    deleteStudent(id){
        let index = this.students.findIndex(s => s.id === id);
        if(index !== -1){
            this.students.splice(index, 1);
            return "Deleted";
        }else{
            return "Not Found"
        }
        
    }
    updateStudent(id, newData){
        let index = this.students.findIndex(s => s.id === id);
        if(index === -1){ return "Student not Exist";}
        if(newData.name){
            this.students[index].name = newData.name;
        }
        if(newData.age){
            this.students[index].age = newData.age;
        }
        return "updated";
    }
    searchByName(name){
        return this.students.find(s => s.name === name) || null;
    }
    sortStudentByName(){
        return this.students.sort((s1, s2) => s1.name.localeCompare(s2.name));
    }
    sortStudentByAge(){
        return this.students.sort((s1, s2) => s1.age - s2.age);
    }
    showAll(){
        this.students.forEach(s => console.log(s));
    }
}
let m = new StudentManager();
console.log(m.add(1, "Rishi", 21));
console.log(m.add(2, "John", 22));
console.log(m.add(3, "Atharv", 23));
console.log(m.add(4, "om", 23));
// console.log(m.students)
// console.log(m.showAll());
// console.log(m.getById(2));
// console.log(m.getById(5));
// console.log(m.deleteStudent(2));

// console.log(m.deleteStudent(6));
// console.log(m.updateStudent(2, {name: "scout", age: 25}));
// console.log(m.updateStudent(1, {name: "Rishikesh"}));
// m.showAll();    
console.log("Search by name", m.searchByName("Atharv"));
console.log("sort be age", m.sortStudentByAge());
console.log("sort by name",m.sortStudentByName());
