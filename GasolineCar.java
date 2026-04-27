public class GasolineCar extends Car {
    private double fuelEfficiency;
    private int fuelTankCapacity;
    private double currentFuelLevel;

    public GasolineCar(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate, int seatingCapacity, int numberOfDoors, double fuelEfficiency) {
        super(manufacturer, model, year, vehicleID, isAvailable, dailyRate, seatingCapacity, numberOfDoors);
        this.fuelEfficiency = fuelEfficiency;
        if (currentFuelLevel/fuelTankCapacity < 0.2) {
            this.isAvailable = false; 
        }
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public double calculateRentalPrice(int days) {
        double basePrice = super.calculateRentalPrice(days);
        // We can discuss this methods, just what I think the instructions be saying
        if (fuelEfficiency < 25) {
            basePrice *= 1.15; 
        }
        return basePrice;
    }

    public String vehicleDetails() {
        return "Gasoline Car - " + super.vehicleDetails() + ", Fuel Efficiency: " + fuelEfficiency + " MPG, Fuel Tank Capacity: " + fuelTankCapacity + " gallons, Current Fuel Level: " + currentFuelLevel + " gallons";
    }
    
}
