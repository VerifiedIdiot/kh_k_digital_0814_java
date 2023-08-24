package 매개변수다형성2;

public class Driver {
    String name;
    public Driver(String name) {
        this.name = name;
    }
    public void drive(Vehicle vehicle) {
        System.out.print(name + "의 ");
        vehicle.run();
    }
}
