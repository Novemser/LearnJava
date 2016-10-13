package Exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Project: LearnJava
 * Package: Exception
 * Author:  Novemser
 * 2016/10/11
 */
public class LoggingExceptions {
    Map<String, Integer> map = new Hashtable<>();

    class InnerClass {
        Map<String, Integer> map = new Hashtable<>();

        InnerClass() {
            System.out.println("Calling from inner class");
        }

        public Map<String, Integer> getOuterThis() {

            return LoggingExceptions.this.map;
        }
    }

    public void sweet(Object...args) {
        for (Object s : args)
            System.out.println(s);
    }

    public static void main(String...args) {
        int code = new LoggingExceptions().hashCode();
        System.out.println(code);

        LoggingExceptions lg = new LoggingExceptions();

        InnerClass innerClass = lg.new InnerClass();
        lg.new InnerClass();

//        try {
//            throw new LoggingException();
//        } catch (LoggingException e) {
//            System.err.println("Caught the " + e);
//        }
//        new LoggingExceptions().sweet(new IterableClass<Double>(), "2332", "asdsad", "czxcczxc");

//        try {
//            throw new LoggingException();
//        } catch (LoggingException e) {
//            System.err.println("Caught the " + e);
//        }

    }

}

class IterableClass<T> implements Iterable<T> {
    @Override
    public String toString() {
        return getClass().getCanonicalName();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }
}

class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("LoggingExceptions");

    public LoggingException() {
        StringWriter writer = new StringWriter();
        printStackTrace(new PrintWriter(writer));
        logger.severe("你猜~");
    }

    @Override
    public String getMessage() {
        return "This is a message";
    }
}
