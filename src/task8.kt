fun main() {
    // Create a Student object
    val student = Student("Jane", 21, "A")

    // Call methods to print details
    student.printPersonDetails()
    student.printStudentDetails()
}

// Base class Person
open class Person(val name: String, val age: Int) {
    fun printPersonDetails() {
        println("Name: $name, Age: $age")
    }
}

// Subclass Student inheriting from a Person
class Student(name: String, age: Int, val grade: String) : Person(name, age) {
    fun printStudentDetails() {
        println("Grade: $grade")
    }
}