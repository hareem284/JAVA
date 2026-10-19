// Parent Class
class Shape {

    // Method to be used by subclasses
    void getVolume() {
        System.out.println("Calculating Volume...");
    }
}

// Cube Class
class Cube extends Shape {

    // Encapsulation: private data member
    private int side;

    // Setter method
    public void setSide(int side) {
        this.side = side;
    }

    // Getter method
    public int getVolume() {
        return side * side * side;
    }
}

// Cuboid Class
class Cuboid extends Shape {

    private int length, breadth, height;

    public void setDimensions(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public int getVolume() {
        return length * breadth * height;
    }
}

// Cylinder Class
class Cylinder extends Shape {

    private double radius, height;

    public void setDimensions(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return 3.14 * radius * radius * height;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Cube Object
        Cube cube = new Cube();
        cube.setSide(4);
        System.out.println("Volume of Cube = " + cube.getVolume());

        // Cuboid Object
        Cuboid cuboid = new Cuboid();
        cuboid.setDimensions(4, 5, 6);
        System.out.println("Volume of Cuboid = " + cuboid.getVolume());

        // Cylinder Object
        Cylinder cylinder = new Cylinder();
        cylinder.setDimensions(3, 7);
        System.out.println("Volume of Cylinder = " + cylinder.getVolume());
    }
}