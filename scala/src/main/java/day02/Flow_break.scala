package day02

//import scala.util.control.Breaks
import scala.util.control.Breaks._ //类似java静态导入
object Flow_break {
  def main(args: Array[String]): Unit = {
    /*
    * scala中无法使用break，continue关键字这样的方式来中断，或继续循环逻辑，
    * 而是采用了函数式编程的方式代替了循环语法中的break和continue
    * */
    /*
    Breaks.breakable{
      for(i <- 1 to 5){
        if(i==3){
          //采用面向对象的方式来代替break
          //采用抛出异常的方式来跳出循环
          Breaks.break()
        }
        println(i)
      }
    }
      println("other")
     */
    breakable{//类似java静态导入
      for(i <- 1 to 5){
        if(i==3){
          break()
        }
        println(i)
      }
    }
    println("other")
  }
}
