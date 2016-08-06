package InnerClasses.Conctroller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with LearnJava
 * User:Novemser
 * Date:8/6/2016
 * Time:21:06
 */
public class Conctroller {
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event event) {
        eventList.add(event);
    }

    /**
     * 你并不知道Event到底做了什么
     * 只需要去调用action就可以了
     * 实现了很好的解耦
     * 即 使得变化的事物和不变的事务分离
     */
    public void run() {
        while (!eventList.isEmpty()) {
            for (Event event : new ArrayList<Event>(eventList)) {
                if (event.ready()) {
                    System.out.println(event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }
}
