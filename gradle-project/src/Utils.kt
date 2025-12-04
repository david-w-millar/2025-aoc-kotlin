import java.math.BigInteger
import java.security.MessageDigest
import kotlin.io.path.Path
import kotlin.io.path.readText


// ----- [ IO ] -----

/** Reads lines from the given input txt file. **/
fun readInput(name: String) = Path("src/$name.txt").readText().trim().lines()


// ----- [ Common Extension Functions ] -----

/** Converts string to md5 hash. */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')


//  ----- [ Output ] -----

/** The cleaner shorthand for printing output. */
fun Any?.println() = println(this)


