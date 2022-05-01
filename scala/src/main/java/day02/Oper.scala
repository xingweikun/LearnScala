package day02

object Oper {
  def main(args: Array[String]): Unit = {
    val s1=new String("abc")
    val s2=new String("abc")
    //scala中==就是比较对象的内容
    println(s1==s2)//true 判断两个对象内存地址是否相等无意义，双等号更加直观
    println(s1.equals(s2))//true
    println(s1.eq(s2))//false eq方法在编译后就是java中的双等号

    val s11:String=null
    val s12=new String("abc")
    println(s11==s12)//false
//    println(s11.equals(s12))//报错 双等号是非空equals操作
    println(s11.eq(s12))//false


    println("abc"*2)//abcabc


  }

}
