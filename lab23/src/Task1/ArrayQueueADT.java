package Task1;
import java.util.Arrays;

abstract class ArrayQueueADT implements Queue {
    protected Object[] elements = new Object[10];
    protected int size = 0;
    protected int front = 0;
    protected int rear = 0;

    // Абстрактные методы, которые должны быть реализованы в подклассах
    public abstract void enqueue(Object element);
    public abstract Object element();
    public abstract Object dequeue();

    // Реализация остальных методов как общих для всех подклассов
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
        front = 0;
        rear = 0;
    }

    // Приватный метод для увеличения емкости массива при необходимости
    protected void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * size);
        }
    }
}

// Реализация очереди в виде класса
class ArrayQueue extends ArrayQueueADT {
    // Переопределение абстрактных методов
    public void enqueue(Object element) {
        ensureCapacity();
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

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
}
