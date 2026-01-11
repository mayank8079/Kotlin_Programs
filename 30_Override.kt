open class Parent{ open fun display(){ println("Parent") }}
class Child:Parent(){ override fun display(){ super.display(); println("Child") }}
fun main(){ Child().display() }