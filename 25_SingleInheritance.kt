open class Person(val name:String,val age:Int)

class Student(name:String,age:Int,val roll:Int):Person(name,age){ fun show(){ println("$roll $name $age") }}
fun main(){ Student("Mayank",20,101).show() }