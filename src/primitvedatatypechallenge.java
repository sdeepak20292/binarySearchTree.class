public class primitvedatatypechallenge {

    public static void main(String[] args) {
        byte bvalue = 20;
        short svalue  = 30;
        int ivalue = 100;
        long lvalue = 45L;
        long total = lvalue * (bvalue + svalue + ivalue);  // we didnot have to do casting for long. as it works fine
        //with int
        System.out.println(total);
        // int and long prefered data types.
    }
}
