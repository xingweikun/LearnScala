package day02

import test.User

import java.io.{ObjectOutputStream, OutputStream}
import java.net.Socket

object Master_Object {
  def main(args: Array[String]): Unit = {
    // TODD 连接服务器
    val client=new Socket("localhost",9999)
    val user=new User()
    val objOut=new ObjectOutputStream(client.getOutputStream)
    objOut.writeObject(user)
    objOut.flush()
    objOut.close()
    println("客户端向服务器发送"+user)
    client.close()

  }

}
