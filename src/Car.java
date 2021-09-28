public class Car {

    // car is an class having public access modifier.
    private String color;
    private int engine;
    public String model; // these are field of class having private access modifier. means can't be accessed outside
    // of this class.

    public void setColor(String color) {
        // setter for a field.

        String validColor  = color.toLowerCase();
        if ((validColor.equals("red")) || (validColor.equals("black"))) {
            this.color = validColor;
        }
        else {
            this.color = "Not a nice color";
        }
//        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}
