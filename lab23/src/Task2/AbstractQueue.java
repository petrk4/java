package Task2;

public abstract class AbstractQueue<E> implements Queue<E> {
    protected int size;  // Текущий размер очереди

    // Конструктор
    public AbstractQueue() {
        this.size = 0;
    }

    // Реализация методов интерфейса Queue
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        doClear();
    }

    // Абстрактные методы, которые должны быть реализованы в подклассах
    protected abstract void doEnqueue(E element);

    protected abstract E doDequeue();

    protected abstract E doElement();

    protected abstract void doClear();
}

