package ThirdParty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tools.ant.util.LeadPipeInputStream;

/**
 * Alibaba Group
 *
 * @author 晨烛
 * @project LearnJava
 * @date 2017/8/15
 */
public class ZhenJing {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> data = new HashMap<>();
        for (int i = 0; i < 600; i++) {
            List<Integer> dataList = new ArrayList<>();
            for (int j = 0; j < 10000; j++) {
                dataList.add(j);
            }
            data.put(i, dataList);
            System.out.println("Generate 10000 tokens ready");
        }
        System.out.println(data.size());
    }
}
