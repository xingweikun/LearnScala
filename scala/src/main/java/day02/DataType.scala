package day02

object DataType {
  def main(args: Array[String]): Unit = {
    val b:Byte=20
    val s:Short=20
    val c:Char='c'
    val i:Int=20
    val l:Long=20
    val f:Float=20.0F
    val d:Double=20.0
    val bol:Boolean=true
    val u:Unit=test()//Unit是一个类型，这个类型只有一个对象，打印就是小括号
    println(u)
  }
  def test():Unit={

  }
}
