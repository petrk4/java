public class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double value) {
        return (value * 9 / 5) + 32;
    }
}
