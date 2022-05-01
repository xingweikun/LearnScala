package day02

import java.io.{File, PrintWriter}
import scala.io.{Source, StdIn}

object IO {
  def main(args: Array[String]): Unit = {
//    val line=StdIn.readLine()//控制台
//    println(line)

    //Scala进行文件写操作，用的都是 java中的I/O类
    //write to file
    val writer=new PrintWriter(new File("./scala/src/main/java/day02/words.txt"))
    writer.write("hello scala")
    writer.close()

    //read from file
    val source=Source.fromFile("./scala/src/main/java/day02/words.txt")
    val strings = source.getLines()
    while (strings.hasNext){
      println(strings.next())
    }
    source.close()
  }


}
