import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean contains(Contact contact)  {
        return myContacts.contains(contact);
    }

    public void addContact(Contact contact) {
        if(contains(contact)){
            myContacts.add(contact);
        }
    }

    


}
