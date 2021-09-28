public class referenceVSinstanceVsobject {
    private String color;

    public referenceVSinstanceVsobject(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main (String [] args) {
        referenceVSinstanceVsobject blueHouse = new referenceVSinstanceVsobject("blue");
        referenceVSinstanceVsobject anotherHouse = blueHouse;
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());

        // another house and blueHouse are referenced to same memory so changing one also changes another. they both
        // are linkid to each other.

        System.out.println("setting color:");
        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());


    }

}
