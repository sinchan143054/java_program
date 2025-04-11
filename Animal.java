// Class with a default constructor
public class Animal {
    String type;

    // Default constructor
    public Animal() {
        type = "Dog";
    }

    // Method to display animal type
    public void displayType() {
        System.out.println("Animal type: " + type);
    }

    // Main method
    public static void main(String[] args) {
        // Creating object using default constructor
        Animal myAnimal = new Animal();

        // Displaying animal type
        myAnimal.displayType();
    }
}
