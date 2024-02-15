package myapp;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
   @Test
   public void testSayHello() {
      ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      System.setOut(new PrintStream(outContent));

      App.main(null);

      assertEquals("Hello, anonymous inner class!\n", outContent.toString());
   }
}
