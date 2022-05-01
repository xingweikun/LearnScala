package day02

object DataType_4 {
  def main(args: Array[String]): Unit = {
    //Nothing是scala语言中特殊的类型，用于统一方法的异常和正常返回
  }
  def test():Nothing={
    throw new Exception()
  }
  def test1():String={
    throw new Exception()
  }
}
