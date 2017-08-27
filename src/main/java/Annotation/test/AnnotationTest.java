package Annotation.test;

import Annotation.MyAnnotation;

/**
 * Project: LearnJava
 * Package: Annotation.test
 * Author:  Novemser
 * 2016/11/12
 */

public class AnnotationTest {
    public static void main(String[] args) {
        AnnotationTest test = new AnnotationTest();

    }

    @MyAnnotation(count = 10)
    public void usingAnnotations() {
    }
}
