import scala.annotation.tailrec
object Summer {

  def sumem(xs: List[Int]): Int = {
    if (xs.isEmpty) 0
    else xs.head + sumem(xs.tail)
  }

  @tailrec
  def sumem2(xs: List[Int], acc: Int = 0): Int = {
    if (xs.isEmpty) acc
    else sumem2(xs.tail, acc+xs.head)

  }

}