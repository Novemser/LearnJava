package InnerClasses;

import java.io.Serializable;

/**
 * Created by hugansen on 2016/8/3.
 */
public class ClassInMethd {
    public Object getObj(String str) {
        
        class TempObj implements Serializable {
            private String value;

            private TempObj(String s) {
                value = s;
            }

            private Object getObjString() {
                return value;
            }
        }

        return new TempObj(str);
    }

    public static void main(String... args) {
        new ClassInMethd().getObj("Shit");
    }
}
