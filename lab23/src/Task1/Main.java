package Task1;

public class Main {
    public static void main(String[] args) {
        testArrayQueueModule();
        testArrayQueue();
        testArrayQueueADT();
    }

    private static void testArrayQueueModule() {
        ArrayQueueModule queueModule = new ArrayQueueModule();

        // Тест 1: Добавление элементов в очередь
        queueModule.enqueue(1);
        queueModule.enqueue(2);
        if (queueModule.size() != 2) {
            System.out.println("Test 1 failed: Incorrect size");
        }

        // Тест 2: Извлечение элемента из очереди
        if ((int) queueModule.dequeue() != 1 || queueModule.size() != 1) {
            System.out.println("Test 2 failed: Incorrect dequeue or size");
        }

        // Тест 3: Получение элемента из очереди
        if ((int) queueModule.element() != 2) {
            System.out.println("Test 3 failed: Incorrect element");
        }

        // Тест 4: Очистка очереди
        queueModule.clear();
        if (!queueModule.isEmpty()) {
            System.out.println("Test 4 failed: Queue not cleared");
        }
    }

    private static void testArrayQueue() {
        ArrayQueue queue = new ArrayQueue();

        // Тест 5: Добавление элементов в очередь
        queue.enqueue(3);
        queue.enqueue(4);
        if (queue.size() != 2) {
            System.out.println("Test 5 failed: Incorrect size");
        }

        // Тест 6: Извлечение элемента из очереди
        if ((int) queue.dequeue() != 3 || queue.size() != 1) {
            System.out.println("Test 6 failed: Incorrect dequeue or size");
        }

        // Тест 7: Получение элемента из очереди
        if ((int) queue.element() != 4) {
            System.out.println("Test 7 failed: Incorrect element");
        }

        // Тест 8: Очистка очереди
        queue.clear();
        if (!queue.isEmpty()) {
            System.out.println("Test 8 failed: Queue not cleared");
        }
    }

    private static void testArrayQueueADT() {
        ArrayQueueADT queueADT = new ArrayQueue();

        // Тест 9: Добавление элементов в очередь через ADT
        queueADT.enqueue(7);
        queueADT.enqueue(8);
        if (queueADT.size() != 2) {
            System.out.println("Test 9 failed: Incorrect size");
        }

        // Тест 10: Извлечение элемента из очереди через ADT
        if ((int) queueADT.dequeue() != 7 || queueADT.size() != 1) {
            System.out.println("Test 10 failed: Incorrect dequeue or size");
        }

        // Тест 11: Получение элемента из очереди через ADT
        if ((int) queueADT.element() != 8) {
            System.out.println("Test 11 failed: Incorrect element");
        }

        // Тест 12: Очистка очереди через ADT
        queueADT.clear();
        if (!queueADT.isEmpty()) {
            System.out.println("Test 12 failed: Queue not cleared");
        }

        // Тест 13: Дополнительный тест на пустую очередь через ADT
        if (!queueADT.isEmpty() || queueADT.size() != 0) {
            System.out.println("Test 13 failed: Incorrect empty state");
        }

        // Попытка извлечения из пустой очереди через ADT
        try {
            queueADT.dequeue();
            System.out.println("Test 14 failed: Expected IllegalStateException, but no exception was thrown");
        } catch (IllegalStateException e) {
            // Ожидаемый результат
        }

        // Попытка получения элемента из пустой очереди через ADT
        try {
            queueADT.element();
            System.out.println("Test 15 failed: Expected IllegalStateException, but no exception was thrown");
        } catch (IllegalStateException e) {
            // Ожидаемый результат
        }
    }
}
