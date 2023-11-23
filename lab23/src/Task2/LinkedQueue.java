package Task2;

public class LinkedQueue<E> implements Queue<E> {
    private Node<E> front;  // Указатель на начало очереди
    private Node<E> rear;   // Указатель на конец очереди
    private int size;       // Текущий размер очереди

    // Конструктор
    public LinkedQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Реализация методов интерфейса Queue
    @Override
    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element, null);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.setNext(newNode);
        }
        rear = newNode;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        E removedElement = front.getElement();
        front = front.getNext();
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return removedElement;
    }

    @Override
    public E element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.getElement();
    }

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
        front = null;
        rear = null;
        size = 0;
    }

    // Вспомогательный класс Node
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}

