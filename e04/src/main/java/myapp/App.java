package myapp;
public class App {
     public static void main(String[] args) {
        Greeting g = new Greeting () {
            public void sayHello() {
                System.out.println("Hello, anonymous inner class!");
            };
        };

        g.sayHello();
    }
}
