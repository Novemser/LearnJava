package Exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Project: LearnJava
 * Package: Exception
 * Author:  Novemser
 * 2016/10/11
 */
public class LoggingExceptions {
    public void sweet(String...args) {
        for (String s : args)
            System.out.println(s);

    }

    public static void main(String...args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught the " + e);
        }
//        new LoggingExceptions().sweet("23", "2332", "asdsad", "czxcczxc");

        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught the " + e);
        }

    }

}
class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("LoggingExceptions");

    public LoggingException() {
        StringWriter writer = new StringWriter();
        printStackTrace(new PrintWriter(writer));

        logger.severe("你猜");
    }
}
