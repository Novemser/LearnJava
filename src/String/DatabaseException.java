package String;

/**
 * Project: LearnJava
 * Package: String
 * Author:  Novemser
 * 2016/10/15
 */
public class DatabaseException extends Exception {
    public DatabaseException(int transactionId, int queryId,
                             String msg) {
        // String.format()的内部也是创建一个formatter............
        super(String.format("(t%d, q%d) %s", transactionId, queryId, msg));
    }

    public static void main(String...args) throws DatabaseException {
        throw new DatabaseException(2, 9, "Concurrent writing");
    }
}
