public class LightTruck extends Truck {
    public LightTruck(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate, double loadCapacity, boolean companyOwned) {
        super(manufacturer, model, year, vehicleID, isAvailable, dailyRate, loadCapacity, companyOwned);
    }

    public String vehicleDetails() {
        return "Light Truck - " + super.vehicleDetails();
    }

    public double calculateRentalPrice(int days) {
        double basePrice = super.calculateRentalPrice(days);
        if (loadCapacity > 50) {
            basePrice += 30; 
        }

        return basePrice;
    }
}
