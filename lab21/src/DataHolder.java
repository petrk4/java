public class DataHolder<T> {
    private T[] data;

    public DataHolder(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public T getElementAtIndex(int index) {
        if (index >= 0 && index < data.length) {
            return data[index];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        DataHolder<Integer> dataHolder = new DataHolder<>(intArray);
        System.out.println("Element at index 2: " + dataHolder.getElementAtIndex(2));
    }
}
