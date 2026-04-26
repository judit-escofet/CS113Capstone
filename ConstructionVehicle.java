public class ConstructionVehicle extends SpecialPurposeVehicle {
    private double operatingWeight;

    public ConstructionVehicle(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate, String purpose, boolean requiresSpecialLicense, double operatingWeight) {
        super(manufacturer, model, year, vehicleID, isAvailable, dailyRate, purpose, requiresSpecialLicense);
        this.operatingWeight = operatingWeight;
    }

    public double getOperatingWeight() {
        return operatingWeight;
    }

    public String toString() {
        return super.toString() + " Operating Weight: " + operatingWeight;
    }
    
    public double calculateRentalPrice(int days) {
        double baseCost = days * dailyRate;
        double weightSurcharge = operatingWeight * 0.05 * days; 
        return baseCost + weightSurcharge;
    }
    
}
