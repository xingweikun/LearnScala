package day02

object Flow_for {
  def main(args: Array[String]): Unit = {
    /*
    java
    for(int i=0;i<10;i++){
      sout(i)
    }
    // JDK 1.5
    //for(Object obj:list){
    for(list:Object obj){
      sout(obj)
    }
     */
    // scala
//    for(i:Int <- 1 to 5){
//      println(i)// 1 2 3 4 5
//    }
//    for(i:Int <- 1 to 5 by 2){
//      println(i)// 1 3 5
//    }
    for(i <- Range(5,0,-1)){
      println(i)//54321
    }
  }

}
