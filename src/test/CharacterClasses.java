package test;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Collections;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2016/10/8
 */
public class CharacterClasses {
    public static void main(String...args) {
        System.out.println(Character.isLetter('2'));
        System.out.println(Character.isDefined('2'));
        System.out.println(Character.isDigit('2'));
        System.out.println(Character.toTitleCase('e'));
        System.out.println(Character.toUpperCase('d'));
        String ll = "Sss";
        ll = ll.concat("@22");
        System.out.println(ll);
        // Default is 16
        StringBuilder builder = new StringBuilder(16);
        builder.append(";");

        System.out.println(String.format("The param is %1$d, %2$05d", 4, 9));

        int i2 = Integer.valueOf("2");
    }
}
