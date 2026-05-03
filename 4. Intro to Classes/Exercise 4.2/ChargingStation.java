
public class ChargingStation {

    private String stationId;
    private String location;
    private boolean available;
    private int totalSessionsServed;

    // Constructor, getters, and these methods:
    public ChargingStation(String stationId, String location, boolean available) {
        this.stationId = stationId;
        this.location = location;
        this.available = available;
    }

    public void startCharging() {
        // sets available = false, throws if already charging
        if (!available) {
            throw new IllegalStateException("Already charging!");
        } else {
            this.available = false;
        }
    }

    public void stopCharging() {
        // sets available = true, increments sessions
        if (!available) {
            this.available = true;
            this.totalSessionsServed++;
        } else {
            throw new IllegalStateException("Not charging!");
        }
    }

    public String getStatus() {
        // returns "AVAILABLE" or "CHARGING"
        return available ? "AVAILABLE" : "CHARGING";
    }

    @Override
    public String toString() {
        return "{ id: '" + stationId + "', location: '" + location + "', available: " + available + " }";
    }
}
