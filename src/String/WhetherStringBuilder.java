package String;

/**
 * Project: LearnJava
 * Package: String
 * Author:  Novemser
 * 2016/10/15
 */
public class WhetherStringBuilder {
    public String implicit(String[] args) {
        String result = "";
        for (int i = 0; i < args.length; i++)
            result += args[i];
        return result;
    }

    public String explicit(String[] args) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < args.length; i++)
            result.append(args[i]);
        return result.toString();
    }
}
