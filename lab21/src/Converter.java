import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"one", "two", "three"};
        List<String> stringList = arrayToList(stringArray);
        System.out.println("String List: " + stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = arrayToList(intArray);
        System.out.println("Integer List: " + intList);
    }
}
