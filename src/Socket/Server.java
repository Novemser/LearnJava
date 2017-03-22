package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Project: LearnJava
 * Package: Socket
 * Author:  Novemser
 * 2017/3/22
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081);

            Socket socket = serverSocket.accept();

            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line = is.readLine();

            System.out.println("Received from client:" + line);

            PrintWriter pw = new PrintWriter(socket.getOutputStream());

            pw.println("Received data:" + line);

            pw.flush();

            pw.close();

            is.close();

            socket.close();

            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
