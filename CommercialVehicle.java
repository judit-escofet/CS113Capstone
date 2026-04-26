public abstract class CommercialVehicle extends Vehicle {
    protected double loadCapacity; 
    protected boolean companyOwned;

    public CommercialVehicle(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate, double loadCapacity, boolean companyOwned) {
        super(manufacturer, model, year, vehicleID, isAvailable, dailyRate);
        this.loadCapacity = loadCapacity;
        this.companyOwned = companyOwned;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public boolean isCompanyOwned() {
        return companyOwned;
    }

    public String toString() {
        return super.toString() + " Load Capacity: " + loadCapacity + " tons";
    }
    
}
