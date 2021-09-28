public class Point {
    private int x;
    private int y;

    public Point() {
        // empty constructor.

    }

    public Point(int x, int y) {
        // major constructor.
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // we will create 3 methods with different parameters(overiding methods).
    public double distance() {
        return Math.sqrt((this.x*this.x + this.y*this.y));
    }

    public double distance(int x1, int y1) {
        return Math.sqrt((this.x - x1)*(this.x - x1) + (this.y - y1)*(this.y - y1));
    }

    public double distance(Point p) {
        return Math.sqrt((Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2)));
    }

    public static  void main (String[] args) {
        Point n1 = new Point(-1, -1);
        System.out.println(n1.distance(-1, -1));
    }
}
