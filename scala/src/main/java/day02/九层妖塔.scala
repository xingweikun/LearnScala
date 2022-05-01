package day02

object 九层妖塔 {
  def main(args: Array[String]): Unit = {
    /*
        *
       ***
      *****
     *******
    *********
   ***********
  *************
 ***************
*****************

     */
    for(i <- 1 to 9){
      for(j <- 1 to 9-i){
        print(" ")
      }
      for(k <- 1 until 2 * i){
        print("*")
      }
      println()
    }
  }

}
