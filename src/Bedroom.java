public class Bedroom {
    private int bedCount;
    private int number;

    public Bedroom(int bedCount, int number) {
        this.bedCount = bedCount;
        this.number = number;
    }

    public int getBedCount() {
        return bedCount;
    }

    public int getNumber() {
        return number;
    }

    public void addBeds(int n) {
        System.out.println("adding "+n+" beds");
    }

    public void renovate() {
        System.out.println("renovating the bedroom");
    }
}
