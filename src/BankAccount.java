public class BankAccount {
    private String CustomerName;
    private String CustomerEmail;
    private String CustomerNumber;
    private String AccountNumber;
    private double Balance;

    // instead of using setters we can use constructors to set the values of our fields.

    public BankAccount() {  // empty constructor
        this("Default name", "sfdfds.@com", "default number", "default accnumber",
                1000); // should be first statement in the contr. body

        // we can call the below constructor within this const. if empty constr. is called so that we have some
        // values for our fields.

        System.out.println("Empty constructor called!!");



    }

    public BankAccount(String customerName, String customerNumber, double balance) {
        this(customerName, "default email", customerNumber, "default acc number", 999);
//        CustomerName = customerName;
//        CustomerNumber = customerNumber;
//        Balance = balance;
    }

    public BankAccount(String name, String email, String number, String accNumber, double balance){ // MAJOR CONSTR.
        System.out.println("para constr. called");
        CustomerEmail = email;
        CustomerName = name;
        Balance = balance;
        CustomerNumber = number;
        AccountNumber = accNumber;
        // constructor with parameters.
    }

    public void Deposit(double amount) {
        Balance += amount;
    }

    public void Withdraw(double amount) {
        if (Balance - amount >= 0) {
            double RemaningBalance = Balance - amount;
            Balance -= amount;
            System.out.println(amount + " debited from your bank");
            System.out.println("Remaining balance is "+RemaningBalance);
        }
        else{
            System.out.println("Not enough money currently!!");
        }
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        CustomerNumber = customerNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
}
