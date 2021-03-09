package obectOrientedProgramming

// public = Default
// private = will not be visible outside this class
// protected = Same as private + visible in subclasses


open class Animal() {

    var name: String? = null
    private var color: String? = null
    var numLegs: Int? = null

    init {
        println("This is the init constructor")
    }

    constructor (name: String, color: String, numLegs: Int) : this() {
        this.name = name
        this.color = color
        this.numLegs = numLegs

        println("Second constructor: " + this.name)
        println("Second constructor: " + this.color)
        println("Second constructor: " + this.numLegs)
    }

    constructor(numLegs: Int) : this() {

        this.numLegs = numLegs
        println("third constructor: " + this.numLegs + " legs")
    }

    fun showAnimal() {
        println("\nThis is the function show animal: \n")
        println("Name is: " + this.name)
        println("Color is: " + this.color)
        println("Num legs are: " + this.numLegs)

    }

    // How color is private I just can access through getter or setter
    fun setColor(col: String) {
        this.color = col
    }
}

class Lion : Animal {
    constructor() : super() {
        super.name
        super.setColor("yellow and orange")
    }
}

fun main(args: Array<String>) {

    var animal = Animal("Bird", "blue", 2)
    var animal1 = Animal(2)
    animal.showAnimal()

    println("\n========== Inheritance: =========\n")

    val lion = Lion()
    val lion2 = Lion()
    lion.name = "Leon"

    // I just can assign the color through the function I did it:
    lion.setColor("orange")
    lion.numLegs = 5
    lion.showAnimal()
}