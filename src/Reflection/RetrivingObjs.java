package Reflection;

import polymorphism.Circle;

import java.util.*;

/**
 * Created by Novemser on 2016/9/13.
 */
public class RetrivingObjs {
    public static void main(String...args) {
        Class c = "This is a string".getClass();
        Class circ = Circle.class.getClass();

        List<String> arrString = new ArrayList<>();
        List<String> linkedString = new LinkedList<>();

        Set<String> stringSet = new HashSet<>();

        // boolean is a primitive type and cannot be dereferenced.
        boolean b;
        // Class cd = b.getClass();   // compile-time error

        Class cd = boolean.class;  // correct

        Class annotationClass = java.lang.annotation.Annotation.class;

        Class cDA = null;
        try {
            cDA = Class.forName("[Ljava.lang.String;");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println(cDA);
        }


//        System.out.println(stringSet.getClass());
//        System.out.println(arrString.getClass());
//        System.out.println(linkedString.getClass());
    }
}
