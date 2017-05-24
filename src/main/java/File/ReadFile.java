package File;

import java.io.*;

/**
 * Project: LearnJava
 * Package: File
 * Author:  Novemser
 * 2017/3/25
 */
public class ReadFile {
    private static final String filePath = "F:\\Proxy.txt";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter pw = new PrintWriter("Out.txt")) {
            pw.println("This is a file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
