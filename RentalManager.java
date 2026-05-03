import java.util.InputMismatchException;
import java.util.Scanner;

public class RentalManager {

    private static final int MAX_VEHICLES = 10;
    private Vehicle[] fleet;
    private int count;

    public RentalManager() {
        fleet = new Vehicle[MAX_VEHICLES];
        count = 0;
    }

    public void addVehicle(Vehicle v) throws VehicleException {
        if (count >= MAX_VEHICLES) {
            throw VehicleException.fleetFull(MAX_VEHICLES);
        }
        fleet[count++] = v;
    }
    
    public double rentVehicle(int vehicleID, int days) throws VehicleException {
        if (days < 1) {
            throw VehicleException.invalidDays(days);
        }

        for (int i = 0; i < count; i++) {
            if (fleet[i].getVehicleID() == vehicleID) {
                if (!fleet[i].isAvailable()) {
                    throw VehicleException.unavailable(vehicleID);
                }
                fleet[i].isAvailable = false;
                return fleet[i].calculateRentalPrice(days);
            }
        }

        throw new VehicleException("No vehicle found with ID " + vehicleID + ".");
    }

    public void returnVehicle(int vehicleID) throws VehicleException {
        for (int i = 0; i < count; i++) {
            if (fleet[i].getVehicleID() == vehicleID) {
                fleet[i].isAvailable = true;
                System.out.println("Vehicle " + vehicleID + " has been returned.");
                return;
            }
        }
        throw new VehicleException("No vehicle found with ID " + vehicleID + ".");
    }

    public void displayFleet() {
        for (int i = 0; i < count; i++) {
            System.out.println(fleet[i]);
        }
    }
    
    public void interactiveRent() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter vehicle ID: ");
            int id = scanner.nextInt();   // throws InputMismatchException if non-integer

            System.out.print("Enter number of rental days: ");
            int days = scanner.nextInt(); // same here

            double cost = rentVehicle(id, days);
            System.out.printf("Rental confirmed. Total cost: $%.2f%n", cost);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter whole numbers for ID and days.");
        } catch (VehicleException e) {
            System.out.println("Rental error: " + e.getMessage());
        }
    }

    public void sortByDailyRate(){
        for (int i = 0; i < count - 1; i++){
            int minIndex = i;

            for (int j = i + 1; j < count; j++){
                Comparable a = (Comparable) fleet[j];
                Comparable b = (Comparable) fleet[minIndex];

                if (a.compareTo(b) < 0){
                    minIndex = j;
                }
            }

            Vehicle t = fleet[minIndex];
            fleet[minIndex] = fleet[i];
            fleet[i] = t;
        }

        System.out.println("Vehicles sorted by daily rates.");
    }
}
