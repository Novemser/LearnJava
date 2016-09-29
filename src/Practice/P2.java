package Practice;

import java.util.*;

/**
 *
 * 
 * Created by Novemser on 2016/9/29.
 */
public class P2 {
    public static void main(String... args) {
        P2 runner = new P2();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(runner.doJob(line));
        }
    }

    private String doJob(CharSequence input) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, 1 + map.get(ch));
            } else {
                map.put(ch, 1);
            }
        }

        List<Map.Entry<Character, Integer>> sorted = new ArrayList<>(map.entrySet());

        Collections.sort(sorted, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        StringBuilder builder = new StringBuilder();
        for (Map.Entry item : sorted) {
            builder.append("\'");
            builder.append(item.getKey()).append("\'").append(":");
            builder.append(item.getValue());
            builder.append(", ");
        }

        return builder.toString();
    }
}
