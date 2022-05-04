package day03

object Function_Hell_2 {
  def main(args: Array[String]): Unit = {
    def test(x: Int, y: Int, f: (Int, Int) => Int): Unit = {
      val r = f(x, y)
      println(r)
    }

    test(10, 20, _ + _) //10+20=30
    //其实就是
    test(10, 20, (
      (x: Int, y: Int) => {
        x + y
      }
      ))

    //将函数作为返回值返回
    def test1(): Unit = {
      println("test1....")
    }

    def fun() = {
      test1 _
    }
    //    val f=fun _
    //    val ff=f()
    //    ff()
    fun()() //三行简写为一行

    //    def outer()={
    //      def inner():Unit={
    //        println("inner...")
    //      }
    //      inner _
    //    }
    //    outer()()
    def outer() = {
      def mid() = {
        def inner(): Unit = {
          println("inner...")
        }

        inner _
      }

      mid _
    }

    outer()()()
  }

}
