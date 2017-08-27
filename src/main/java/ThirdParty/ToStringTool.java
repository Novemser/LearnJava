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
//        ToStringTool.Vehicle vehicle = new Vehicle();
//        System.out.println(vehicle);
        int[] a = {1, 4, 155, 3, 4, 0, 9};
        new ToStringTool().quickSort(a, 0, a.length - 1);
        System.out.println();
    }

    private void quickSort(int[] nums, int start, int end) {
        if (start >= end) return;

        int pos = partition(nums, start, end);
        if (start < pos) quickSort(nums, start, pos - 1);
        if (pos < end) quickSort(nums, pos + 1, end);
    }

    private int partition(int[] nums, int start, int end) {
        if (start >= end) return start;

        int pivito = nums[start];

        int temp = nums[end];
        nums[end] = pivito;
        nums[start] = temp;

        int index = start - 1;
        while (start < end) {
            if (nums[start] < nums[end]) {
                index++;
                if (index != start) {
                    temp = nums[index];
                    nums[index] = nums[start];
                    nums[start] = temp;
                }
            }
            start++;
        }
        index++;
        temp = nums[index];
        nums[index] = nums[end];
        nums[end] = temp;

        return index;
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
