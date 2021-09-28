public class ComplexNumber {
    private double Real;
    private double Imaginary;

    public ComplexNumber(double r, double i) {
        Real = r;
        Imaginary = i;
    }

    public double getReal() {
        return Real;
    }

    public double getImaginary() {
        return Imaginary;

    }

    public void add(ComplexNumber number) {
        Real += number.getReal(); // adding both the reals part
        Imaginary += number.getImaginary(); // adding the imaginary parts.
    }

    public void substract(ComplexNumber number){
        Real += number.getReal();
        Imaginary += number.getImaginary();
    }

    public static void main (String[] args) {
        ComplexNumber n1 = new ComplexNumber(3, 5);
        ComplexNumber n2 = new ComplexNumber(2, 9);
        System.out.println("n1 before = "+n1.getReal()+" + "+n1.getImaginary());
        n1.add(n2);
        System.out.println();
        System.out.println("n1 after addition = "+n1.getReal()+" + "+n1.getImaginary());

    }


}
