public class NameablePlanet implements Nameable {
    private String name;

    public NameablePlanet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
