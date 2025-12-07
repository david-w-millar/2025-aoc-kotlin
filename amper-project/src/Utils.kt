import java.math.BigInteger
import java.security.MessageDigest
import kotlin.io.path.Path
import kotlin.io.path.readText

object Utils {

    /** Reads lines from the given input txt file. */
    fun readInput(name: String) = Path("src/$name.txt").readText().trim().lines()

    /** Converts string to md5 hash. */
    fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
        .toString(16)
        .padStart(32, '0')

    /** The cleaner shorthand for printing output. */
    fun Any?.println() = println(this)

    /**
     * Regex extension that provides a concise way to match against a CharSequence
     * and map the result to a data class given a transform block or function.
     *
     * **Note:** This is quite fragile, definitely premature, and aside from contracts or WAY more simple constructs is probably bad.
     *
     * @see require
     * @see check
     *
     * Example:
     * ```kotlin
     * val operation = regex.matchAndMap(input) { (direction, n) ->
     *   SafeOperation(direction, n)
     * }
     * ```
     */
    fun <T> Regex.matchAndMap(input: CharSequence, transform: (MatchResult.Destructured) -> T): T? {
        return find(input)?.destructured?.let(transform)
    }


    inline fun <reified T : Enum<T>> String.toEnum(): T = enumValueOf(this)
}
