package Concurrent;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Project: LearnJava
 * Package: Concurrent
 * Author:  Novemser
 * 2017/3/22
 */
public class Maps {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws InterruptedException {
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Hashtable hashtable = new Hashtable();

        // Yes
        hashMap.put(null, null);

        // Yes
        linkedHashMap.put(null, null);

        // Key Not null, value nullable
        //treeMap.put(null, null);

        // No
        //concurrentHashMap.put(null, null);
Thread.sleep(214786811);
        // No
//        hashtable.put(null, null);
    }
}