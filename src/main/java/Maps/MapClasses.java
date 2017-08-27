package Maps;

import javax.net.ssl.SNIHostName;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Project: LearnJava
 * Package: Maps
 * Author:  Novemser
 * 2016/10/8
 */
class Snow {}
class Powder extends Snow {}
public class MapClasses {

    public static Map<String, List<? extends Snow>>
        whatTheHellIsThis = new Hashtable<>();

    static {
        whatTheHellIsThis.put("hell",
                Arrays.asList(new Powder(), new Powder(), new Snow()));
    }

    public static void main(String...args) {
        // Interesting
        Map<String, ArrayList<Integer>> map1 = new ConcurrentHashMap<>();
        Map<String, ArrayList<Integer>> map2 = new TreeMap<>();
        Map<String, ArrayList<Integer>> map3 = new Hashtable<>();
        Map<String, ArrayList<Integer>> map4 = new WeakHashMap<>();
        Map<String, ArrayList<Integer>> map5 = new IdentityHashMap<>();
    }
}
