public class Car extends PersonalVehicle {
    protected int numberOfDoors;

    public Car(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate, int seatingCapacity, int numberOfDoors) {
        super(manufacturer, model, year, vehicleID, isAvailable, dailyRate, seatingCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

     public double calculateRentalPrice(int days) {
        double basePrice = dailyRate * days;
        if (seatingCapacity > 5) {
            basePrice += 20; 
        }
        return basePrice;
    }
    

    public String vehicleDetails() {
        return "Car - " + super.vehicleDetails() + ", Number of Doors: " + numberOfDoors;
    }
}
