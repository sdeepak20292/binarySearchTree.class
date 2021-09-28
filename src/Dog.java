public class Dog extends Animal{

    private int legs;
    private String color;
    private String breed;

    public Dog(String name, String life, String body, int size, int weight, int legs, String color, String breed) {
        super(name, body, life, size, weight);  // invoking the superclass(Animal) constructor. and passing these values
        this.legs = legs;
        this.color = color;
        this.breed = breed;
    }

    public int getLegs() {
        return legs;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }
}
