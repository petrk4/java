package Task1;
import java.util.Arrays;

public class ArrayQueueModule implements Queue {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int front = 0;
    private static int rear = 0;

    // Проверка инварианта
    // Инвариант: size >= 0 && size <= elements.length
    // Инвариант: front >= 0 && front < elements.length
    // Инвариант: rear >= 0 && rear < elements.length
    // Инвариант: size == 0 => front == rear

    // Постусловие: size = size' + 1, front = front', rear = (rear' + 1) % elements.length
    public void enqueue(Object element) {
        ensureCapacity();
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    // Постусловие: size > 0
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

    // Постусловие: size = size' - 1, front = (front' + 1) % elements.length
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object removedElement = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return removedElement;
    }

    // Постусловие: результат - текущий размер очереди
    public int size() {
        return size;
    }

    // Постусловие: результат - true, если очередь пуста, иначе - false
    public boolean isEmpty() {
        return size == 0;
    }

    // Постусловие: size = 0, front = 0, rear = 0
    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
        front = 0;
        rear = 0;
    }

    // Приватный метод для увеличения емкости массива при необходимости
    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * size);
        }
    }
}
