public class Truck extends CommercialVehicle {
    
    public Truck(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate, double loadCapacity, boolean companyOwned) {
        super(manufacturer, model, year, vehicleID, isAvailable, dailyRate, loadCapacity, companyOwned);
    }


    public double calculateRentalPrice(int days) {
        double basePrice = dailyRate * days;
        if (loadCapacity > 100) {
            basePrice += 50; 
        }

        if(days > 7) {
            basePrice *= 0.9; 
        }
        return basePrice;
    }

    
}
