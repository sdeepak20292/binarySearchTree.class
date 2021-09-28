public class floatanddouble {
    public static void main(String[] args) {

        // float
        float minfloatvalue = Float.MIN_VALUE;
        float maxfloatvalue = Float.MAX_VALUE;
        System.out.println("min float value is "+maxfloatvalue);
        System.out.println("max float value is "+maxfloatvalue);

        // double

        double maxdvalue = Double.MAX_VALUE;
        double mindvalue = Double.MIN_VALUE;

        // variable assignment with double and float.

        float myf = (float) (5.0);
        double md = 5.45;  // here also java considers double as default data type like int, we need to cast placing f
        // after the value or like done above.
        System.out.println();
        int myint = 5/(int) 2.0;
        float myfloat = 22f/7f;
        double mydouble = 22d/7d;
        System.out.println("My flaot is "+myfloat);
        System.out.println("My double is "+mydouble);
        System.out.println("My int is "+myint);
        // double is more precise, while float is less precise

        // SO IN JAVA INTEGERS ARE DEFAULT AS INT DATA TYPE AND DECIMAL NUMBERS ARE CONSIDERED AS DOUBLE DATA TYPE
        // challenge

        double pounds = 100.13;
        double kg = pounds*0.45;
        System.out.println("pound in kg's are: "+kg);
    }
}
