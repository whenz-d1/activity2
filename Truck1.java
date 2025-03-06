public class Truck1 extends Vehicle2 {
    public Truck1(String make, String model, int year, double dailyRentalRate) {
        super(make, model, year, dailyRentalRate);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Checking payload systems and engine oil for the truck.");
    }
}