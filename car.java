// This is a class named Car
public class car {
    String brand;
    int year;

    // Constructor for the Car class
    public car(String b, int y) {
        brand = b;
        year = y;
    }

    // Method to display car info
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of Car using the constructor
        car myCar = new car("Toyota", 2020);

        // Displaying car information
        myCar.displayInfo();
    }
}
