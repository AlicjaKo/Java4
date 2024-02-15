package myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
   @Test
   public void testGetArea() {
      Rectangle rectangle = new Rectangle(10, 20);
      int expectedArea = 200;
      int actualArea = rectangle.getArea();
      assertEquals(expectedArea, actualArea);
   }

   @Test
   public void testRectangleDimensionsGetPerimeter() {
      Rectangle rectangle = new Rectangle(10, 20);
      Rectangle.RectangleDimensions dimensions = rectangle.new RectangleDimensions(10, 20);
      int expectedPerimeter = 60;
      int actualPerimeter = dimensions.getPerimeter();
      assertEquals(expectedPerimeter, actualPerimeter);
   }
}
