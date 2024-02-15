package myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

class PersonTest {

   @Test
   void testPerson() {
      Person person = new Person("John Doe");
      person.setAddress("123 Main St", "Anytown", "USA");
      person.setPhoneNumber("+1", "555-555-1212");
      
      assertNotNull(person);
   }

   @Test
   void testDisplay() {
      Person person = new Person("John Doe");
      person.setAddress("123 Main St", "Anytown", "USA");
      person.setPhoneNumber("+1", "555-555-1212");

      String expectedOutput = "Name: John Doe\n" +
                              "Address: 123 Main St, Anytown, USA\n" +
                              "Phone: (+1) 555-555-1212\n";

      assertEquals(expectedOutput, captureSystemOut(person::display));
   }

   private static String captureSystemOut(Runnable runnable) {
      PrintStream originalOut = System.out;
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream ps = new PrintStream(baos);
      System.setOut(ps);

      runnable.run();

      System.out.flush();
      System.setOut(originalOut);

      return baos.toString();
   }
}
