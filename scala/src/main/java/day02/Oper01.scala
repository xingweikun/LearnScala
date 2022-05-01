package day02

import test.User

object Oper01 {
  def main(args: Array[String]): Unit = {
    //scala是一个完全面向对象的语言，数字也是对象
    val r=10.+(10)
    println(r)
    //方法调用时，可以省略.点
    //方法参数只有一个或没有，那么小括号可以省略
    val user=new User()
    println(user toString)
  }

}
