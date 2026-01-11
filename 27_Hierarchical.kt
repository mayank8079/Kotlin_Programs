open class Person(val name:String,val age:Int)
class Student(name:String,age:Int,val per:Double):Person(name,age){ fun d1(){ println("$name $age $per") }}
class Employee(name:String,age:Int,val sal:Int):Person(name,age){ fun d2(){ println("$name $age $sal") }}
fun main(){ Student("A",20,80.0).d1(); Employee("B",30,20000).d2() }