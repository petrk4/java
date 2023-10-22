public class NameableCar implements Nameable {
    private String name;

    public NameableCar(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
