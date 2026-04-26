public class ElectricCar extends Car {
    private int batteryRange;
    private int currentCharge;

    public ElectricCar(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate, int seatingCapacity, int numberOfDoors, int batteryRange, int currentCharge) {
        super(manufacturer, model, year, vehicleID, isAvailable, dailyRate, seatingCapacity, numberOfDoors);
        this.batteryRange = batteryRange;
        this.currentCharge = currentCharge;
        if (currentCharge < 20) {
            this.isAvailable = false; 
        }
    }

    public int getBatteryRange() {
        return batteryRange;
    }

    public int getCurrentCharge() {
        return currentCharge;
    }

    public double calculateRentalPrice(int days) {
        double basePrice = super.calculateRentalPrice(days);
        // Lowky this is funny
        double ecoDiscount = 0.1;
        basePrice *= (1 - ecoDiscount);
        return basePrice;
    }
    
}
