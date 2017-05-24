package Collections;

import java.util.*;

import static javafx.scene.input.KeyCode.T;

/**
 * Project: LearnJava
 * Package: Collections
 * Author:  Novemser
 * 2016/10/8
 */
public class SetClasses {
    public static void main(String...args) {
        // 速度最快 散列存储
        Set<String> set1 = new HashSet<>();
        // 排序 红黑二叉树
        // CaseInsensitive就是按照字母排序
        Set<String> set2 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        // 顺序存储 链表
        Set<String> set3 = new LinkedHashSet<>();

        addToCollection(set1);
        addToCollection(set2);
        addToCollection(set3);
    }

    public static void addToCollection(Collection<String> collection) {
        collection.add("dls");
        collection.add("cWWW");
        collection.add("bandier");
        collection.add("avouch");
        collection.add("Adieu");
        System.out.println(collection.getClass().getName() + " " + collection);
    }
}
