public class ElectricCar extends Vehicle {
    private double batteryCapacity; // in kWh

    // Parameterized constructor
    public ElectricCar(String make, String model, int year, double batteryCapacity) {
        super(make, model, year); // Call to the superclass constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    // Additional method to display battery information
    public void displayBatteryInfo() {
        System.out.println("This electric car has a battery capacity of " + batteryCapacity + " kWh.");
    }
}