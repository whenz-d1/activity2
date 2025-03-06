public class Car extends Vehicle2 {
    public Car(String make, String model, int year, double dailyRentalRate) {
        super(make, model, year, dailyRentalRate);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Performing general car maintenance.");
    }
}