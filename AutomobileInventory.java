import java.util.Scanner;
// import scanner

public class AutomobileInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // new scanner

        try {
            Automobile car = new Automobile("Toyota", "Corolla", "Silver", 2015, 150000);
            printVehicleInfo(car);
            // create automobile using parameterized constructor

            car.RemoveVehicle();
            // remove vehicle

            car.AddNewVehicle("Nissan", "Sentra", "white", 2017, 42000);
            // add a new vehicle

            printVehicleInfo(car);
            // list new vehicle info

            car.UpdateVehicle("Nissan", "Sentra", "yellow", 2017, 75000);
            // update vehicle

            printVehicleInfo(car);
            // list updated vehicle info

            System.out.print("Do you want to save this info to a file? Enter Y for yes and N for no ");
            String response = scanner.nextLine();
            // ask to print to file

            if (response.equals("y")) {
                System.out.print(car);

            } else {
                System.out.println("a file will not be printed.");
            }
            // unsure of how to print file to predifined file location so used this as a placeholder

        } catch (Exception e) {
            System.out.println("Something went wrong, please try again");
        }
        // try catch

        scanner.close();
        // closes scanner
    }

    public static void printVehicleInfo(Automobile car) {
        String[] vehicleInfo = car.ListVehicleInfo();
        for (int i = 0; i < vehicleInfo.length; i++) {
            System.out.println(vehicleInfo[i]);
        }
    }
    // loops through strings of vehicle info and prints them
}