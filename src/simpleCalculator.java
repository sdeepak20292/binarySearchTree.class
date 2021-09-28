public class simpleCalculator {
    private double FirstNumber; // first fields(instance variables) are defined in the class.
    private double SecondNumber;
    private double AdditionResult;
    private double SubResult;
    private double MulResult;
    private double DivResult;
//
//    public void setFirstNumber(double n1) { // setter for 1st number.
//        this.firstNumber = n1;
//    }

    public void setFirstNumber(double n1) {
        this.FirstNumber = n1;
    }

    public void setSecondNumber(double n2) {  // setter for 2nd number.
        this.SecondNumber = n2;
    }

    public double getFirstNumber() {
        return this.FirstNumber;
    }

    public double getSecondNumber() {
        return this.SecondNumber;
    }

    public double getAdditionResult() {
        return (this.FirstNumber + this.SecondNumber);
    }

    public double getsubResult() {
        return (this.FirstNumber - this.SecondNumber);
    }

    public double getMulResult() {
        return (this.FirstNumber * this.SecondNumber);
    }

    public double getDivResult() {
        if (this.SecondNumber > 0) {
            return (this.FirstNumber / this.SecondNumber);

        }
        return 0;
    }




}
