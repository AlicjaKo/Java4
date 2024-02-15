package myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
   @Test
   public void testCar() {
      Car car = new Car("Toyota", "Camry");
      assertEquals("Toyota", car.getMake());
      assertEquals("Camry", car.getModel());

      Car.Engine engine = car.new Engine(2.5);
      assertEquals(250.0, engine.getHorsepower(), 0.01);
   }
}
