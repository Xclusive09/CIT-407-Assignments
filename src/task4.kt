fun main() {
    // Print numbers from 1 to 10 using a for loop
    println("Numbers from 1 to 10:")
    for (i in 1..10) {
        print("$i ")
    }
    println() // New line to differentiate between both programs

    // Print even numbers from 1 to 20
    println("Even numbers from 1 to 20:")
    for (i in 1..20) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
    println()
}