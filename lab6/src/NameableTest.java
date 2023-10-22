public class NameableTest {
    public static void main(String[] args) {
        Nameable earth = new NameablePlanet("Earth");
        Nameable myCar = new NameableCar("Toyota");

        System.out.println("Planet name: " + earth.getName());
        System.out.println("Car name: " + myCar.getName());
    }
}
