package _02_bridges

fun foo(
    a: Int,
    b: String = "default",
    c: String? = null
) {
    println(a)
    println(b)
    println(c)
}

fun main(args: Array<String>) {
    foo(1)
}