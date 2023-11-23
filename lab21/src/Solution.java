import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution<T, K, V> {
    private T genericVariable;
    private K keyVariable;
    private V valueVariable;

    public Solution(T genericVariable, K keyVariable, V valueVariable) {
        this.genericVariable = genericVariable;
        this.keyVariable = keyVariable;
        this.valueVariable = valueVariable;
    }

    public List<T> newArrayList(T... elements) {
        return Arrays.asList(elements);
    }

    public HashSet<T> newHashSet(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }

    public HashMap<K, V> newHashMap(K[] keys, V[] values) {
        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < Math.min(keys.length, values.length); i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    public static void main(String[] args) {
        Solution<String, Integer, Double> solution = new Solution<>("test", 1, 2.5);

        List<String> stringList = solution.newArrayList("one", "two", "three");
        System.out.println("String List: " + stringList);

        // Передача строк вместо целых чисел
        HashSet<String> stringSet = solution.newHashSet("1", "2", "3", "4", "5");
        System.out.println("String Set: " + stringSet);

        Integer[] keys = {1, 2, 3};
        Double[] values = {2.5, 3.5, 4.5};
        HashMap<Integer, Double> map = solution.newHashMap(keys, values);
        System.out.println("HashMap: " + map);
    }
}