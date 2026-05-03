
import java.util.InputMismatchException;
import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args) {
        Garage garage = new Garage();
        RentalManager manager = new RentalManager();

        for (Vehicle v : garage.vehicles) {
            if (v != null) {
                try {
                    manager.addVehicle(v);
                } catch (VehicleException e) {
                    System.out.println("Error adding vehicle: " + e.getMessage());
                }
            }
        }
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 6){
            System.out.println("1. View all vehicles");
            System.out.println("2. Rent a vehicle");
            System.out.println("3. Return a vehicle");
            System.out.println("4. View vehicle details");
            System.out.println("5. Sort vehicles by rental price");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try{
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        manager.displayFleet();
                        break;
                    case 2:
                        manager.interactiveRent();
                        break;
                    case 3:
                        System.out.print("Enter vehicle ID to return: ");
                        int returnID = scanner.nextInt();
                        manager.returnVehicle(returnID);
                        break;
                    case 4:
                        System.out.print("Enter vehicle ID to search: ");
                        int detailsID = scanner.nextInt();
                        Vehicle result = manager.searchByID(detailsID, 0);
                        if (result != null) {
                            System.out.println(result);
                        } else {
                            System.out.println("No vehicle found with ID " + detailsID + ".");
                        }
                        break;
                    case 5:
                        manager.sortByDailyRate();
                        manager.displayFleet();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
            } catch (VehicleException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
