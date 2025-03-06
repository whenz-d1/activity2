public class ElectricCar1 extends Vehicle2 {
    private double batteryCapacity; // in kWh

    public ElectricCar1(String make, String model, int year, double dailyRentalRate, double batteryCapacity) {
        super(make, model, year, dailyRentalRate);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void performMaintenance() {
        System.out.println("Checking battery health and charging system.");
    }
}