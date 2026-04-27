public class Motorcycle extends PersonalVehicle {
    private boolean hasHelmetIncluded;
    private int engineSize;

    public Motorcycle(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate, int seatingCapacity, boolean hasHelmetIncluded, int engineSize) {
        super(manufacturer, model, year, vehicleID, isAvailable, dailyRate, seatingCapacity);
        this.hasHelmetIncluded = hasHelmetIncluded;
        this.engineSize = engineSize;
    }

    public boolean hasHelmetIncluded() {
        return hasHelmetIncluded;
    }


    public int getEngineSize() {
        return engineSize;
    }

     public double calculateRentalPrice(int days) {
        double basePrice = dailyRate * days;
        if(hasHelmetIncluded) {
            basePrice += 5; 
        }
        if (engineSize > 1000) {
            basePrice *= 1.20; 
        }
        return basePrice;
    }

    public String vehicleDetails() {
        return "Motorcycle - " + super.vehicleDetails() + ", Helmet Included: " + (hasHelmetIncluded ? "Yes" : "No") + ", Engine Size: " + engineSize + " cc";
    }
}
