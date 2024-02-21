package myapp;

public class Rectangle {
    private int width;
    private int height;

    Rectangle (int w, int h){
        this.width = w;
        this.height = h;
    }

    int getArea() {
        return this.height * this.width;
    }

    public class RectangleDimensions {
        private int width;
        private int height;

        RectangleDimensions (int w, int h){
            this.width = w;
            this.height = h;
        }

        int getPerimeter() {
            return 2*this.height + 2*this.width;
        }
    }
}

/*


4. Create a new class named `App` with a static `main` 
method. Inside the main method create `Rectangle` object and 
call the `getArea` method.  Inside the main method also create a 
`RectangleDimensions` object and call the `getPerimeter` method. 


5. Run the `Main` class and observe the output. The output should display the area of the rectangle and the perimeter of the rectangle.
    // Expected output
    Area: 200
    Perimeter: 60


 */