public class vipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public vipCustomer() { // empty constr.
        this("default name", 200000, "skured");
    }
    public vipCustomer(String name, double amount, String email) { // major constructor.
        this.name = name;
        this.creditLimit = amount;
        this.emailAddress = email;
        System.out.println("Account created with limit "+getCreditLimit()+" of Mr/Ms "+getName());
    }

    public vipCustomer(String name) {  // one of the contrucotor.
        this(name, 200000, "sdeepak0788@mgial.cim");
    }

    private String getName() {
        return this.name;
    }

    private double getCreditLimit() {
        return this.creditLimit;
    }

    public static void main (String[] args) {
        vipCustomer newacc = new vipCustomer();
        System.out.println();
        vipCustomer newacc1 = new vipCustomer("deepak");
        vipCustomer newacc2 = new vipCustomer("rahul", 200000, "sddeeesfds");
        System.out.println(newacc1.creditLimit);
    }


}
