package day03

import java.rmi.server.UID

object Function_1 {
  def main(args: Array[String]): Unit = {
    //抽象
    def fun(op: =>Unit)={
      op
    }
    //参数类型不完整，传递参数时也是不完整，只传递代码就可以，不需要完整声明
    fun(
      println("xxx")
    )


  }

}
