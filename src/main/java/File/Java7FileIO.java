package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.util.Scanner;

/**
 * Project: LearnJava
 * Package: File
 * Author:  Novemser
 * 2017/9/5
 */
public class Java7FileIO {
    private String path;

    public Java7FileIO(String path) {
        this.path = path;
    }

    public static void main(String[] args) throws IOException {
        Java7FileIO fileIO = new Java7FileIO("F:\\IAMLARGE.txt");
//        fileIO.writeFileTest();
//        fileIO.readFileTest();
//        fileIO.readFileByBuffer();
//        fileIO.readFileNIO();
        fileIO.readFileCommonIO();
    }

    public void writeFileTest() throws IOException {
        File fileToWrite = new File(path);
        Path filePath = fileToWrite.toPath();

        BufferedWriter writer =
                Files.newBufferedWriter(filePath, Charset.defaultCharset(), StandardOpenOption.APPEND);

        Random random = new Random();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String content = String.valueOf(random.nextInt());
            writer.write(content);
            writer.newLine();
        }
        writer.flush();
        writer.close();
    }

    private Long count = 0L;

    public void readFileTest() throws IOException {
        try (Scanner scanner = new Scanner(Paths.get(path))) {
            while (scanner.hasNext()) {
                count++;
                if (count % 10000000 == 0) {
                    System.out.println(count);
                }
            }
        }
    }

    public void readFileByBuffer() throws IOException {
        BufferedReader reader =
                Files.newBufferedReader(Paths.get(path));
        String line = null;
        while ((line = reader.readLine()) != null) {
            count++;
            if (count % 10000000 == 0) {
                System.out.println(count);
            }
        }
    }

    /**
     * TODO:Pending to validate this method
     *
     * @throws IOException
     */
    public void readFileNIO() throws IOException {
        try (SeekableByteChannel ch = Files.newByteChannel(Paths.get(path))) {
            ByteBuffer bb = ByteBuffer.allocateDirect(10000000);
            for (; ; ) {
                StringBuilder line = new StringBuilder();
                int n = ch.read(bb);
                line.append((char) n);
                // add chars to line
                // ...
                if (line.length() >= 10000000) {
                    System.out.println("Yeah");
                    break;
                }
            }
        }
    }

    public void readFileCommonIO() throws IOException {
        Files.readAllLines(Paths.get(path));
    }
}
