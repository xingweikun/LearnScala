package day02

import java.net.Socket
import java.io.OutputStream

object Master {
  def main(args: Array[String]): Unit = {
    // TODD 连接服务器
    val client=new Socket("localhost",9999)
    val out:OutputStream=client.getOutputStream
    out.write(300)
    out.flush()
    out.close()
    println("客户端向服务器发送1")
    client.close()

  }

}
