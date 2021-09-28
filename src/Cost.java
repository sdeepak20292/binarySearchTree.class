public class Cost {

    private double cost;

    public Cost(double c) {

        if(c > 0) {
            cost = c;
        }
        else{
            cost = 0;
        }
    }

    public double getCost() {
        return cost;
    }

}
