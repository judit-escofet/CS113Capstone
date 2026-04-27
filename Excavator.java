public class Excavator extends ConstructionVehicle {
    private double bucketCapacity;

    public Excavator(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate, String purpose, boolean requiresSpecialLicense, double operatingWeight, double bucketCapacity) {
        super(manufacturer, model, year, vehicleID, isAvailable, dailyRate, purpose, requiresSpecialLicense, operatingWeight);
        this.bucketCapacity = bucketCapacity;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public String vehicleDetails() {
        return "Excavator - " + super.vehicleDetails() + ", Bucket Capacity: " + bucketCapacity + " cubic yards";
    }

    public double calculateRentalPrice(int days) {
        double baseCost = super.calculateRentalPrice(days);
        double bucketSurcharge = bucketCapacity * 10 * days; 
        return baseCost + bucketSurcharge;
    }
}