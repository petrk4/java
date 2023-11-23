package Task1;

public interface Queue {
    void enqueue(Object element);

    // Получить первый элемент в очереди
    Object element();

    // Удалить и вернуть первый элемент в очереди
    Object dequeue();

    // Получить текущий размер очереди
    int size();

    // Проверить, является ли очередь пустой
    boolean isEmpty();

    // Очистить очередь
    void clear();
}
