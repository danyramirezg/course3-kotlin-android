import java.io.FileReader
import java.lang.Exception

fun main(args: Array<String>) {
    readFile()
}

fun readFile() {

    var reader = FileReader("message.txt")
    var readMessage: String? = null
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