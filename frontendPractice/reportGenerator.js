/*
    Automate the report card to generate for students based on their marks in 3 subjects
    Each Data is stored as an object and the entire class is an array of students.
    1. add data type validation (where marks must be numbers or float not strings )
    2. Validate the name as string
    3. skip the invalid records or show warnings
    4. compute and display the report with extra functionality like scholarship or allowance for high grade 
    

    let students = [
    
    {name : "" , marks :[45,67,78]},
    {name : "" , marks :[45,"",78]},
     {name : 234 , marks :[45,67,78]},  
    ]

    function isValidStudent(student)
{
    if(typeof student.name != "string"){
    console.warn("Invalid name entered : " + student);
    }
}

//validation for marks 

function calculateAverage(marks)
function getGrade(avg)

function calculateTotalScholarship(grade)
switch(grade)


function generateReport(students)
{
display
}

*/

let students = [
    {name : "" , marks :[45,67,78]},
    {name : "" , marks :[45,"",78]},
     {name : 234 , marks :[45,67,78]},  
]

function validateStudent(student){
    let result1 = false;
    if(typeof student.name !== "string"){
        console.log('Invalid Name')
        result1 = false;
    } else{
        result1 = true;
    }

    let result2 = true;
    if(typeof student.marks === "object"){
        student.marks.forEach((mark) => {
            if(typeof mark !== "number"){
                result2 = false;
            }
        })
    } else{
        console.log('Invalid Marks');
        result2 = false;
    }

    return (result1 && result2);
    
}

const filteredStudentsData = students.filter((student) => validateStudent());

function calculateAverage(marks){
    let sum = marks.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
    return sum/marks.length;
}
function getGrade(avg){
    if(avg >= 90){
        return "A+";
    }else if(avg < 90 && avg >= 80){
        return "A";
    }else if(avg < 80 && avg >= 70){
        return "B";
    }else if(avg < 70 && avg >= 60){
        return "C"
    }else{
        return "D";
    }
}
function calculateTotalScholarship(grade){
    let scholarship = 0;
    switch(grade){
        case "A+":
            scholarship = 100;
            break;
        case "A":
            scholarship = 100;
            break;
        case "B":
            scholarship = 100;
            break;
        case "C":
            scholarship = 100;
            break;
        default: 
            console.leg("Invalid")
    }
}
function generateGradeReport(filteredStudentsData){
    filteredStudentsData.forEach((student) => {
        console.log('Students Details: ');
        console.log('Name: ', student.name);
        console.log("Marks: ", student.marks);
        let avg = calculateAverage(student.marks);
        let grade = getGrade(avg);
        let scholarship = calculateTotalScholarship(grade);
        console.log("Average: ", avg);
        console.log("Grade: ", grade);
        console.log('Scolarship: ', scholarship);
    })
}
generateGradeReport();