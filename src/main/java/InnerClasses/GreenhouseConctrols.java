package InnerClasses;

import InnerClasses.Conctroller.Conctroller;
import InnerClasses.Conctroller.Event;

/**
 * Created with LearnJava
 * User:Novemser
 * Date:8/6/2016
 * Time:21:32
 */
public class GreenhouseConctrols extends Conctroller {
    private boolean light;

    class LightOn extends Event {

        // 如果不显式调用基类的构造函数 默认会自动调用基类的默认构造函数
        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // 一些硬件代码 用来开灯
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }

    class LightOff extends Event {

        // 如果不显式调用基类的构造函数 默认会自动调用基类的默认构造函数
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // 一些硬件代码 用来关灯
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

    private boolean water;

    public class WaterOn extends Event {

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        public String toString() {
            return "Water is on";
        }
    }

    public class WaterOff extends Event {

        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        public String toString() {
            return "Water is off";
        }
    }

    public class Bell extends Event {

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // 用到了基类的参数
            addEvent(new Bell(delayTime));
        }
    }

}
