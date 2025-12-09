import java.math.BigInteger
import java.security.MessageDigest
import kotlin.io.path.Path
import kotlin.io.path.readText

object Utils {
    /** Converts string to md5 hash. */
    fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
        .toString(16)
        .padStart(32, '0')

    /** The cleaner shorthand for printing output. */
    fun Any?.println() = println(this)

    /** Reads lines from the given input txt file. */
    fun readInput(name: String) = Path("problem_inputs/$name.txt").readText().trim().lines()

    /**
     * Reads lines from a module resource file
     * Usage: readResourceLines("/Day01_test"")
     */
    fun readResourceText(path: String): String {
        val resourceUrl = object {}.javaClass.getResource(path)
        requireNotNull(resourceUrl) { "Resource not found at: $path" }
        return resourceUrl.readText()
    }

    /** Reads lines from an input file from a module's resources */
    fun readInputResource(name: String) = readResourceText("/$name.txt").trim().lines()
}
