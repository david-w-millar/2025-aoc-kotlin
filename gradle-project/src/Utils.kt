import java.math.BigInteger
import java.security.MessageDigest
import kotlin.io.path.Path
import kotlin.io.path.readText


// ----- [ IO ] -----

/**
 * Reads lines from a text file inside the `src` directory.
 *
 * @param name The name of the file (without the `.txt` extension).
 * @return A list of strings, with each element representing a line from the file.
 */
fun readInput(name: String) = Path("src/$name.txt").readText().trim().lines()


// ----- [ Common Extension Functions ] -----

/**
 * Calculates the MD5 hash of a string.
 *
 * @return The 32-character hexadecimal MD5 hash string.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')


//  ----- [ Output ] -----

/**
 * Prints this object to the standard output stream followed by a newline.
 * This is a convenience shorthand for `println(this)`.
 */
fun Any?.println() = println(this)
