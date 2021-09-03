package homework.lesson13.task1;

import java.util.ArrayList;
import java.util.List;

public class FilterHelper {

    public static List<Integer> filterInteger(List<Integer> list, Filter filter) {
        List<Integer> result = new ArrayList<>();
        if (list == null) return null;
        for (Integer integer : list) {
            if (filter.filter(integer)) result.add(integer);
        }
        return result;
    }
}
