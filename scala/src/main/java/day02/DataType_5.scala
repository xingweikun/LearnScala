package day02

object DataType_5 {
  def main(args: Array[String]): Unit = {
//    val b:Byte='A'
//    val c:Char=(b+1)  不可以这样
//    println(c)

    val s="123"
    val i=s.toInt//字符串->整数
    println(i+5)
    //还可以toxx转换其他类型
  }

}
