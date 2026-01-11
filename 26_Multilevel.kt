open class Person(val name:String,val age:Int)
open class Student(name:String,age:Int,val roll:Int):Person(name,age)
class Result(name:String,age:Int,roll:Int,val per:Double): Student(name,age,roll){ fun display() {
        println("$roll $name $age $per")
    }
}
fun main(){ Result("Mayank",20,101,85.5).display() }