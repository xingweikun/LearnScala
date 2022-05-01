package day02

import test.User

object DataType_1 {
  def main(args: Array[String]): Unit = {
    val list:AnyRef=List(1,2,3,4)
    val obj:AnyRef=new User()
    val obj1:AnyRef=DataType_1
    println(list)
    println(obj)
    println(obj1)
  }

}
