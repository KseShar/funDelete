import scala.collection.mutable.ListBuffer

object Main {
  def main(args: Array[String]): Unit = {
    println(funD(ListBuffer(1,2,3,4,5,6,7,8,9,10,12)))
    println(funD1(ListBuffer(1,2,3,4,5,6,7,8,9,10,12)))
  }

  def funD(buf: ListBuffer[Int]) = {
    buf.filter(_ % 2 == 0)
  }

  def funD1(buf: ListBuffer[Int]) = {
    for (i <- buf.length-1 to 0 by -1 if (buf(i) % 2 == 0)) yield buf.remove(i)
  }

}