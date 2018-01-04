import com.sun.crypto.provider.AESCipher.AES128_CBC_NoPadding

val someNumbers = List(-5,0,5,10)

someNumbers.foreach((x: Int) => println(x))

someNumbers.filter((x: Int) => x > 0)
someNumbers.filter(x => x > 0)

someNumbers.filter(_ > 0)

someNumbers.filter((_: Int) > 0)

val f = (_: Int) + (_: Int)
f(5,10)

object Summer {
  def sum(a: Int,b: Int,c : Int): Unit = {
    a+b+c
  }
}
val b= Summer.sum(_, _, _)
b(1,2,3)

val addem  = Summer.sum _

addem(1,2,3)

val d = Summer.sum(1, _: Int, 3)
d(2)
var more = 1
val addMore = (x: Int) => x+ more