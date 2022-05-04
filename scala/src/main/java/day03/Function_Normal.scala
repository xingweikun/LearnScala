package day03

object Function_Normal {
  def main(args: Array[String]): Unit = {
    //可变参数
    def fun2(name: String*): Unit = {
      println(name)
    }

    fun2()
    fun2("n1")
    fun2("n1", "n2")

    //可变参数必须放在参数列表的最后
    def fun22(age: Int, name: String*): String = {
      return (s"age:${age},name:${name}")
    }

    val f22 = fun22(18, "n1", "n2")
    println(f22)
  }
}