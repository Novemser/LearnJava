package System;

import java.util.Map;

/**
 * Project: LearnJava
 * Package: System
 * Author:  Novemser
 * 2016/10/8
 */
public class EnvironmentVariables {
    public static void main(String... args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ":"
                    + entry.getValue());
        }
    }
}
