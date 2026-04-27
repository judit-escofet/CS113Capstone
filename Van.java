public class Van extends CommercialVehicle {
    private boolean isPassengerVan;
    public Van(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate, double loadCapacity, boolean companyOwned, boolean isPassengerVan) {
        super(manufacturer, model, year, vehicleID, isAvailable, dailyRate, loadCapacity, companyOwned);
        this.isPassengerVan = isPassengerVan;
    }
    
    public boolean isPassengerVan() {
        return isPassengerVan;
    }

    public double calculateRentalPrice(int days) {
        double basePrice = dailyRate * days;
        if (isPassengerVan) {
            basePrice += 20; 
        }
       if(days > 7) {
            basePrice *= 0.9; 
        }
        return basePrice;
    }  

    public String vehicleDetails() {
        return "Van - " + super.vehicleDetails() + ", Passenger Van: " + (isPassengerVan ? "Yes" : "No");
    }

}
