

public class Contact {
    private String name;
    private String number;

    public Contact(String n, String num) {
        name = n;
        number = num;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Contact creatContact(String name, String number) {
        this.name = name;
        this.number = number;
        return new Contact(name, number);
    }


}
