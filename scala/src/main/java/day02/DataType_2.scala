package day02

import test.User

object DataType_2 {
  def main(args: Array[String]): Unit = {
    //Null在Scala中是一个类型。只有一个对象，就是null
    val n=null
    val user :User=null
    //val i:Int=null 不可以这样
    println(n)
    println(user)
  }

}
