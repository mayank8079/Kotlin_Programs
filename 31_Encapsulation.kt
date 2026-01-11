class BankAccount{
    private var bal=0; fun deposit(a:Int){ bal+=a };
    fun withdraw(a:Int){ bal-=a };
    fun show(){ println(bal)
    }
}
fun main(){ val b=BankAccount(); b.deposit(1000); b.withdraw(200); b.show() }