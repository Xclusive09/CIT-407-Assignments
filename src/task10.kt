fun main() {
    // Define a lambda expression for the product of two integers
    val product: (Int, Int) -> Int = { a, b -> a * b }

    // Call the lambda with sample values
    val result = product(4, 5)

    // Print the result
    println("Product of 4 and 5 is: $result")
}