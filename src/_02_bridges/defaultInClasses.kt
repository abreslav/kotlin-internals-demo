package _02_bridges

abstract class WithDefault {
    abstract fun foo(a: Int = 1)
}

class ChildWithDefault: WithDefault() {
    override fun foo(a: Int) {
        println(a)
    }
}