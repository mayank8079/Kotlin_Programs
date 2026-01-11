interface Mydate{ val date1:String }
interface Mytime{ val time1:String }
class Mycalendar:Mydate,Mytime{ override val date1="10-01-2026"; override val time1="10:30"
fun display(){ println(date1); println(time1) }}
fun main(){ Mycalendar().display() }