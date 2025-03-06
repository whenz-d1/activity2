public class Truck extends Vehicle1 {
    // Constructor
    public Truck(String make, String model, int year, double dailyRentalRate) {
        super(make, model, year, dailyRentalRate); // Call to the superclass constructor
    }

    // Override calculateDiscountedRentalCost method
    @Override
    public double calculateDiscountedRentalCost(int days, double discountPercentage) {
        double discountedCost = super.calculateDiscountedRentalCost(days, discountPercentage); // Call the superclass method

        // Apply an additional 5% discount if rental period exceeds 3 days
        if (days > 3) {
            double additionalDiscount = 0.05 * discountedCost; // Calculate additional discount
            discountedCost -= additionalDiscount; // Apply additional discount
        }

        return discountedCost; // Return the final discounted rental cost
    }
}