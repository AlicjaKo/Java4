package myapp;

public class Car {
    private String make;
    private String model;

    Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    String getMake() {
        return this.make;
    }

    String getModel() {
        return this.model;
    }

    class Engine {
        private double displacement;

        Engine (double d) {
            this.displacement = d;
        }

        double getHorsepower() {
            return this.displacement*100;
        }
    }
}

