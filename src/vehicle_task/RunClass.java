package vehicle_task;

public class RunClass {
    public static void main(String[] args) {
        var car = new Car();
        var bike = new Bike();
        car.startEngine();
        car.stopEngine();
        System.out.println("------------------------------");
        bike.startEngine();
        bike.stopEngine();
    }
}
