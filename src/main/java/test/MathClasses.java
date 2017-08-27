package test;

import polymorphism.RandomShapeGenerator;

import java.util.Random;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2016/10/8
 */
public class MathClasses {
    public static void main(String...args) {
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.ceil(2.2));
        System.out.println(Math.floor(2.2));
        System.out.println(Math.round(2.2));
        System.out.println(Math.round(2.5));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sin(2.22222));
        System.out.println(Math.sqrt(2.3333));
        System.out.println("Rand:" + Math.random());
        System.out.println("Bit:" + Integer.bitCount(4096));
    }
}
