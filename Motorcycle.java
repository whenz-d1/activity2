public class Motorcycle extends Vehicle2 {
    public Motorcycle(String make, String model, int year, double dailyRentalRate) {
        super(make, model, year, dailyRentalRate);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Inspecting brakes and tire pressure for the motorcycle.");
    }
}