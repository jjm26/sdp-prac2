package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
    }

    public int Task1(List<Integer> a, List<Integer> b) {
        int index = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if (b.get(index) < a.size() - 1 && b.get(index)>-1) {
                sum += a.get(b.get(index));
            }
            index++;
        }
        return sum;
    }
}
