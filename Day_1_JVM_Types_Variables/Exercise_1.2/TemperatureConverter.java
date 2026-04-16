public class TemperatureConverter {
    public static final double FREEZING_POINT = 0.0;
    public static final double BODY_TEMPERATURE = 37.0;

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;

    }

    public static String describeTemperature(double celsius) {
        // describeTemperature returns: "Freezing", "Cold", "Comfortable", "Hot", "Dangerous"
        // based on ranges you define
        if (celsius <= FREEZING_POINT) {
            return "Freezing";
        }
        if (celsius > FREEZING_POINT && celsius < BODY_TEMPERATURE) {
            return "Cold";
        }
        if (celsius == BODY_TEMPERATURE) {
            return "Comfortable";
        }
        if (celsius >= BODY_TEMPERATURE + 5) {
            return "Dangerous";
        }
        return "Hot";
    }

    public static void main(String[] args) {

        System.out.println("40.5°C to °F - " + celsiusToFahrenheit(40.5));
        System.out.println("40.5°F to °C - " + fahrenheitToCelsius(40.5));
        System.out.println("It should be [HOT] - " + describeTemperature(40.5));
        System.out.println("It should be [DANGEROUS] - " + describeTemperature(43.1));
        System.out.println("It should be [COLD] - " + describeTemperature(24.6));
        System.out.println("It should be [FREEZING] - " + describeTemperature(-1.4));
        System.out.println("It should be [COMFORTABLE] - " + describeTemperature(37.0));
    }
}
