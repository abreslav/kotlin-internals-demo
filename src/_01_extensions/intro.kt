package _01_intro

fun main(args: Array<String>) {
    println("abc".last())
}

fun String.last(): Char {
    return this[length - 1]
}