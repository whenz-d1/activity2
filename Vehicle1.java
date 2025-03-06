public class Vehicle1 {
    private String make;
    private String model;
    private int year;
    private double dailyRentalRate; // New attribute for daily rental rate

    // Constructor
    public Vehicle1(String make, String model, int year, double dailyRentalRate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.dailyRentalRate = dailyRentalRate; // Initialize daily rental rate
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Method to calculate discounted rental cost
    public double calculateDiscountedRentalCost(int days, double discountPercentage) {
        double totalCost = dailyRentalRate * days; // Calculate total rental cost
        double discountAmount = (discountPercentage / 100) * totalCost; // Calculate discount amount
        return totalCost - discountAmount; // Return discounted rental cost
    }
}