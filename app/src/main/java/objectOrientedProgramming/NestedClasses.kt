package objectOrientedProgramming

class Outer{
    val myString = "Outside nester class"

    class NestedClass{
        val newString = "Inside nester class"
        fun callInside() = "Function call from inside Nested class"
    }
}

fun main(args: Array<String>) {

    // Accessing to the member of the nested class:
    println(Outer.NestedClass().newString) // Inside nester class
    println(Outer.NestedClass().callInside()) // Function call from inside Nested class
}