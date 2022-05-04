package day03

object Function_Hell {
  def main(args: Array[String]): Unit = {
    //函数也是一个对象
    //User user=new User()
    def fun1():Unit={
      println("fun1...")
    }
    val f=fun1()
    val f2=fun1()
    val f3=fun1 _
    //如果将函数作为整体，而不是执行结果赋值给变量，那么需采用特殊符号：下划线
    //函数对象也有类型
    //函数独立使用时，参数声明没有个数限制；但是如果将函数作为对象给别人使用，那么函数的参数声明个数最多22个
    val f4:Function0[Unit]=fun1 _
    //函数类型另一种写法
    val f5:()=>Unit=fun1 _



  }
}