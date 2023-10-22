public class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double value) {
        return value + 273.15;
    }
}
