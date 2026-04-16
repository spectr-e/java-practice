# Exercise 1.2 — Temperature Converter

Create `TemperatureConverter.java`

Write three methods:

```java
public static double celsiusToFahrenheit(double celsius) {
}

public static double fahrenheitToCelsius(double fahrenheit) {
}

public static String describeTemperature(double celsius) {
}
// describeTemperature returns: "Freezing", "Cold", "Comfortable", "Hot", "Dangerous"
// based on ranges you define
```

1. Call them from main and print the results.
2. Use meaningful variable names.
3. Don't use magic numbers — define constants:

```java
public static final double FREEZING_POINT = 0.0;
public static final double BODY_TEMPERATURE = 37.0;
```
