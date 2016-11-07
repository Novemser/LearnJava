package DesignPatterns.Prototype;

/**
 * Project: LearnJava
 * Package: DesignPatterns.Prototype
 * Author:  Novemser
 * 2016/11/2
 */
public class Demo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        Shape clonedShape2 = ShapeCache.getShape("1");
        Shape clonedShape3 = ShapeCache.getShape("1");
        Shape clonedShape4 = ShapeCache.getShape("1");
        System.out.println(clonedShape);
        System.out.println(clonedShape2);
        System.out.println(clonedShape3);
        System.out.println(clonedShape4);
    }
}
