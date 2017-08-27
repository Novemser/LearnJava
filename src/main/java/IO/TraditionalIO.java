package IO;

import java.io.*;

/**
 * Project: LearnJava
 * Package: IO
 * Author:  Novemser
 * 2017/4/3
 */
public class TraditionalIO {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream("F:\\simple.java"));

            byte[] buf = new byte[2048];

            int bytesRead = in.read(buf);

            while (bytesRead != -1) {
                for (int i = 0; i < bytesRead; i++)
                    System.out.print((char)buf[i]);

                bytesRead = in.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
