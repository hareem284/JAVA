// Program to demonstrate Method Overloading and Method Overriding

// Parent Class
class Shape {

    // This method will be overridden in the child class
    void draw() {
        System.out.println("Drawing a shape.");
    }

    // Method Overloading:
    // Same method name (area) but different parameters

    // Calculates area of a square
    void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    // Calculates area of a rectangle
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

// Child Class inheriting Shape
class Circle extends Shape {

    // Method Overriding:
    // The draw() method of Shape class is redefined here
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Creating object of Circle class
        Circle c = new Circle();

        // Calling overridden method
        c.draw();

        // Calling overloaded methods

        // Calls area(int side)
        c.area(5);

        // Calls area(int length, int breadth)
        c.area(4, 6);
    }
}