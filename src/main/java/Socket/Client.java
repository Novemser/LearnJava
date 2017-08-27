package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Project: LearnJava
 * Package: Socket
 * Author:  Novemser
 * 2017/3/22
 */
public class Client {
    public static void main(String[] args) {
        String msg = "Data from client";
        try {
            Socket socket = new Socket("127.0.0.1", 8081);
            PrintWriter pw = new PrintWriter(socket.getOutputStream());

            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            pw.println(msg);

            pw.flush();
            is.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
