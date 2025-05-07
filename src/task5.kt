fun main() {
    // Call the sum function with different values
    val result1 = sum(5, 3)
    val result2 = sum(10, 20)

    // Print results
    println("Sum of 5 and 3 is: $result1")
    println("Sum of 10 and 20 is: $result2")
}

// Function to calculate sum of two integers
fun sum(a: Int, b: Int): Int {
    return a + b
}