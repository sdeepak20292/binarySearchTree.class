public class PC {
    private Display display;
    private MotherBoard motherBoard; // composition.

    public PC(Display display, MotherBoard motherBoard) {
        this.display = display;
        this.motherBoard = motherBoard;
    }

    public Display getDisplay() {
        return display;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void Start() {
        System.out.println("Starting PC");
    }
    public void ShutDown() {
        System.out.println("Shutting Down pc");
    }

    public static void main (String[] args) {
        Resolution reso = new Resolution(1800, 2000);
        Display newDisplay = new Display("Acer", reso);
        MotherBoard moth = new MotherBoard("1789", 5, "Nvidia");

        PC newPc = new PC(newDisplay, moth);
        int w = newPc.getDisplay().getResolution().getHeight();
        int h = newPc.getDisplay().getResolution().getWidth();



         // this is how we can use multiple inheritance using compostion.

        System.out.println("newpc has a resoultion of: "+w+" "+h);
        System.out.println("newpc has a montior of "+newPc.getDisplay().getModel());
        System.out.println("newpc has a motherboard of "+newPc.getMotherBoard().getManufacturer());
        System.out.println("newpc has a ramslot of "+newPc.getMotherBoard().getRamSlots());
        newPc.getDisplay().Draw("Square");
        newPc.ShutDown();

    }

}
