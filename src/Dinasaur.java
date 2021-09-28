public class Dinasaur extends Animal {
    private String color;
    private String type;   // unique specifications of dinasaur.


    public Dinasaur(String name, String body, String life, int size, int weight, String color, String type) {
        super(name, body, life, size, weight);   // as this is the inheriting from Animal, we need to use this for animal ocnstructor..
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void  greet1(){
        System.out.println(super.greet() + this.getName());
    }
    // this is inheriting from super class Animal.

    public static void main(String[] args){
        Dinasaur trex = new Dinasaur("t-rex", "heavy",
                "100 years", 50, 500, "red", "carnivor");

        System.out.println(trex.getColor());
        trex.setColor("green");
        System.out.println(trex.getColor());
        trex.greet1();


    }


}
