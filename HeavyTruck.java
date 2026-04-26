public class HeavyTruck extends Truck {
    public HeavyTruck(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate, double loadCapacity, boolean companyOwned) {
        super(manufacturer, model, year, vehicleID, isAvailable, dailyRate, loadCapacity, companyOwned);
    }

    public double calculateRentalPrice(int days) {
        double basePrice = super.calculateRentalPrice(days);
        if (loadCapacity > 200) {
            basePrice += 100; 
        }
        return basePrice;
    }
}