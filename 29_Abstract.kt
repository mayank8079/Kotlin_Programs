abstract class Shape{ abstract fun area() }
class Rectangle(val l:Int,val w:Int):Shape(){ override fun area(){ println(l*w) }}
fun main(){ Rectangle(5,4).area() }