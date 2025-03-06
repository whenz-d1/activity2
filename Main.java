public class Main {
    public static void main(String[] args) {
        // Create an array of Vehicle objects
        Vehicle2[] vehicles = new Vehicle2[4];
        vehicles[0] = new Car("Toyota", "Camry", 2022, 50.0);
        vehicles[1] = new Truck1("Ford", "F-150", 2022, 80.0);
        vehicles[2] = new Motorcycle("Harley-Davidson", "Street 750", 2021, 30.0);
        vehicles[3] = new ElectricCar1("Tesla", "Model 3", 2022, 100.0, 75.0);

        // Call performMaintenance() on each vehicle
        for (Vehicle2 vehicle : vehicles) {
            vehicle.performMaintenance();
        }
    }
}