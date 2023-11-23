package Task2;

// Класс клиента
public class Client {
    private Chair chair;

    public void sit() {
        // Возможно, здесь будет использоваться chair для каких-то действий
        System.out.println("Sitting on a chair.");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}

