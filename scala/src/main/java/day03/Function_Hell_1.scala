package day03

object Function_Hell_1 {
  def main(args: Array[String]): Unit ={
    def test(f:(Int,Int)=>Int):Unit={
      val r=f(10,20)
      println(r)
    }
    def fun2(x:Int,y:Int):Int={
      x+y
    }
    test(fun2)
    test(
      (x:Int,y:Int)=>{//匿名函数主要应用于函数作为参数使用
        x-y
      }
    )
    //匿名函数也存在至简原则
    //如果函数体逻辑代码只有一行，大括号可以省略
    test(
      (x:Int,y:Int)=>x*y
    )
    //如果参数的类型可以推断出来，那么参数类型可以省略
    test(
      (x,y)=>x/y
    )
    //如果参数只有一个的话，参数列表的小括号可以省略
    //如果参数在使用时按照顺序只使用了一次，那么可以使用下划线代替参数
    test(_+_)//x+y
    test(_*_)//x*y

    def test1(f:(String)=>Unit):Unit={
      f("xxx")
    }
    def fun(name:String):Unit={
      println(name)
    }
    test1(fun)
//    test1(
//      (name:String)=>{
//        println(name)
//      }
//    )
    //简写
    test1(println(_))//匿名函数最简版

    def test2(f:(Int,Int)=>Int)={
      f(10,20)
    }
//    test2(
//      (x:Int,y:Int)=>{
//        x+y
//      }
//    )
//    //简写
//    println(test2(_+_))
      println(test2(2*_+_))
    //练习看看哪种情况可以简写哪种情况不可以简写
  }
}