public class Monitor {
    private String model;
    private int sizeInches;

    public Monitor(String model, int sizeInches) {
        this.model = model;
        this.sizeInches = sizeInches;
    }

    @Override
    public String toString() {
        return model + " (" + sizeInches + " inches)";
    }
}
