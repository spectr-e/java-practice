
public class ChargingStationTest {

    public static void main(String[] args) {
        ChargingStation station1 = new ChargingStation(
                "A001", "Kabete", true
        );

        System.out.println(station1);

        station1.startCharging();
        System.out.println(station1.getStatus());
        
        station1.stopCharging();
        System.out.println(station1.getStatus());
        
        station1.startCharging();
    }
}
