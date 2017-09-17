package WTF;

import java.math.BigInteger;
import java.util.Scanner;

public class Son extends Parent {
    static BigInteger maxValue;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int cnt = scanner.nextInt();
        maxValue = new BigInteger("0");
        dfs(cnt, number, 0, "");
        System.out.println(maxValue);
    }

    static void dfs(int cnt, String number, int currentIndex, String currentStr) {

        if (currentStr.length() != 0) {
            BigInteger val = new BigInteger(currentStr);
            if (maxValue.toString().length() >= val.toString().length()) {
                BigInteger orig = new BigInteger(maxValue.toString().substring(0, currentStr.length()));
                if (orig.compareTo(val) > 0) {
                    return;
                }
            }
        }

        if (currentStr.length() == (number.length() - cnt)) {
            BigInteger val = new BigInteger(currentStr);
            if (val.compareTo(maxValue) > 0) {
                maxValue = val;
            }
        }

        if (currentStr.length() > cnt || currentIndex >= number.length()) {
            return;
        }

        dfs(cnt, number, currentIndex + 1, currentStr + number.charAt(currentIndex));
        dfs(cnt, number, currentIndex + 1, currentStr);
    }
}

