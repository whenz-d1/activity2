public class Main {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle1 myCar = new Vehicle1("Ford", "Raptor", 2024, 5000.0);
        int rentalDaysCar = 5;
        double discountCar = 10.0; // 10% discount
        double discountedCostCar = myCar.calculateDiscountedRentalCost(rentalDaysCar, discountCar);
        System.out.println("Discounted rental cost for the car: $" + discountedCostCar);

        // Create a Truck object
        Truck myTruck = new Truck("Foton", "ultra", 2016, 8000.0);
        int rentalDaysTruck = 7;
        double discountTruck = 10.0; // 10% discount
        double discountedCostTruck = myTruck.calculateDiscountedRentalCost(rentalDaysTruck, discountTruck);
        System.out.println("Discounted rental cost for the truck: $" + discountedCostTruck);
    }
}