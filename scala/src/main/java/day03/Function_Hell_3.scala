package day03

object Function_Hell_3 {
  //内部函数在外部使用时，会有闭包
  def main(args: Array[String]): Unit = {
//    def outer(a:Int)={
//      def inner(b:Int):Int={
//        a+b
//      }
//      inner _
//    }

    //下面情况不会有闭包
    val age=30
    def test():Unit={
      println(age+20)
    }
    test()

    //将函数作为对象使用会有闭包
    //所有匿名函数都有闭包
    val f= test _
    f()
  }

}
