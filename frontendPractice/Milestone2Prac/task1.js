/*
# ✅ **ROADMAP OF TASKS**

### **Phase 1 — Simple OOP + Array**

1. Create a Student class
2. Create StudentManager class
3. Add student
4. Get all students
5. Find student by ID
6. Delete student
7. Update student

### **Phase 2 — Slightly Complex**

8. Search by name
9. List students above a certain age
10. Sort students

### **Phase 3 — Realistic**

11. Save students to localStorage
12. Load students from localStorage
13. Create HTML form → add students
14. Display students in table
15. Handle errors on UI

---

# 🚀 Let's Start — **PHASE 1**

I’ll give you **Task 1** now.
When you finish it, say “done” and I’ll give you Task 2.

---

# 🟢 **TASK 1: Create a Student class**

### 👉 Create a class with properties:

* id
* name
* age

### ❗Rules:

* Use constructor
* No need for validation here
* Just create objects and print them

### Example expected usage:

```js
const s1 = new Student(1, "Rishi", 21);
const s2 = new Student(2, "John", 22);

console.log(s1);
console.log(s2);
```

---

# 🎯 **Your task output should look like:**

```
Student { id: 1, name: 'Rishi', age: 21 }
Student { id: 2, name: 'John', age: 22 }
```

---

📌 **When you're done, just say “done”, and I’ll give you TASK 2.**
*/


class Student {
    constructor(id, name , age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    getDetails(){
        console.log(this);
    }
}
let s1 = new Student(1, "Rishi", 21);
let s2 = new Student(2, "John", 22);
s1.getDetails();
s2.getDetails();