package Annotation;

import java.lang.annotation.*;

/**
 * Project: LearnJava
 * Package: Annotation
 * Author:  Novemser
 * 2016/11/12
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    int studentAge() default 18;
    String studentName() default "Alex";
    String stuAddress() default "Caoan Highway";
    String stuStream() default "SSE";
    int count() ;
}
