package day03

object Mothed {
  def main(args: Array[String]): Unit = {
    //函数作用域比较窄
    //方法作用域比较大
    def test1(): Unit = {
      println("test function")
    }
  }

  def test(): Unit = {
    println("test method")
  }

  def test(name: String): Unit = {
    println("test method")
  }

}
