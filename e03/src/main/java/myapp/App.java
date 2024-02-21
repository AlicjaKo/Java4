package myapp;

public class App {
    public static void main(String[] args) {
        Car car = new Car("Cam", "Bad");
        Car.Engine w = car.new Engine(22);
    }
}
