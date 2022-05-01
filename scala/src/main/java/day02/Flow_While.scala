package day02

object Flow_While {
  def main(args: Array[String]): Unit = {
    //不推荐使用while
    var sum=0
    var i=1
    /*
    while(i<=100){
      sum=sum+i
      i=i+1
    }
     */
    do {
      sum=sum+i
      i=i+1
    }while(i<=100)
    println(sum)
  }

}
