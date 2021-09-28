public class stringdatatype {
    public static void main (String[] args) {

        // introduction of string, string is same as in python it can store sequence of characters.
        String mystring = "Iam going to become a great programmer";
        System.out.println(mystring);

        mystring = mystring + " This is more";  // changing the variable's value
        System.out.println(mystring);

        mystring += " \u00A9 2021";
        System.out.println(mystring);
        String  newstring = "f";   // char - ' ' while string - " "
        System.out.println(newstring);

        int my = 10;
        String laststring = "50";
        laststring = laststring + my;   // java converts my to string and append to laststring.
        System.out.println(laststring);
        System.out.println();
        double myd = 20.44;
        laststring += myd;  // java converts double to string
        System.out.println(laststring);

        // STRINGS ARE IMMUTABLE AS SAME IN PYTHON.  laststring is everytime created and discarded in the above code.




    }
}
