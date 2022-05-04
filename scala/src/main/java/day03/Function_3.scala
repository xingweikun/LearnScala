package day03

object Function_3 {
  def main(args: Array[String]): Unit = {
    //递归
    //scala要求递归函数必须明确声明返回值类型
    //函数内部调用自身
    //要有跳出递归逻辑
    def myRecursion(num:Int):Int={
      if(num<=1){
        1
    }else{
        num *myRecursion(num-1)
      }
    }
    println(myRecursion(5))
  }

}
