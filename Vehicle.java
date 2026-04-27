public abstract class Vehicle implements Comparable{
    protected String manufacturer ;
    protected String model;
    protected int year;
    protected int vehicleID;
    protected boolean isAvailable;
    protected static int nextVehicleID = 1;
    protected double dailyRate;

    public Vehicle(String manufacturer, String model, int year, int vehicleID, boolean isAvailable, double dailyRate) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.vehicleID = vehicleID;
        this.isAvailable = isAvailable; 
        this.dailyRate = dailyRate;
        nextVehicleID++;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

   
    public String vehicleDetails() 
    {
        return "Vehicle ID: " + vehicleID + ", Manufacturer: " + manufacturer + ", Model: " + model + ", Year: " + year + ", Available: " + isAvailable + ", Daily Rate: $" + dailyRate;
    }
    
    public String toString() 
    {
        return "-------------------------------\n"+ vehicleDetails()  +"\n-------------------------------";
    }

    //recursion (we take off 5% for each additional day after the first)
    public double accumulativeDiscount(int days) {
        if(days == 1){
            return 0;
        } else {
            return 0.05 + accumulativeDiscount(days - 1);
        }
    } 

    public abstract double calculateRentalPrice(int days);

    public int compareTo(Object other) {
        return ((Integer)(this.vehicleID)).compareTo(((Integer) ((Vehicle) other).getVehicleID()));
       
    }
}