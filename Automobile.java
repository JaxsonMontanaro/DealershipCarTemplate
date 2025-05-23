/*
Create an automobile class that will be used by a dealership as a vehicle inventory program. The following attributes should be present in your automobile class:

private string make
private string model
private string color
private int year
private int mileage

Your program should have appropriate methods such as:
default constructor
parameterized constructor
add a new vehicle method
list vehicle information (return string array)
remove a vehicle method
update vehicle attributes method
All methods should include try..catch constructs. Except as noted all methods should return a success or failure message (failure message defined in "catch").

Create an additional class to call your automobile class (e.g., Main or AutomobileInventory). Include a try..catch construct and print it to the console.
Call automobile class with parameterized constructor (e.g., "make, model, color, year, mileage").
Then call the method to list the values. Loop through the array and print to the screen.
Call the remove vehicle method to clear the variables.
Print the return value.
Add a new vehicle.
Print the return value.
Call the list method and print the new vehicle information to the screen.
Update the vehicle.
Print the return value.
Call the listing method and print the information to the screen.
Display a message asking if the user wants to print the information to a file (Y or N).
Use a scanner to capture the response. If "Y", print the file to a predefined location (e.g., C:\Temp\Autos.txt). Note: you may want to create a method to print the information in the main class.
If "N", indicate that a file will not be printed.
*/

public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
    // private variables with datatypes

    public Automobile() {
        this.make = "VOID";
        this.model = "VOID";
        this.color = "VOID";
        this.year = 0;
        this.mileage = 0;
    }
    // default constructor

    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }
    // parameterized constructor

    public String AddNewVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added!";
        } catch (Exception e) {
            return "Error adding vehicle";
        }
    }
    // add a new vehicle method

    public String[] ListVehicleInfo() {
        return new String[] {
                "Vehicle make is " + make,
                "Vehicle Model is " + model,
                "Vehicle color is " + color,
                "Vehicle year is " + year,
                "Vehicle mileage is " + mileage
        };
    }
    // list vehicle information (return string array)

    public String RemoveVehicle() {
        try {
            this.make = "VOID";
            this.model = "VOID";
            this.color = "VOID";
            this.year = 0;
            this.mileage = 0;
            return "Vehicle removed!";
        } catch (Exception e) {
            return "Error removing vehicle";
        }
    }
    // remove a vehicle method

    public String UpdateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated!";
        } catch (Exception e) {
            return "Error updating vehicle";
        }
    }
    // update vehicle attributes method
}
