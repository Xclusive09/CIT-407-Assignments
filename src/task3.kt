fun main() {
    // Prompt user for a number
    print("Enter a number: ")
    val number = readLine()?.toInt() ?: 0

    // Check if the number is even or odd
    if (number.rem(2) == 0) {
        println("$number is an even number.")
    } else {
        println("$number is an odd number.")
    }
}