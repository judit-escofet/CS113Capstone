public abstract class SpecialPurposeVehicle extends Vehicle {
    protected String purpose;
    protected boolean requiresSpecialLicense;

    public SpecialPurposeVehicle(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate, String purpose, boolean requiresSpecialLicense) {
        super(manufacturer, model, year, vehicleID, isAvailable, dailyRate);
        this.purpose = purpose;
        this.requiresSpecialLicense = requiresSpecialLicense;
    }

    public String getPurpose() {
        return purpose;
    }

    public String vehicleDetails() {
        return "Special Purpose Vehicle - " + super.vehicleDetails() + ", Purpose: " + purpose + ", Requires Special License: " + requiresSpecialLicense;
    }
    
}
