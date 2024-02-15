package myapp;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

   @Test
   void testPrintNumbers() throws InterruptedException {
      // Redirect System.out to capture output
      ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      System.setOut(new PrintStream(outContent));

      // Execute the main method to start the thread
      App.main(new String[]{});

      Thread.sleep(2000);

      // Simple validation that something was printed - not ideal but demonstrates the concept
      assertTrue(outContent.toString().contains("1"));
      assertTrue(outContent.toString().contains("2"));
      assertTrue(outContent.toString().contains("3"));
      assertTrue(outContent.toString().contains("4"));
      assertTrue(outContent.toString().contains("5"));

   }
}
