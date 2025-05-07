fun main() {
    // Create two Car objects
    val car1 = Car("Toyota", "Camry", 2020)
    val car2 = Car("Honda", "Civic", 2018)

    // Call displayDetails for each car
    car1.displayDetails()
    car2.displayDetails()
}

// Define Car class
class Car(val brand: String, val model: String, val year: Int) {
    // Function to display car details
    fun displayDetails() {
        println("Car: $brand $model, Year: $year")
    }
}