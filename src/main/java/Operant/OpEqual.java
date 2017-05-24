package Operant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by hugansen on 9/13/2016.
 */
public class OpEqual {
    public static void main(String...args) {

        short a = 4;

        long b = 7;
        a += b;
        // Equals:
        // a = (short)((a)+(b));

        // Compile time error:
        // a = a + b;
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add(" ");
        linkedList.add(" ");

        //System.out.println(a);
        //String[] ast = {"", "", "23333"};
        //ArrayList<String> list =  new ArrayList<>(Arrays.asList(ast));

        //list.forEach(System.out::println);
    }
}
