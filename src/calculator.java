public class calculator {
    private Floor floor;
    private Cost cost;

    public calculator(Floor f, Cost c) {
        floor = f;
        cost = c;
    }

    public double getTotalCost() {
        return (floor.getArea()*cost.getCost());
    }
}
