package day03

object Function_Normal_1 {
  def main(args: Array[String]): Unit = {
    //函数参数默认以val声明，意味不能改变
    //声明参数的同时设定默认值
    //不传递参数，参数使用默认值
    def fun3(password:String="123456",name:String):Unit={
     println(name+':'+password)
    }
    fun3(name="test")
    fun3(name="test",password = "000000")

    //return关键字可以省略，函数将满足条件的最后一行代码的执行结果作为函数的返回值
    //
    def test1():String={"hello"}
    println(test1())
    //如果函数返回数据，那么可以推断出返回值类型的话，返回值类型可以省略
    def test2()={"string"}
    println(test2())
    def test3()={
      val age=30
      if(age>=30){
        "string"
      }else{
        5555
      }
    }
    //如果函数体的逻辑代码只有一行，那么大括号可以省略
    def test4()="test4"
    //println("test4")
    //如果函数的参数列表中没有声明任何参数，参数列表可以省略
    def test5="test5"
    println(test5)//调用时也不能加括号
    //如果函数声明为Unit，那么函数体中的return关键字不会被返回
    //如果函数体中使用return返回结果，那么一定要声明返回值类型
//    def test6()={
//      return "xxx"
//    }
    def test6(){
      return "xxx"
    }
    //可变参数，和参数默认值不能联合声明
    //    def test(passwd:String="0000",name:String*):Unit={
    //      //错误的
    //    }
  }
}