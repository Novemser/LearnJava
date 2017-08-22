import com.sun.corba.se.spi.activation._ActivatorStub;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

/**
 * Alibaba Group
 *
 * @author 晨烛
 * @project LearnJava
 * @date 2017/8/9
 */
public class ShenMeGui {

    private int testFinally() {
        Integer integer = Math.toIntExact(2129038120938120939L);
        return integer;
    }

    public static void main(String[] args) {
        //System.out.println(new ShenMeGui().testFinally());
        doTest();
    }

    public static void doTest() {
        ObservableList<Integer> observableList = FXCollections.observableArrayList();
        observableList.addListener((ListChangeListener<Integer>)c -> {
            while (c.next()) {
                System.out.println("Add " + c);
                System.out.println(c.getList().size());
            }
        });
        observableList.addAll(1, 2, 31, 23, 12, 4, 12412, 3, 12, 4, 123, 124, 32, 5, 43, 6, 45);
        observableList.add(3);
        observableList.add(3);
        observableList.add(3);
        observableList.remove(3);
    }
}
