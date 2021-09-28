public class primitivedatatypes {
    public static void main(String[] args) {
        int myvalue = 10000;
        int maxvalue = Integer.MAX_VALUE;  // max and min value that can be stored by an integer data type.
        int minvalue = Integer.MIN_VALUE;
        System.out.println("Max value is "+maxvalue);
        System.out.println("Min value is "+minvalue);
        System.out.println("busted max value is "+(maxvalue+ 1));  // overflow the value switches once exceed it's limit
        System.out.println("Busted min value is "+(minvalue-1));  // under flow

        // BYTE AND SHORT
        byte minbytevalue = Byte.MIN_VALUE;
        byte maxbytevalue = Byte.MAX_VALUE;
        System.out.println("Min byte value is "+minbytevalue);
        System.out.println("Max byte value is "+maxbytevalue);
        System.out.println();

        short minshortvalue = Short.MIN_VALUE;
        short maxshortvalue = Short.MAX_VALUE;
        System.out.println("Min short value is "+minshortvalue);
        System.out.println("Max short value is "+maxshortvalue);

        //LONG

        long minlongvalue = Long.MIN_VALUE;
        long maxlongvalue = Long.MAX_VALUE;
        System.out.println("Min long value is "+minlongvalue);
        System.out.println("Max long value is "+maxlongvalue);
        long minevalue = 2322423L;    // place L after the long value
        System.out.println(minevalue);

        int mytotal = myvalue/2;
        byte newbytevalue = (byte) (maxbytevalue/2);   // java takes the rhs as int bcos it is default so we need to convert it
        //using casting
        short newshortvalue = (short) (maxshortvalue/2);
        System.out.println("new byte is "+newbytevalue);

        // we can use casting to convert one datatype to another.



    }
}
