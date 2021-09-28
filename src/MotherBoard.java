public class MotherBoard {
    private String model;
    private int ramSlots;
    private String manufacturer;

    public MotherBoard(String model, int ramSlots, String manufacturer) {
        this.model = model;
        this.ramSlots = ramSlots;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
