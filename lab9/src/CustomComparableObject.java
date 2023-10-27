public class CustomComparableObject implements Comparable<CustomComparableObject> {
    private int value;

    public CustomComparableObject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(CustomComparableObject other) {
        // Сравнение объектов на основе значения value
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return "CustomComparableObject{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
        CustomComparableObject obj1 = new CustomComparableObject(10);
        CustomComparableObject obj2 = new CustomComparableObject(5);

        System.out.println("Object 1: " + obj1);
        System.out.println("Object 2: " + obj2);

        // Сравнение объектов
        int comparisonResult = obj1.compareTo(obj2);
        if (comparisonResult < 0) {
            System.out.println("Object 1 is less than Object 2");
        } else if (comparisonResult > 0) {
            System.out.println("Object 1 is greater than Object 2");
        } else {
            System.out.println("Object 1 is equal to Object 2");
        }
    }
}
