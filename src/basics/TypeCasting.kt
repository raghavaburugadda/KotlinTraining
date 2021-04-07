package basics

fun main(args: Array<String>) {
    val x: Any = 2
    if (x is String) {
        val x1 = x as String
        if (x1.length > 5) {
            print("length is 5")
        } else {
            print("length is 6")
        }
    } else {
        print("It is non-string")
    }

    //Smart casting
    if (x is String && x.length > 5) {
        print("length is 5")
    } else {
        print("x is not a string")
    }

    //Unsafe
    val x1 = x as String
    print("length: ${x1.length}")
}