public class Floor {

    private double width;
    private double length;
    private double Area;

    public Floor(double w, double l) {
        if(w > 0){
            width = w;
        }
        else {
            width = 0;
        }

        if(l > 0){
            length = l;
        }
        else {
            length = 0;
        }
    }

    public double getArea() {
        return (width * length);
    }
}
