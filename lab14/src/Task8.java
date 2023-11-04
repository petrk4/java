import java.util.ArrayList;
import java.util.List;

interface Filter {
    boolean apply(Object o);
}

public class Task8 {
    public static void main(String[] args) {
        // Пример работы filter на массиве строк
        String[] stringArray = {"apple", "", "banana", "", "cherry"};
        Filter stringFilter = new Filter() {
            @Override
            public boolean apply(Object o) {
                return !(((String) o).isEmpty());
            }
        };
        Object[] filteredStringArray = filter(stringArray, stringFilter);
        for (Object s : filteredStringArray) {
            System.out.println((String) s);
        }

        // Пример работы filter на массиве объектов
        Integer[] intArray = {1, 2, 0, 3, 0, 4};
        Filter intFilter = new Filter() {
            @Override
            public boolean apply(Object o) {
                return !((Integer) o == 0);
            }
        };
        Object[] filteredIntArray = filter(intArray, intFilter);
        for (Object i : filteredIntArray) {
            System.out.println((Integer) i);
        }
    }

    public static Object[] filter(Object[] array, Filter filter) {
        List<Object> resultList = new ArrayList<>();
        for (Object item : array) {
            if (filter.apply(item)) {
                resultList.add(item);
            }
        }
        return resultList.toArray();
    }
}