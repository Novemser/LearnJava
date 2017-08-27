package Annotation;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Novemser on 2016/9/22.
 */



public class AppOran {
    // Use this annotation to prevent warning from adding two different
    // types of object into an Arraylist

    public void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    @SuppressWarnings("unchecked")
    public static void main(String...a) {
        List list = new ArrayList();
        String[] sa1 = {
                "Ch1",
                "val2",
                "destination",
                "ss",
                UUID.randomUUID().toString(),
                UUID.randomUUID().toString(),
                UUID.randomUUID().toString(),
                UUID.randomUUID().toString(),
                String.valueOf(2)
        };
        String[] destination = new String[sa1.length];
        System.arraycopy(sa1, 0, destination, 0, sa1.length);
        list.add(new Object());
        list.add(22);

        for (int i = 0; i < destination.length; i++) {
            destination[i] = "TEST";
        }

        for (String str : destination) {
            System.out.println(str);
        }

//        OUTSIDE:
//        for (Object obj : list) {
//            System.out.println(obj.toString());
//            for (int i = 0; i < Integer.MAX_VALUE; i++) {
//                System.out.println(i);
//                if (i==200) {
//                    break OUTSIDE;
//                }
//            }
//        }
//
//        new Object() {
//            void doSomething() {
//                System.out.println("Inner class");
//            }
//        }.doSomething();
    }
}
