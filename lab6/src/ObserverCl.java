import java.util.ArrayList;
import java.util.List;

// Интерфейс для наблюдателей
interface Observer {
    void update(String state);
}

// Класс-наблюдатель
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println(name + " received update: " + state);
    }
}

// Класс, реализующий наблюдаемый объект
class ObservableStringBuilder {
    private StringBuilder stringBuilder;
    private List<Observer> observers = new ArrayList<>();

    public ObservableStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    // Метод для добавления наблюдателя
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Метод для удаления наблюдателя
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Метод для установки нового значения
    public void setValue(String value) {
        stringBuilder.setLength(0);
        stringBuilder.append(value);
        notifyObservers();
    }

    // Метод для получения текущего значения
    public String getValue() {
        return stringBuilder.toString();
    }

    // Метод для оповещения наблюдателей
    private void notifyObservers() {
        String state = stringBuilder.toString();
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}

public class ObserverCl {
    public static void main(String[] args) {
        ObservableStringBuilder observableStringBuilder = new ObservableStringBuilder();

        // Создаем наблюдателей
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        // Добавляем наблюдателей
        observableStringBuilder.addObserver(observer1);
        observableStringBuilder.addObserver(observer2);

        // Изменяем состояние и оповещаем наблюдателей
        observableStringBuilder.setValue("New Value");

        // Удаляем одного из наблюдателей
        observableStringBuilder.removeObserver(observer1);

        // Изменяем состояние снова
        observableStringBuilder.setValue("Another Value");
    }
}
