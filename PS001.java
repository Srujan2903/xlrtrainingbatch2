public class PS001 { 
    // Instance variables
    private int id;            
    private String firstName;
    private String lastName;
    private String address;

    // Default Constructor
    public PS001() {
        this.id = 0;
        this.firstName = "Srujan";
        this.lastName = "Dundigalla";
        this.address = "Alwal";
    }

    // Parameterized Constructor
    public PS001(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Method to get full name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create Employee object using default constructor
        PS001 emp1 = new PS001(); 
        System.out.println("Employee 1 Details:");
        System.out.println("Full Name: " + emp1.getFullName());

        // Create Employee object using parameterized constructor
        PS001 emp2 = new PS001(101, "Sudha", "Durga", "123 Main St");
        System.out.println("\nEmployee 2 Details:");
        System.out.println("Full Name: " + emp2.getFullName());
    }
}