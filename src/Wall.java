public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(22, 20);
    }

    public Wall(double width, double height) {
        // major contr.
        if(width > 0){
            this.width = width;
        }
        else {
            this.width = 0;
        }

        if(height > 0){
            this.height = height;
        }
        else {
            this.height = 0;
        }


    }

    public void setHeight(double h) {
        if (h > 0) {
            this.height = h;
        }
        else {
            this.height = 0;
        }
    }

    public void setWidth(double w) {
        if (w > 0) {
            this.width = w;
        }
        else {
            this.width = 0;
        }

    }
    public double getWidth(){
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return (this.width * this.height);
    }
}
