package day02

object Flow_if {
  def main(args: Array[String]): Unit = {
    /*
    scala没有三元运算符
     */
    val age=55
//    if (age<30){
//      println("age<30")
//    }else{
//      println("age>=30")
//    }
    if(age<=18){
      println("青少年")
    }else if(age<=36) {
      println("青年")
    }else if(age<=60){
      println("中年")
    }else{
      println("老年")
    }
  }

}
