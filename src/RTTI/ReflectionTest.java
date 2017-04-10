package RTTI;

/**
 * Project: LearnJava
 * Package: RTTI
 * Author:  Novemser
 * 2017/4/6
 */
public class ReflectionTest {
    public static void main(String[] args) {
        Class<?> fc = ReflectionTest.class;
        fc.getDeclaredMethods();
        fc.getMethods();
    }
}
