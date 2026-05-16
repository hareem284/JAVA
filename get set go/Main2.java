class shape {
    public double getArea() {
        return 0;
    }
}

class triangle extends shape {
    private double base;
    private double height;

    public triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

class square extends shape {
    private double side;

    public square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}

class Main2 {
    public static void main(String[] args) {
        shape[] so = new shape[2];
        so[0] = new triangle(4, 10);
        so[1] = new square(7);
        System.out.println(so[0].getArea());
        System.out.println(so[1].getArea());
    }
}