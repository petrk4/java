package Task1;

public class ConcreteComplex implements Complex {
    private int real;
    private int image;

    public ConcreteComplex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public int getReal() {
        return real;
    }

    @Override
    public int getImage() {
        return image;
    }
}
