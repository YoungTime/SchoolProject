package com.example.a01378359.schoolproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by 01378359 on 2018/7/20.
 */

public class MySocket {
    public static final String HOST = "127.0.0.1";
    public static final int PORT = 8080;


    private void getMessage(){
        try {
            Socket socket = new Socket(HOST,PORT);
            // 获取输入流，和输出流一样，我们也要使用 InputStreamReader 和 BufferedReader
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                // 这里我们先打印获取的 json 字符串
                System.out.println(line);
                int a = Integer.valueOf(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
