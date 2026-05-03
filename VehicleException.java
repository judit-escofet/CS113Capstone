public class VehicleException extends Exception {

    public VehicleException(String message) {
        super(message);
    }


    public static VehicleException unavailable(int vehicleID) {
        return new VehicleException("Vehicle " + vehicleID + " is not available for rental.");
    }

    public static VehicleException invalidDays(int days) {
        return new VehicleException("Invalid rental duration: " + days + " day(s). Must be at least 1.");
    }

    public static VehicleException fleetFull(int capacity) {
        return new VehicleException("Fleet is at capacity (" + capacity + " vehicles). Cannot add more.");
    }
}
