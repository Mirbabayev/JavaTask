package vehicle_task;

public class Bike implements IVehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike is running");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike is stopped");
    }
}
