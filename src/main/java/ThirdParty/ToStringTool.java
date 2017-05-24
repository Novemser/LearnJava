package ThirdParty;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * Project: LearnJava
 * Package: ThirdParty
 * Author:  Novemser
 * 2017/5/24
 */
public class ToStringTool {
    public static void main(String[] args) {
        ToStringTool.Vehicle vehicle = new Vehicle();
        System.out.println(vehicle);
    }

    static class Vehicle {
        private int maxSpeed = 10;
        private String model = "Audio";

        @Override
        public String toString() {
//            return ToStringBuilder.reflectionToString(this, new CustomToStringStyle());
            return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
        }
    }

    public static class CustomToStringStyle extends ToStringStyle {

        // 给value增加时间
        @Override
        protected void appendDetail(StringBuffer buffer, String fieldName, Object value) {
            buffer.append(new Date());
        }
    }
}
