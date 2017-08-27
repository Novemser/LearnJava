package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Project: LearnJava
 * Package: Collections
 * Author:  Novemser
 * 2016/10/8
 */
public class AsListInference {
    public static void main(String...args) {
        List<Snow> snows1 =
                Arrays.asList(new Light(), new Snow(), new Powder(), new Crusty());
        List<Snow> snows2 =
                // 显示类型参数说明
                Arrays.<Snow>asList(new Light(), new Heavy());

        Collections.addAll(snows1, new Light(), new Slush(), new Powder());
    }
}

class Snow{}
class Powder extends Snow{}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow{}
class Slush extends Snow{}