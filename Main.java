public class Main {
    public static void main(String[] args) {
        // Create an ElectricCar object
        ElectricCar myElectricCar = new ElectricCar("BMW", "i7", 2013, 10000.0);

        // Display details of the electric car
        myElectricCar.displayDetails();

        // Display battery information
        myElectricCar.displayBatteryInfo();
    }
}