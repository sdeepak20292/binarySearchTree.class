public class main {
    public static void main (String[] args) {
        Dog Lucky = new Dog("Lucky", "12 years", "fat", 1, 30, 4, "white", "labrador");
        // created a object(dog) with name lucky from the class Dog.
        System.out.println(Lucky.getBreed());
        System.out.println("name is "+Lucky.getName());
        System.out.println("color is "+Lucky.getColor());
        System.out.println("weight is "+Lucky.getWeight());
        System.out.println("It has "+Lucky.getLegs()+" legs");
        System.out.println("Will live upto "+Lucky.getLife());
        System.out.println();

        // creating a new object of class Fish.

        Fish myFish = new Fish("dodo", "thin", "10 years", 10, 200, "fins",
                "catfish", "black");

        System.out.println("speed of my fish is "+myFish.speed());
        System.out.println(myFish.getName());
        System.out.println(myFish.getLife());
        System.out.println(myFish.getWeight());
        myFish.movement();
    }
}
