package cn.edu.nuaa.little1.http;

import cn.edu.nuaa.little1.ServerS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

    public static final String path="E:\\Users\\zongz\\Desktop\\little1\\ServerS\\src\\main\\resources\\test1.csv";
    public static void main(String[] args) {
        try {
            //1.建立一个服务器Socket(ServerSocket)绑定指定端口
            ServerSocket serverSocket=new ServerSocket(8800);
            //2.使用accept()方法阻止等待监听，获得新连接
            Socket socket=serverSocket.accept();
            //3.获得输入流
            InputStream is=socket.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            //获得输出流
            OutputStream os=socket.getOutputStream();
            PrintWriter pw=new PrintWriter(os);
            //4.读取用户输入信息
            String cmd=null;
            String reply="";
            while(!((cmd=br.readLine())==null)){
                System.out.println("接受命令:"+cmd);
                reply=ServerS.parse(path,cmd);
            }
            //给客户一个响应
            pw.write(reply);
            pw.flush();
            //5.关闭资源
            pw.close();
            os.close();
            br.close();
            is.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
