package myapp;

public class App {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        r.getArea();

        Rectangle.RectangleDimensions rd = r.new RectangleDimensions(6,7);
        rd.getPerimeter();

    }
}
