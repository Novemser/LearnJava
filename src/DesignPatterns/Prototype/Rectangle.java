package DesignPatterns.Prototype;

/**
 * Project: LearnJava
 * Package: DesignPatterns.Prototype
 * Author:  Novemser
 * 2016/11/2
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("This is rectangle");
    }
}
