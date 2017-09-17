package LeetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}

public class N56MergeList {
    public static void main(String[] args) {

    }

    public List<Interval> merge(List<Interval> intervals) {
        if (null == intervals || intervals.size() <= 1) {
            return intervals;
        }

        intervals.sort(Comparator.comparingInt(o -> o.start));

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        List<Interval> result = new ArrayList<>();

        for (int i = 1; i < intervals.size(); i++) {
            int nextStart = intervals.get(i).start;
            int nextEnd = intervals.get(i).end;
            if (nextStart <= end) {
                // 更新end
                if (nextEnd > end) {
                    end = nextEnd;
                }
            } else {
                Interval interval = new Interval(start, end);
                result.add(interval);
                start = nextStart;
                end = nextEnd;
            }
        }
        Interval interval = new Interval(start, end);
        result.add(interval);

        return result;
    }
}
