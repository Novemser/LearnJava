package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Novemser on 2016/9/29.
 */
public class P1 {
    public static void main(String...args) {
        P1 runner = new P1();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] res = runner.doJob(line.split(" "));
            for (String item : res) {
                System.out.printf(item + " ");
            }
            System.out.println();

        }
    }

    private String[] doJob(String[] input) {
        Arrays.parallelSort(input, (o1, o2) -> {
            if (o1.length() > o2.length())
                return -1;
            if (o1.length() < o2.length())
                return 1;

            return o1.compareTo(o2);
        });
        return input;
    }
}
