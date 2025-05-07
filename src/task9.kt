fun main() {
    // Create a map of student names and scores
    val studentScores = mapOf(
        "Alice" to 85,
        "Bob" to 60,
        "Charlie" to 92,
        "Diana" to 75
    )

    // Print students who scored above 70
    println("Students who scored above 70:")
    for ((name, score) in studentScores) {
        if (score > 70) {
            println("$name: $score")
        }
    }
}