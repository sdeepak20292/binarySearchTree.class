public class Sub extends Super {  // this is my subclass of the super class Super;
    // will inherit all the fields and methods.
//    private int z;
//
    public void multiply(int x, int y) {
        z = x*y;
        System.out.println("z = "+z);
    }
//
//    public static void main (String[] args) {
//        Sub subclass = new Sub();
//        subclass.add(3, 5);
//        subclass.multiply(4, 12);
//        subclass.suubstract(6, 7);
//    }

    // super keyword is similar to this keyword, super is used to refer the fields and methods of superclass when the
    // names are same
    // while this is used for the subclass.

    //USING THE SUPER KEYWORD.
    private int num = 10;

    public void display() {
        System.out.println("This is display method of subclass");
    }

    public void myMethod() {
         // calling display method of subclass.
        Sub subclass = new Sub();
        super.display(); // calling display method of superclass
        subclass.display();
        System.out.println(subclass.num);
        System.out.println(super.num);
    }

    public static void main (String[] args) {
        Sub subclass = new Sub();
        subclass.myMethod();
    }

}
