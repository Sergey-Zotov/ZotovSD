package test.homework.lesson13.task1;

import homework.lesson13.task1.Filter;
import homework.lesson13.task1.FilterHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FilterHelperTest {

    @Test
    @DisplayName("фильтрует, оставляя значения, которые меньше 5")
    public void testFilterLass5() {
        List<Integer> list = Arrays.asList(-20, 0, 4, 5, 7, 9);
        Filter filter = value -> value < 5;
        List<Integer> result = FilterHelper.filterInteger(list, filter);
        Assertions.assertEquals(result, Arrays.asList(-20, 0, 4));
    }

    @Test
    @DisplayName("фильтрует, оставляя значение, которые больше 10")
    public void testFilterMore10() {
        List<Integer> list = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        Filter filter = value -> value > 10;
        List<Integer> result = FilterHelper.filterInteger(list, filter);
        Assertions.assertEquals(result, Arrays.asList(15, 25));
    }

    @Test
    @DisplayName("фильтрует, оставляя значения, содержащиеся в списке (-20, 4, 9, 12, 15)")
    public void testFilterInList() {
        List<Integer> list = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        Filter filter = value -> Arrays.asList(-20, 4, 9, 12, 15).contains(value);
        List<Integer> result = FilterHelper.filterInteger(list, filter);
        Assertions.assertEquals(result, Arrays.asList(-20, 4, 9, 15));
    }

    @Test
    @DisplayName("фильтрует, оставляя только значения, которые в списке не повторяются.")
    public void onlyUniqueListTest() {
        List<Integer> list = Arrays.asList(-10, -7, 5, 15, 5, -2, 4, 15);
        Filter filter = value -> list.indexOf(value) == list.lastIndexOf(value);
        List<Integer> result = FilterHelper.filterInteger(list, filter);
        Assertions.assertEquals(result, Arrays.asList(-10, -7, -2, 4));
    }
}
