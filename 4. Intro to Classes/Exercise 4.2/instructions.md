# Exercise 4.2

## A Second Class: ChargingStation

Create `ChargingStation.java`, a preview of your capstone:

```java
public class ChargingStation {
    private String stationId;
    private String location;
    private boolean available;
    private int totalSessionsServed;

    // Constructor, getters, and these methods:
    public void startCharging() { ... }   // sets available = false, throws if already charging
    public void stopCharging()  { ... }   // sets available = true, increments sessions
    public String getStatus()   { ... }   // returns "AVAILABLE" or "CHARGING"

    @Override
    public String toString() { ... }
}
```

Write a main that simulates a simple charging session:

1. Station starts available,
2. Starts charging,
3. Attempts to start again (exception!),
4. Stops charging, check sessions served.
