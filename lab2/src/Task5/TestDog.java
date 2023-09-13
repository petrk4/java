package Task5;

public class TestDog {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];

        dogs[0] = new Dog("Barya", 4);
        dogs[1] = new Dog("Barya2", 3);

        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }

        for (Dog dog : dogs) {
            dog.intoHumanAge();
        }
    }
}