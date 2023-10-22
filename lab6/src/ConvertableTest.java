public class ConvertableTest {
    public static void main(String[] args) {
        double celsius = 25.0;

        Convertable kelvinConverter = new CelsiusToKelvinConverter();
        Convertable fahrenheitConverter = new CelsiusToFahrenheitConverter();

        double kelvin = kelvinConverter.convert(celsius);
        double fahrenheit = fahrenheitConverter.convert(celsius);

        System.out.println(celsius + "°C = " + kelvin + " K");
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
}
