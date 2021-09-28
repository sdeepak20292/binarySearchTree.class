public class House {
    private String owner;
    private Bedroom bedroom;
    private Kitchen kitchen;
    private Bathroom bathroom;

    public House(String owner, Bedroom bedroom, Kitchen kitchen, Bathroom bathroom) {
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.owner = owner;
    }

    public static void main (String[] args){
        Bedroom newBedroom = new Bedroom(2, 2);
        Kitchen newkitchen=  new Kitchen();
        Bathroom newBathroom = new Bathroom(2);
        House newHouse = new House("Deepak Singh",newBedroom, newkitchen, newBathroom);
        newHouse.kitchen.makeFood("pasta");
        newHouse.bathroom.CleanBathroom();
        newHouse.bathroom.Spray();
        newHouse.bedroom.renovate();
        System.out.println(newHouse.owner+" is owner of this house (:");

    }

}
