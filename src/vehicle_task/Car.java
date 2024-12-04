package vehicle_task;

public class Car implements IVehicle {
    public boolean hasFuel = false;
    public double fuelLevel = 0;

    @Override
    public void startEngine() {
        System.out.println("Car Engine Started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car Engine Stopped");
    }

    @Override
    public String getFuelType() {
        return "Benzinle isleyir!";
    }

    public void startCar(double fuelLevel) {
        checkFuel(fuelLevel);
    }

    public boolean checkFuel(double fuelLevel2) {
        if (fuelLevel2 > 0) {
            hasFuel = true;
            startEngine();
        }
        return false;
    }

}
