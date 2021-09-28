public class Display {
    private String model;
    private Resolution resolution; // composition.


    public Display(String model, Resolution resolution) {
        this.model = model;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void Draw(String draw) {
        System.out.println("drawing "+draw);
    }


}
