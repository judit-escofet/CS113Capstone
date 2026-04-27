public abstract class PersonalVehicle extends Vehicle {
    protected int seatingCapacity;
    public PersonalVehicle(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate, int seatingCapacity) 
    {
        super(manufacturer, model, year, vehicleID, isAvailable, dailyRate);
        this.seatingCapacity = seatingCapacity;

    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public String vehicleDetails() {
        return "Personal Vehicle - " + super.vehicleDetails() + ", Seating Capacity: " + seatingCapacity;
    }



}
