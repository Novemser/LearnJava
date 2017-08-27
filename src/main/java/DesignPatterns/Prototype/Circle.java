package DesignPatterns.Prototype;

/**
 * Project: LearnJava
 * Package: DesignPatterns.Prototype
 * Author:  Novemser
 * 2016/11/2
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("This is a circle");
    }
}
