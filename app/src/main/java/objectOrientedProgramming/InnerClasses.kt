package objectOrientedProgramming

class Outer1{
    val myString = "Outside nester class"

    // I have to use the keyword inner to access to the variable of the Outer class
    inner class NestedClass{

        val newString = "Inside nester class"
        fun callInside() = "Function call from inside Nested class"

        fun getStuff() = myString
    }
}

fun main(args: Array<String>) {

    val outer = Outer1()
    println("Using Outer object: ${outer.NestedClass().getStuff()}")

    val inner = Outer1().NestedClass() // Using Outer object: Outside nester class
    println("Using inner object: ${inner.getStuff()}") // Using inner object: Outside nester class
}