public class Garage 
{
    Vehicle[] vehicles;
    
    public Garage() {
        vehicles = new Vehicle[10];
        vehicles[0] = new LightTruck("Ford", "F-150", 2020, Vehicle.nextVehicleID, true, 80.0, 100, true);
        vehicles[1] = new HeavyTruck("Volvo", "FH16", 2019, Vehicle.nextVehicleID, true, 150.0, 300, false);
        vehicles[2] = new ElectricCar("Tesla", "Model 3", 2021, Vehicle.nextVehicleID, true, 70.0, 5, 4, 350, 80);
        vehicles[4] = new Motorcycle("Harley-Davidson", "Street 750", 2018, Vehicle.nextVehicleID, true, 40.0, 2, true, 750);
        vehicles[5] = new Motorcycle("Yamaha", "YZF-R3", 2021, Vehicle.nextVehicleID, true, 35.0, 2, false, 321);
        vehicles[6] = new LightTruck("Chevrolet", "Silverado", 2021, Vehicle.nextVehicleID, true, 85.0, 120, false);
        vehicles[7] = new HeavyTruck("MAN", "TGX", 2020, Vehicle.nextVehicleID, true, 160.0, 350, true);
        vehicles[8] = new GasolineCar("BMW","4 series", 2023, Vehicle.nextVehicleID, true, 80, 4, 4, 2);
    }
}
