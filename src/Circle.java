public class Circle {

    private double radius;

    public Circle(double r) { // constructor
        if (r > 0) {
            this.radius = r;
        }
        else {
            this.radius = 0;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
}
