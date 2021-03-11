import java.io.FileWriter
import java.lang.Exception
import java.io.FileReader as FileReader

fun main(args: Array<String>) {
    menu()
}

fun menu() {
    println("Please write: \n 1: write\n 2: Read\n 3: Exit\n")
    var input = readLine() ?: ""
    var choice = input.toInt()

    when (choice) {
        1 -> {
            println("Please write a message")
            var text = readLine().toString()
            writeFile(text)
        }
        2 -> readFile1()
        3 -> println("Exiting")
    }
}

fun writeFile(message: String) {
    try {
        var writer = FileWriter("appWriteRead.txt", true)
        writer.write("$message \n")
        writer.close()
    } catch (ex: Exception) {
        println("Exception $ex")
    }
}

fun readFile1() {
    var reader = FileReader("appWriteRead.txt")
    var char: Int?

    try {
        do {
            char = reader.read()
            print(char.toChar())
        } while (char != -1)
    } catch (ex: Exception) {
        print(ex.message)
    }
}
