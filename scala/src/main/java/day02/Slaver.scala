package day02

import java.io.InputStream
import java.net.{ServerSocket,Socket}

object Slaver {
  def main(args: Array[String]): Unit = {
    // TODD 启动服务器
    val server=new ServerSocket(9999)
    println("服务器已经启动，等待客户端的连接...")
    val client:Socket = server.accept()
    val in:InputStream=client.getInputStream
    val i:Int=in.read()
    println("从客户端接收的数据为:"+i)
    in.close()
    client.close()
  }

}
