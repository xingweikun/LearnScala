package day03

object Function_Def {
  def main(args: Array[String]): Unit = {
    //无参无返回值
    def fun1():Unit={
      println("fun1")
    }
    fun1
    //无参有返回值
    def fun2():String={
      return "fun2"
    }
    val f2=fun2()
    println(f2)
    //有参无返回值
    def fun3(name:String):Unit={
      println("name:"+name)
    }
    fun3("scala")
    //有参有返回值
    def fun4(name:String):String={
      return "Name:"+name
    }
    val f4=fun4("Scala")
    println(f4)
    //多参无返回值
    def fun5(name:String,age:Int):Unit={
      println(s"Name:${name},Age:${age}")
    }
    fun5("me",15)
    //多参有返回值
    def fun6(name:String,age:Int):String={
      val s=s"Name:${name},Age:${age}"
      return s
    }
    val r6=fun6("me",21)
    println(r6)
  }

}
