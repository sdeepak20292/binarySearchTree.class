public class Cyclinder extends Circle {
    private double height;

    public Cyclinder(double r, double h) { // constructor.
        super(r);  // parent constructor invoking.

        if(h >0) {
            this.height = h;
        }
        else {
            this.height = h;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (getArea()*this.height);
    }

    public static void main (String[] args) {
        Cyclinder n = new Cyclinder(1, 2);
        System.out.println(n.getVolume());
        System.out.println(n.getArea());
    }

}
