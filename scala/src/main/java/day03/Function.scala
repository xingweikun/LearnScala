package day03

object Function {
  def main(args: Array[String]): Unit = {
    //scala语言是函数式编程语言,所以万物皆函数,方法其实就是函数
    //def 函数名(参数1:参数类型,参数2:参数类型):函数返回值类型={函数体}
    def test():Unit={
      println("test function...")
    }
    val r=test()
    val r1=Function.test()
  }
  def test():Unit={
    print("test method...")
  }

}
