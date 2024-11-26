package vehicle_task;

public class Car implements IVehicle{
    @Override
    public void startEngine() {
        System.out.println("Car Engine Started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car Engine Stopped");
    }
}
