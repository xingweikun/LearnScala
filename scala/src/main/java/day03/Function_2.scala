package day03

object Function_2 {
  def main(args: Array[String]): Unit = {
    //函数柯里化
    //将无关参数分离开
    def test(a:Int,b:Int):Unit={
      for(i <- 1 to a){//10min
        println(i)
      }
      for(j <- 1 to b){//20min
        println(j)
      }
    }
    def test1(a:Int)(b:Int):Unit={
      for(i <- 1 to a){//10min
        println(i)
      }
      for(j <- 1 to b){//20min
        println(j)
      }
    }
    val a=10//10min
    val b=20//20min
    test(a,b)//60min
    test1(a)(b)
  }

}
