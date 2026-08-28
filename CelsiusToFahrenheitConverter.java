public class CelsiusToFahrenheitConverter {

    static float celsiusToFahrenheit(float celsius) {

        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        float celsius = 100;

        System.out.println(celsiusToFahrenheit(celsius));
    }
}