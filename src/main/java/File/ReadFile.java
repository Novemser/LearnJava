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

    public static void main(String[] args) throws IOException {
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            String line;
//
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (PrintWriter pw = new PrintWriter("Out.txt")) {
//            pw.println("This is a file");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        ReadFile fileReader = new ReadFile();

        fileReader.readFile(ReadFile.class.getClassLoader().getResource("1.txt").getPath());
    }

    private void readFile(String filePath) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        }

    }
}
