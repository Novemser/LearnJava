package IO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Project: LearnJava
 * Package: IO
 * Author:  Novemser
 * 2017/4/3
 */
public class NewIO {
    public static void main(String[] args) {
        RandomAccessFile accessFile = null;
        try {
            accessFile = new RandomAccessFile("F:\\simple.java", "rw");
            FileChannel fileChannel = accessFile.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            int bytesRead = fileChannel.read(buffer);
            System.out.println(bytesRead);
            while (bytesRead != -1) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.print((char)buffer.get());
                }

                buffer.compact();
                bytesRead = fileChannel.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
