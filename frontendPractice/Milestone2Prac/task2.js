/*
Great! Let's level up slowly and cleanly.
**Task 2 will introduce a new class that manages students.**

---

# 🟦 **TASK 2: Create StudentManager class**

### ✔ Your goals:

Create a new class named **StudentManager** that:

### **1. Has a students array**

```js
this.students = [];
```

### **2. Has an addStudent method**

* Takes parameters → (id, name, age)
* Creates a Student object
* Pushes it into the students array
* Prints `"Student added"`

### **3. Has a showAll method**

* Prints entire students array

---

# 🎯 Expected Usage

```js
class Student { ... }   // use your previous Student class

class StudentManager {
    // you will write this
}

let manager = new StudentManager();

manager.addStudent(1, "Rishi", 21);
manager.addStudent(2, "John", 22);

manager.showAll();
```

### ✔ Expected Output:

```
Student added
Student added
[
  Student { id: 1, name: 'Rishi', age: 21 },
  Student { id: 2, name: 'John', age: 22 }
]
```

---

# 📌 Notes:

* No validation required in this task
* No ID uniqueness check yet
* Keep it simple
* Use `this.students.push(...)`

---

When done, reply **“done”** with your code.

*/


class Student{
    constructor(id, name, age){
        this.id = id;
        this.age  = age;
        this.name = name;
    }
    
}
class StudentManager{
    constructor(){
        this.students = [];
    }
    add(student){

        this.students.push(student);
    }
    showAll(){
        this.students.forEach(s => console.log(s));
    }

}
let s1 = new Student(1, "Rishi", 21);
let s2 = new Student(2, "John", 22);
let m = new StudentManager();
m.add(s1);
m.add(s2);
m.showAll();
