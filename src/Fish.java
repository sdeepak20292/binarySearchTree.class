public class Fish extends Animal {

    private String fins;
    private String breed;
    private String color;

    public Fish(String name, String body, String life, int size, int weight, String fins, String breed, String color){
        super(name, body, life ,size, weight); // invoking Animal class constructor.
        this.fins = fins;
        this.breed = breed;
        this.color = color;
    }

    public void movement() {
        System.out.println("It swims");
    }

    public String speed() {
        return "10 km/h";
    }
}
