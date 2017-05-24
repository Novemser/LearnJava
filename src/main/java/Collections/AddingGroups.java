package Collections;

import java.util.*;


/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2016/10/8
 */
public class AddingGroups {
    public static void main(String... args) {
        // 带参数的初始化array
        List<String> strings =
                new ArrayList<>(Arrays.asList("Hello", "Heller"));
        strings.add("Test?");

        Collection<Integer> collection =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 11, 22));
        testAdding(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 11, 22)));

        Integer[] moreIntegers = {2, 233333, 3222222};
        System.out.println(collection);
        // M1
        collection.addAll(Arrays.asList(moreIntegers));
        System.out.println(collection);
        // M2
        Collections.addAll(collection, 9, 0, 29, 99);
        // M3
        Collections.addAll(collection, moreIntegers);
        System.out.println(collection);

        // Backup
        List<Integer> list = Arrays.asList(1, 2, 90909);
        List<Integer> lll = list.subList(0,1);
//        Collections.shuffle(list, new Random(24));
//        list.set(0, 34);
        // Runtime error!~
        // Why?
        // Arrays.asList返回的是底层由数组实现的array
        // 所以不能进行add或者delete等改变长度的操作
//        list.add(123000);
        Iterator<Integer> iterator = collection.iterator();

        System.out.println("B4:" + collection);

        // 成功删除所有内容
//        while (iterator.hasNext()) {
//            iterator.next();
//            iterator.remove();
//            System.out.println("Removed one");
//        }
        // 只会删掉前一半 因为size()会在删除的时候变化
        for (int i = 0; i < collection.size(); i++) {
            iterator.next();
            iterator.remove();
            System.out.println("Removed one");
        }
        System.out.println("After:" + collection);
//        list.retainAll(lll);
    }

    public static void testAdding(ArrayList<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        {
            while (iterator.hasNext()) {
                System.out.println("Next index:" + iterator.nextIndex());
                iterator.next();
                System.out.println("Pre index:" + iterator.previousIndex());
            }
        }
    }
}


