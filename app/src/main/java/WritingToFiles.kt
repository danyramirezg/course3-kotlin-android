import java.io.FileWriter

fun main(args: Array<String>) {

    println("Please enter a message")
    var mensaje = readLine().toString()

    if (mensaje == "") {
        println("Please enter a text")
        var mensaje = readLine().toString()
        writeToFile(mensaje)

    } else {
        writeToFile(mensaje)
    }
}

fun writeToFile(message: String) {

    try {
        var writer = FileWriter("message.txt", true)
        writer.write("$message \n")
        writer.close()

    } catch (ex: Exception) {
        println("Exception $ex")
    }

}